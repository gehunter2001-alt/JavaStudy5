import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int value = -1;
        while (value != 0) {
            System.out.println("Введите число");
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введенных чисел равна " + sum);
    }
}
