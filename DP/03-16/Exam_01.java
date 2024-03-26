package method;

import java.util.Scanner;

public class Exam_01 {

  public static void regi(Scanner sc, String[] userId, String[] userPw, String[] userName, String[] userPhone,
      String[] userAddress) {
    int count = 0;
    while (count < userId.length) {
      System.out.print("ID 입력 : ");
      userId[count] = sc.next();

      if (count == 0) {
        System.out.print("PW 입력 : ");
        userPw[count] = sc.next();
        System.out.print("이름 입력 : ");
        userName[count] = sc.next();
        System.out.print("전화번호 입력 : ");
        userPhone[count] = sc.next();
        System.out.print("주소 입력 : ");
        userAddress[count] = sc.next();
        System.out.println("----------------------");
        count++;
      } else {
        boolean over = true;
        for (int j = (count - 1); j >= 0; j--) {
          if (userId[count].equals(userId[j])) {
            System.out.println("[동일한 ID입니다. 다시 입력하세요.]");
            over = false;
            break;
          }
        }
        if (over) {
          System.out.print("PW 입력 : ");
          userPw[count] = sc.next();
          System.out.print("이름 입력 : ");
          userName[count] = sc.next();
          System.out.print("전화번호 입력 : ");
          userPhone[count] = sc.next();
          System.out.print("주소 입력 : ");
          userAddress[count] = sc.next();
          System.out.println("----------------------");
          count++;
        }
      }
    }
  }

  public static void print(String[] userId, String[] userName, String[] userAddress, String[] userPhone,
      String[] userPw) {
    System.out.println("====== 전체 사용자 출력 ======");
    for (int i = 0; i < userId.length; i++) {
      System.out.println("ID :" + userId[i]);
      System.out.println("이름:" + userName[i]);
      System.out.println("주소:" + userAddress[i]);
      System.out.println("번호: " + userPhone[i]);
      System.out.println("비밀번호: " + userPw[i]);
      System.out.println("----------------------");
    }
  }

  public static void search(String suserId, String[] userId, String[] userName, String[] userAddress,
      String[] userPhone, String[] userPw) {
    for (int i = 0; i < userId.length; i++) {
      if (userId[i].equals(suserId)) {
        System.out.println("ID:" + userId[i]);
        System.out.println("이름:" + userName[i]);
        System.out.println("주소:" + userAddress[i]);
        System.out.println("번호: " + userPhone[i]);
        System.out.println("비밀번호: " + userPw[i]);
        System.out.println("----------------------");
        return;
      }
    }
    System.out.println("[일치하는 ID가 없습니다.]");
  }

  public static void modify(Scanner sc, String suserId, String[] userId, String[] userName, String[] userAddress,
      String[] userPhone, String[] userPw) {
    for (int i = 0; i < userId.length; i++) {
      if (userId[i].equals(suserId)) {
        System.out.println("ID : " + userId[i]);
        System.out.println("이름 : " + userName[i]);
        System.out.print("주소 입력 : ");
        userAddress[i] = sc.next();
        System.out.print("전화번호 입력 : ");
        userPhone[i] = sc.next();
        System.out.print("비밀번호 입력 : ");
        userPw[i] = sc.next();
        System.out.println("----------------------");
        return;
      }
    }
    System.out.println("[일치하는 ID가 없습니다.]");
  }

  public static void delete(String suserId, String[] userId, String[] userName, String[] userAddress,
      String[] userPhone, String[] userPw) {
    for (int i = 0; i < userId.length; i++) {
      if (userId[i].equals(suserId)) {
        userId[i] = null;
        userName[i] = null;
        userAddress[i] = null;
        userPhone[i] = null;
        userPw[i] = null;
        System.out.println("ID가 " + suserId + "인 사용자 정보가 삭제되었습니다.");
        System.out.println("----------------------");
        return;
      }
    }
    System.out.println("[일치하는 ID가 없습니다.]");
  }

  public static void end(Scanner sc) {
    sc.close();
    System.exit(0);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("사용자 수 입력 : ");
    int userCount = sc.nextInt();

    String[] userId = new String[userCount];
    String[] userPw = new String[userCount];
    String[] userName = new String[userCount];
    String[] userAddress = new String[userCount];
    String[] userPhone = new String[userCount];

    while (true) {
      System.out.println("**** 사용자 관리 프로그램 ****");
      System.out.println("1.사용자 등록");
      System.out.println("2.전체 출력");
      System.out.println("3.사용자 조회");
      System.out.println("4.정보 수정");
      System.out.println("5.사용자 삭제");
      System.out.println("6.프로그램 종료");

      System.out.print("옵션 번호를 입력하세요. : ");
      int num = sc.nextInt();
      System.out.println("----------------------");

      if (num < 1 || num > 6) {
        System.out.println("[잘못된 옵션 번호입니다. 다시 입력하세요.]");
      } else {
        switch (num) {
          case 1:
            System.out.println("[사용자를 등록합니다.]");
            regi(sc, userId, userPw, userName, userPhone, userAddress);
            break;

          case 2:
            print(userId, userName, userAddress, userPhone, userPw);
            break;

          case 3:
            System.out.println("[사용자를 조회합니다.]");
            System.out.print("ID를 입력하세요. : ");
            search(sc.next(), userId, userName, userAddress, userPhone, userPw);
            break;

          case 4:
            System.out.println("[사용자 정보를 수정합니다.]");
            System.out.print("ID를 입력하세요. : ");
            modify(sc, sc.next(), userId, userName, userAddress, userPhone, userPw);
            break;

          case 5:
            System.out.println("[사용자를 삭제합니다.]");
            System.out.print("삭제할 사용자의 ID를 입력하세요. : ");
            delete(sc.next(), userId, userName, userAddress, userPhone, userPw);
            break;

          default:
            System.out.println("[프로그램을 종료합니다.]");
            end(sc);
            break;
        }
      }
    }
  }
}