package designpattern;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        this.userList = new ArrayList<>();
        //ID, Password and AppID , AppPassword 추가하려면 여기에 추가
        userList.add(new User("Jinu", "1234" , "adsfasdfa", "000000"));
        userList.add(new User("user2", "password2" , "adsfasdfb", "000000"));
        userList.add(new User("user3", "password3" , "adsfasdfc", "000000"));
    }

    // 사용자 정보를 가져오는 메서드
    public List<User> getUserList() {
        return userList;
    }
}