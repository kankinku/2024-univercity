# 5. Linux - Basic

### Shell Command

1. *

```powershell
ls -a* : 모든것을 조회해봄
# *은 모든것을 의미한다. 
```

1. {} 

```powershell
{/usr}{/bin/lib} # 둘중 하나의 의미를 갖는다.
```

1. grep
2. ls

# File Permission : rwx-rwx-rwx

## (ugo : User Group Other)

### 1. read

- file을 읽을 수 있는지 여부 (내용을 볼 수 있는지)
- Directory : 디렉토리에 포함된 파일 리스트를 볼 수 있는지

### 2. write

- file : 파일 작성할 수 있는지 여부
- Directory : 디렉토리에 파일을 추가할 수 있는지 여부

### 3. execute

- file
- Directory : 찾아서 들어갈 수 있다.
    
    →  - - x : 디렉토리에 뭐가 있는지 알수가 없는데, 디렉토리에 무슨파일이 있는지 알고 있다면 실행가능
    
    **→ 조회는 불가능하지만 실행(read가 없어도)은 가능하다.**
    

# Command

### 1. chmod : change **mod**e

```powershell
chmod ug = rw , o-rw, a-x *.txt
# means rw-rw----
```

### 2. find : Finding files : 시간이 많이 걸린다.

```powershell
$ find . -name "*.txt" -print
# 위치(상대)   txt로 끝나는  프린트해라

# 인덱싱 기능을 활용하면 조금 빨리 찾는것이 가능하다.
# find -> locate : 활용하면 빨리 찾는것이 가능하다 -> 위치 DB가 있어야한다.
```

```powershell
$ find - -name "*.c" -exec wc {} ";"
# 뭔뜻이고 이게
#  각 파일에 대해 wc 명령어를 실행하는 형태입니다
```

### 3. grep : finding text in files

```powershell
$ grep hello *.txt  
# 모든 txt파일에서 hello를 찾아
$ grep hello `find . -name "*.txt" -print`
# find 해서 나온 결과를 hello
```

### 4. Regular Expression Syntax

```powershell
* : all
[abc]
# ppt내용 보고 내용 입력하기
```

### 5. Compression / Backup

- 디렉토리 압축 1단계 : **tar**

```powershell
$ tar cvf new_file.tar dirname
$ tar cvf new_file.tar filenames
$ tar xvf new_file.tar

# tar : 여러 파일을 붙여둔다 (압축이 아님)
```

- 디렉토리 압축 2단계 : gzip

```powershell
$ gzip new_file.tar
$ gunzip new_file.tar.gz

# gzip : tar로 붙여진 파일을 압축한다. 

# 그누 프로젝트로 시작된 파일은 앞에 g가 붙는다 (거의)
```

### 6. pip / Redirection : 여러개의 명령을 이어서 사용 가능

```powershell
$ Output : > 
$ Append : >>
$ Input : <
$ Pipe : |
```

```powershell
$ cat file1.txt file2.txt > file12.txt
$ cat file3.txt >> file12.txt
$ program < file12.txt
$ cat *.txt | grep hello  # 앞 명령어의 출력을 뒤 명령어의 입력으로 변환한다.
$ cat *.txt | grep hello | wc > out.txt
```

### 7. Process

```powershell
$ pstree -hapun | more
```