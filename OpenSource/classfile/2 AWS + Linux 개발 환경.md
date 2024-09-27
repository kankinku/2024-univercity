# 2. AWS + Linux 개발 환경

<가상화> multi-user OS → 가상화가 가능한 이유 

- Time-Sharing : 0.1초 이하의 시간을 분할해서 사용함

VM의 종류

- Host-base VM
    - 하드웨어와 운영체제 위에 VM을 두고 또 OS를 생성한다.
        
        
        | OS |
        | --- |
        | VM |
        | 윈도우 |
        | 하드웨어 |
    - 이런 방식을 사용하면,  속도가 느리고 지연이 발생한다.
- bare-metal VM
    - 작동하던 원래 OS를 제거한다.
        
        
        | OS |
        | --- |
        | VM |
        | 하드웨어 |

### VM을 사용하는 이유

- 가변성에 대응하기 위해서
- 사용자 수의 변동에 따라서 사용하는 머신의 수를 조절하기 위해서
    
    Container방식을 개발하였다.
    

# Linux :

1. linux : Redhat - CentOS
2. linux : Debian - Ubuntu

# AWS - EC2

Cloud-pay-as-you-go