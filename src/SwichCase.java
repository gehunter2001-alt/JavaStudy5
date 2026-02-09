import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите новое сообщение:");
            String input = new Scanner(System.in).nextLine();

            switch (input) {
                case "Привет!" -> System.out.println("Привет");
                case "Как дела?" -> {
                    System.out.println("Отлично");
                    System.out.println("У тебя как?");
                }
                default -> System.out.println("сообщение не распознано");
            }
        }
    }
}
