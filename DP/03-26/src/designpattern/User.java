package designpattern;

public class User {
    private String id;
    private String password;
    private String appId;
    private String appPassword;

    public User(String id, String password, String appId, String appPassword) {
        this.id = id;
        this.password = password;
        this.appId = appId;
        this.appPassword = appPassword;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppPassword() {
        return appPassword;
    }
}