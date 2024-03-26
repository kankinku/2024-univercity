package designpattern;
import java.util.List;
import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        List<User> userList = userManager.getUserList();

        Scanner scanner = new Scanner(System.in);

        System.out.print("ID를 입력하세요: ");
        String inputId = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String inputPsword = scanner.nextLine();

        boolean isAuthenticated = false;
        User authenticatedUser = null;
        for (User user : userList) {
            if (user.getId().equals(inputId) && user.getPassword().equals(inputPsword)) {
                isAuthenticated = true;
                authenticatedUser = user;
                break;
            }
        }

        if (isAuthenticated) {
            System.out.println("인증 성공");

            AppUserManager appUserManager = new AppUserManager();
            List<AppUser> appUserList = appUserManager.getAppUserList();

            boolean isAppAuthenticated = false;
            for (AppUser appUser : appUserList) {
                if (appUser.getAppId().equals(authenticatedUser.getAppId())
                        && appUser.getAppPassword().equals(authenticatedUser.getAppPassword())) {
                    isAppAuthenticated = true;
                    break;
                }
            }

            if (isAppAuthenticated) {
                System.out.println("AppUser 인증 성공");
            } else {
                System.out.println("AppUser 인증 실패");
            }
        } else {
            System.out.println("인증 실패");
        }

        scanner.close();
    }
}