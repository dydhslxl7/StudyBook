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
> 파티션 분할 명령어  
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
> RAID 구축  
> fdisk -l /dev/sdb; fdisk -l /dev/sdc  
> mdadm --create /dev/md9 --level=linear --raid-devices=2 /dev/sdb1 /dev/sdc1  
> mdadm --detail --scan  
> mkfs.ext4 /dev/md9  
> mkdir /raidLinear  
> mount /dev/md9 /raidLinear  
> df  
> vi /etc/fstab -> /dev/md9 /raidLinear ext4 defaults 1 2  
