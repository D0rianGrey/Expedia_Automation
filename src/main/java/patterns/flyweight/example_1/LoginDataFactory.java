package patterns.flyweight.example_1;

import java.util.HashMap;
import java.util.Map;

public class LoginDataFactory {
    private static final Map<String, LoginData> loginDataMap = new HashMap<>();

    public static LoginData getLoginData(String username, String password) {
        String key = username + password;
        LoginData loginData = loginDataMap.get(key);

        if (loginData == null) {
            loginData = new LoginData(username, password);
            loginDataMap.put(key, loginData);
        }

        return loginData;
    }
}
