import java.util.Scanner;

public class factoralCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int factorial = 1;

        // Запрашиваем число, пока оно не будет в диапазоне 1-12
        while (true) {
            System.out.print("Введите число от 1 до 12: ");
            value = scanner.nextInt();

            if (value < 1 || value > 12) {
                System.out.println("Введите корректное число");
            } else {
                break;  // число корректное - выходим из цикла
            }
        }

        // Вычисляем факториал
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }

        System.out.println(value + "! = " + factorial);
        scanner.close();
    }
}