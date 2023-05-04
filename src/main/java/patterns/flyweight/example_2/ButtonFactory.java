package patterns.flyweight.example_2;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ButtonFactory {

    private static final Map<String, Button> buttons = new HashMap<>();

    public static Button getButton(String label) {
        Button button = buttons.get(label);
        if (button == null) {
            button = new Button(label);
            buttons.put(label, button);
        }
        return button;
    }
}
