package patterns.flyweight.example_3;

import java.util.HashMap;
import java.util.Map;

public class UserDataFactory {
    private static final Map<String, UserData> userDataMap = new HashMap<>();

    public static UserData getUserData(String username, String password) {
        String key = username + ":" + password;

        if (!userDataMap.containsKey(key)) {
            userDataMap.put(key, new UserData(username, password));
        }

        return userDataMap.get(key);
    }
}

