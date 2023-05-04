package patterns.flyweight.example_2;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        Button loginButton = ButtonFactory.getButton("Войти");
        Button cancelButton = ButtonFactory.getButton("Отмена");
        Button saveButton = ButtonFactory.getButton("Сохранить");
    }
}
