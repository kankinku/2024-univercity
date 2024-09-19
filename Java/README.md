# 제어문
### 제어문의 필요성
1. 제어문의 종류

   a. 조건문, 반복문, 분기문

   -> 조건문 : if | 반복문 : for, while | 분기문
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
3. 
