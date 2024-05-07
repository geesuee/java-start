package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String text = "Hello, World!";
        printText(text, 3);
        System.out.println("---");
        printText(text, 5);
        System.out.println("---");
        printText(text, 7);
    }

    public static void printText(String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }
}
