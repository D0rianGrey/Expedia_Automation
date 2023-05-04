package patterns.flyweight.example_3;

import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void testLogin() {
        LoginPage page = new LoginPage();
        page.login("test_user_1", "test_password_1");
    }
}
