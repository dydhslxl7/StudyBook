# 하드디스크  
  
#### 1-1. IDE 장치와 SCSI 장치 구성  
> 메일보드의 IDE0, IDE1 슬롯에는 각각 2개의 IDE 장치 장착 가능  
> IDE 0:0, IDE 0:1, IDE 1:0, IDE 1:1 로 표기  
> 리눅스에서는 처음 장착된 SCSI 하드디스크의 이름을 /dev/sda라고 부른다.  
> 그 이후는 /dev/sdb, /dev/sdc, /dev/sdd 등  
> 파티션은 순차적으로 1, 2, 3,....  

#### 1-2. 하드디스크 추가  
> 리눅스에서는 파티션을 반드시 그냥 사용할 수 없고 특정 디렉터리에 마운트시켜야 한다.  

#### 2. 여러 개의 하드디스크 하나처럼 사용
> RAID : 여러 개의 하드디스크를 하나의 하드디스크처럼 사용하는 방식  
> 	Linear RAID, RAID 0, RAID 1, RAID 2, RAID 3, RAID 4, RAID 5  
> 	Linear RAID, RAID 0, RAID 1, RAID 5, RAID 6, RAID 1+0  
>   
> ##### * 파티션 분할 명령어  
> fdisk /dev/sdb   
> Command : n  
> Select : p  
> Partition number : 1  
> First sector : enter  
> Last sector : enter  
> Command : t  
> Hex Code : fd  
> Command : p  
> Command : w  
>   
> ##### * RAID 구축  
> fdisk -l /dev/sdb; fdisk -l /dev/sdc  
> mdadm --create /dev/md9 --level=linear --raid-devices=2 /dev/sdb1 /dev/sdc1  
> mdadm --detail --scan  
> mkfs.ext4 /dev/md9  
> mkdir /raidLinear  
> mount /dev/md9 /raidLinear  
> df  
> vi /etc/fstab -> /dev/md9 /raidLinear ext4 defaults 1 2  
> 
> ##### * Linear RAID, RAID 0, RAID 1, RAID 5에서 문제 발생과 조치 방법  
> 기존의 하드디스크 중 몇개를 망가지면 장치가 없어지는 것이 아니라 하나씩 밀리게 된다.  
> RAID 1, 5는 '결함 허용'기능이 있다. 즉, 하드디스크에 문제가 발생해도 저장된 데이터는 안전하다.  
> RAID로 구성된 하드디스크가 고장 나면 일단 응급 모드로 접속된다.  
> mdadm --run /dev/md9  
> mdadm --stop /dev/md9  
> 
> ##### * Linear RAID, RAID 0, RAID 1, RAID 5의 원상복구  
> 하드디스크를 추가하면 차례대로 비어 있는 SCSI 장치에 장착된다.  
> 기존에 [SCSI 0:6(/dev/sdg)]가 고장 났으므로, 반드시 [SCSI 0:6]에 새로운 하드디스크를 장착할 필요가 없다.  
> raid0에 파일이 보여도 이 파일은 정상 파일이 아닌 50%만 정상인 파일이다.(파일 크기가 기존과 동일해도 실제 내용의 50%는 비었다고 보면 된다.) 그러므로 RAID0를 복구한 후에는 mkfs 명령으로 깨끗이 포맷하는 것이 좋다.  
> mdadm --stop /dev/md9  
> mdadm /dev/md1 --add /dev/sdg1  
> 
> ##### * 고급 RAID 레벨  
> RAID 6는 패리티를 2개 사용하므로 최소 4개의 하드디스크가 필요하다. 공간효율은 '하드디스크 개수 -2'다.  

#### 3. LVM
> Logical Volume Manager, 논리 하드디스크 관리자  
> 물리 볼륨 : 파티션을 말한다.  
> 볼륨 그룹 : 물리 볼룸을 합쳐서 1개의 물리 그룹으로 만든 것이다.  
> 논리 볼륨 : 볼륨 그룹을 1개 이상으로 나눈 것으로 논리적 그룹이라고도 한다.  
> 
> ##### * LVM의 구현  
> fdisk /dev/sdb   
> Command : n  
> Select : p  
> Partition number : 1  
> First sector : enter  
> Last sector : enter  
> Command : t  
> Hex Code : 8e  
> Command : p  
> Command : w  
> 
> pvcreate /dev/sdb1 /dev/sdc1 : 물리적인 볼륨 생성  
> vgcreate myVG /dev/sdb1 /dev/sdc1 : 물리 볼륨을 하나로 묶는다.  
> vgdisplay : 볼륨그룹 확인  
> lvcreate : 볼륨 그룹의 파티션을 생성할 때 사용  
> lvcreate --size 1G --name myLG1 myVG  
> lvcreate --extents 100%FREE --name myLG3 myVG  
> mkfs.ext4 /dev/myVG/myLG1  
> 
> ##### * 사용자별로 공간 할당하기
> 쿼터 : 파일 시스템마다 사용자나 그룹이 생성할 수 있는 파일의 용량과 개수를 제한하는 것
> 
> edquota -u john : 각 사용자별 또는 그룹별 할당량 편집하는 명령어
> [Filesystem]: 사용자별 쿼터를 할당하는 파일 시스템.  
> [blocks],[soft],[hard]: 현재 사용자가 사용하는 블록(KB 단위)과 소프트 사용한도, 하드 사용 한도.  
>                         [soft],[hard]의 0은 한도를 제한하지 않았다는 뜻.
> [inodes],[soft],[hard]: inode의 개수(파일의 개수).
> 
> quota : 현재 사용자가 자신에게 할당된 하드디스크 공간을 확인하는 명령어
> [blocks]: 현재 사용자가 사용하는 하드디스크 공간
> [limit](=hard): 사용량.
> [quota](=soft): 실제 사용량.
> [grace]: [quota]-[limit]의 용량은 [grace](유예기간)동안인 6일 또는 7일동안만 사용할 수 있다. 유예기간안에 정리해야 한다.
> 유예기간 변경: edquota -t










