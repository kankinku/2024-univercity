# 3. Linux - basic

## 1. System Calls and Library  Functions, Standards

### System Calls and Library Functions

- System calls are entry points into kernel code where their functions are implemented. Documented in section 2 of the manual
- Library calls are transfers to user code which performs the desired functions. Documented in section 3 of the manual

### Standards

C, POSIX 등이 있다. 

→ POSIX : 서로 다른 UNIX OS의 공통 API를 정리하여 이식성이 높은 유닉스 응용 프로그램

## 2. Linux Login, Password

### When connecting a UNIX system (locally or remotely)

```powershell
login : root
password : 
```

### After successful login, you will get shell prompt where you can give command input

$ ← 기본 설정값

exit ← 탈출(사용 종료)

root user ← 최고 관리자 (뭐든 접속 및 수정 가능)

### Password change

$ passwd

- Avoid dictionary words

## 3. Understanding /etc/passwd

### /etc/passwd

- etc : 기타등등 → 중요한게 많이 들어감
- passwd : 사용자의 정보를 텍스트로 저장한다.
    
    → 공개되도 상관 없는 데이터 : 일반 사용자는 수정 불가능하다.
    
    - It contains one entry per line for each user
        - 사용자당 7가지의 정보를 한줄에 저장한다.
            1. Username 
            2. password-x 
                - means passwords are stored in /etc/shadow
                - 암호화 되어 shadow에 저장된다. (shadow는 root만 열람가능)
            3. userID : 사용자 정보를 정수형으로 저장한다.
            4. groupID : 부서의 개념(user의 접속권한을 주기위한 분류)
            5. userID info : 
            6. home directory : /home/jinu(예시)
            7. command/shell : /bin/bash
- 지정방식의 한계 : 한명의 유저가 여러개의 group에 해당할 수 있다.
    
    → 한 그룹에만 지정할 수 있는 방식이다.
    
    - etc / group : user가 해당하는 그룹을 따로 관리하는 파일이 있다.

## 3+. GUI (vs CLI)

### GUI

~~~5분만에 끝남

- GUI를 원격으로 접속하면 단점 :
    
    GUI는 많은 양의 데이터를 전송해야 하기 때문에 대역폭이 많이 소모된다.
    
    따라서 원격 접속은 CLI를 사용한다.
    

## 4. UNIX File System

### Three types of UNIX files

1. Ordinary files : 
    - Contain text, data, program
    - Cannot contain other files or directories :
    - Filename is not divided into name and extension officially
        
        → 확장자가 의미 없다.
        
        → 리눅스의 경우는 권한으로 분별한다.
        
    - Up to 256 characters long
2. Directory file : file > Diectory file 
    - A file that has a list of other files and directories
    - 파일 내용에 다른 파일 및 디렉토리 목록이 저장되어 있다.
3. Special file : I/O device
    - Devices : for easy access to HW device,  a device is dealt with as a file.
    - HW 디바이스에 쉽게 액세스하기 위해 디바이스는 파일로 처리된다.
        - /dev/sda → SCSI마스크 : 하드웨어와 연결되어있다.
            
            ```powershell
            open("/dev/sde")
            write("1") 
            #원래는 1이 기록되어야 하지만
            #디스크에 1을 입력한다.
            ```
            

### Links

- A pointer to another file :
- hard link : direct pointer : $ln filename linkname
    
    → 
    
- soft(symbolic) link  : $ln -s filename linkname
    
    → 윈도우에서 사용한다.
    
    → 바로가기(soft link)를 실행하면 디렉토리를 직접 실행한다.
    

## 5. Directory in UNIX

### Directory

- **/**: 파일 시스템의 최상위 디렉터리인 루트 디렉터리.
- **/bin**: 기본 실행 파일들이 저장된 디렉터리 (필수적인 명령어들).
- **/usr**: 사용자가 설치한 프로그램 및 라이브러리, 공유 데이터가 저장된 디렉터리.
- **/usr/bin**: 일반 사용자용 실행 파일이 저장된 디렉터리.
- **/sbin**: 시스템 관리용 실행 파일이 저장된 디렉터리.
- **/lib**: 시스템에서 사용하는 필수적인 라이브러리 파일이 저장된 디렉터리.
- **/usr/lib**: 사용자 프로그램이 사용하는 라이브러리 파일들이 저장된 디렉터리.
- **/tmp**: 임시 파일이 저장되는 디렉터리 (시스템 재시작 시 삭제될 수 있음).
- **/home**: 사용자들의 개인 파일 및 설정 파일이 저장되는 디렉터리.
- **/etc**: 시스템 설정 파일들이 저장된 디렉터리.
- **/dev**: 하드웨어 및 주변 장치에 대한 디바이스 파일들이 저장된 디렉터리.
- **/proc**: 커널과 프로세스 정보가 가상 파일 시스템 형태로 제공되는 디렉터리.
    - System정보를 일부 넣어둠(읽기만 가능하다.) : CPU, SCSI  ,프로세스 번호
    - Ram에 저장되는 내용(휘발성 정보) → Ramdisk의 일종

### Directory

Directory

- Contains a list of files or directories and their properties/locations
- tree structure : 트리구조
- a parent may have many childs, and a child can have only one parent
    
    : 부모는 항상 하나다.
    
- Path– absolute path :       – relative path   :
- Directory
    
     /home/bongbong/a.txt
    usr/bin/xv– Home directory
    

### File Access

- Example : /usr/bin/xv
    1. Read root(/) directory
    2. Find the location of “usr” from “”
    3. Read “usr” and find the location of “bin”
    4. Read “bin” and find the location of “xv”
    
    → 길이가 길어지면 과정이 복잡해지면서 느려진다.
    

## 6. Commands for File and Directories

### Commands

- pwd : 현재 디렉토리
- cd : 디렉토리 위치 변경
- mkdir, rmdir : 디렉토리 생성 삭제
- cp, mv, rm : 복사, 이동, 삭제
- chmod :
- cat, more : 파일 읽기
- man
- ls : 파일 리스트

## 7. File Properties

- 접근 권한을 통해서 파일 열람 유무를 결정한다.
- ls -l : 상세정보 열람

### Type

block : 블록 단위로 HW와 정보교환이 진행된다면 (char단위를 사용하면 성능이 떨어짐)

char : character단위로 정보교환

### Permissions

→ 9 글자로 이루어진다.

- rwx(자기자신) / rwx(그룹) / rwx(Other) → file의 소유자가 들어가 있음
- r : Reda / w : write / x : 실행여부
    
    r - - - - - - - - : 자신만 읽을수 있다.
    
    가능하다면 r , w, ,x를 잆력하고 못하면 -로 표현한다.
    

→ permissions을 바꾸는 것과 파일을 쓴다는것은 다르다. ?