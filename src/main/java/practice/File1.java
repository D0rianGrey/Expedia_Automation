package practice;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

interface IFlyable {
    default void fly() {
        System.out.println("Flying");
    }
}

interface IMakeSound {
    default void makeSound() {
        System.out.println("Chick-chick");
    }
}

interface Selenide {
    SelenideElement selenide = $("erewr");

    default void click() {
        selenide.click();
    }
}

class Bird implements IFlyable, IMakeSound {

}

public class File1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.makeSound();
    }
}


