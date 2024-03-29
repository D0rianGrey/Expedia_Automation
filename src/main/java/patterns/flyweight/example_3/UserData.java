package patterns.flyweight.example_3;

import lombok.Data;

@Data
public class UserData {
    private String username;
    private String password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
