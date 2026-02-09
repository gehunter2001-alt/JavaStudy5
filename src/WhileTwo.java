import java.util.Scanner;

public class WhileTwo {
    public static void main(String[] args) {

        int secretCode = 7567;
        int pinCode = -1;

        while (pinCode != secretCode) {
            if (pinCode == -1) {
                System.out.println("Введите пин-код:");
            } else {
                System.out.println("Пин код введен неверно. Введите верный пин код");
            }
            pinCode = new Scanner(System.in).nextInt();
        }

        System.out.println("Пин-код введен верно");
    }
}
