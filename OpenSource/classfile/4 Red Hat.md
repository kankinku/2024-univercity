# 4. Red Hat

## 1. 소프트웨어 설치 및 업데이트

### a. Package

- 어플과 같이 해당 프로그램을 실행하기 위해 필요한 파일들을 모아 놓은 것
- RPM, YUM

### b. 기존 사용한 프로그램 설치법

- Github
- rpm

→ 의존성 관리의 문제가 생긴다.

## 2. 설치

### sudo : root권한으로 실행

1. Install tree
    1. sudo yum install tree → sudo apt install tree (ubuntu에서 apt를 사용한다.)
2. Install check
    1. tree —version

## 3. 커맨드라인 액세스

### Bash 쉘을 사용한 명령 실행

1. tail : Output the last 10 lines of the file
2. Ctrl + a / Ctrl + e : Move the cursor to the beginning/ back of the line

## 4. 커맨드 라인에서 파일 관리

### 경로

1. 절대 경로
    - /로 시작하는 경로
    - 설정 파일, 스크립트에서 사용
2. 상대 경로
    1. 현재 위치를 기준으로 지정하는 경로
    2. 깊숙이 들어가 작업할 때, 편의성을 위해 사용

![image.png](./image/image.png)

### 실습:

![image.png](./image/image%201.png)

### 링크

1. 하드링크 (ln)
    1. inode를 가르킴, 즉 이름이 다른 똑같은 파일
2. 소프트 링크 (ln -s)
    1. 파일 이름을 가르킨다.