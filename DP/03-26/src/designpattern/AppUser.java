package designpattern;

public class AppUser {
    private String appId;
    private String appPassword;

    public AppUser(String appId, String appPassword) {
        this.appId = appId;
        this.appPassword = appPassword;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppPassword() {
        return appPassword;
    }
}