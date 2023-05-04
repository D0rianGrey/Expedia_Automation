package patterns.flyweight.example_3;

public class LoginPage {
    public void login(String username, String password) {
        UserData userData = UserDataFactory.getUserData(username, password);
        System.out.println(userData.toString());
    }
}
