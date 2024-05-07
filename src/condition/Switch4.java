package condition;

public class Switch4 {

    public static void main(String[] args) {
        String subject = "math";

        int class_number = switch (subject) {
            case "korean" -> 1;
            case "math" -> 2;
            case "science" -> 3;
            default -> 0;
        };

        System.out.println("class_number = " + class_number);
    }
}
