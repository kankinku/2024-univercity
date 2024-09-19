# 제어문
### 제어문의 필요성
1. 제어문의 종류

   a. 조건문, 반복문, 분기문

   -> 조건문 : if | 반복문 : for, while | 분기문
   * 조건문에서 == 은 사용하지 않는다. -> equals를 사용한다.

2. 조건문   
* 단순 IF문을 이용한 홀짝 조사
   ```
   import java.util.Scanner;

	public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		if(number % 2 == 0)
			System.out.println("짝수!");
		if(number % 2 == 1)
			System.out.println("홀수!");
		System.out.println("종료");
		}
	}
   ```
   * if~else 문을 이용한 홀짝 조사
  ```
     import java.util.Scanner;

	public class IfElseDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		if(number % 2 == 0)
			System.out.println("짝수!");
		else
			System.out.println("홀수!");
		System.out.println("종료");
		}
	}
  ```
  * 다중 IF문을 이용한 점수 구간별 학점 부여
  ```
  import java.util.Scanner;
	public class MultiIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.println("점수를 입력하세요 : ");
		int score = in.nextInt();
		
		if(score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else 
			grade = "F";
		System.out.println("당신의 학점은 "+grade);

		}

	}
   ```
4. 
