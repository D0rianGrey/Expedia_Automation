package practice;

public class File1 {
    public static void main(String[] args) {
        String name = "John Doe";
        String s = "Hi %s".formatted(name);
        System.out.println(s);
    }
}
