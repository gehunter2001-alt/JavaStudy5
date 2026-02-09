import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        int attempt = -1;

        while (attempt != value){
            System.out.println("Введите число от 0 до 100");
            attempt = new Scanner(System.in).nextInt();

            if (attempt > value) {
                System.out.println("Ваше число больше загаданного");
            } else if (attempt < value) {
                System.out.println("Ваше число меньше загаданного");
            }
        }

        System.out.println("Вы угадали");
    }
}
