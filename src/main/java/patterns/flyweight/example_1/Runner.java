package patterns.flyweight.example_1;

public class Runner {
    public static void main(String[] args) {
        LoginData loginData1 = LoginDataFactory.getLoginData("user1", "password1");
        LoginData loginData2 = LoginDataFactory.getLoginData("user1", "password1");
        LoginData loginData3 = LoginDataFactory.getLoginData("user2", "password2");
    }
}
