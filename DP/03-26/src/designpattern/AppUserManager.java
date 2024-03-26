package designpattern;
import java.util.ArrayList;
import java.util.List;

public class AppUserManager {
    private List<AppUser> appUserList;

    public AppUserManager() {
        this.appUserList = new ArrayList<>();
        appUserList.add(new AppUser("adsfasdfa", "000000"));
        appUserList.add(new AppUser("adsfasdfb", "000000"));
        appUserList.add(new AppUser("adsfasdfc", "000000"));
    }

    public List<AppUser> getAppUserList() {
        return appUserList;
    }
}