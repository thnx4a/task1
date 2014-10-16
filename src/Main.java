import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100");

        Random rnd = new Random();
        int number = 1 + rnd.nextInt(100);
//        number=10;

        Scanner scanner = new Scanner(System.in);
        int yourNumber;
        boolean isCorrect = false;
        for (int i = 0; i < 8; i++) {
            if (scanner.hasNextInt()) {
                yourNumber = scanner.nextInt();
                scanner.nextLine();
                if (yourNumber == number) {
                    System.out.println("Поздравляю, Вы угадали!!!");
                    isCorrect = true;
                    break;
                } else System.out.println((yourNumber > number ? "Ваше число больше" : "Ваше число меньше"));
            } else {
                System.out.println("number expected; " + scanner.nextLine());
                i--;
            }
        }
        System.out.println(isCorrect ? "Поздравляю, вы угадали!!!" : "Попытки закончились! Число - " + number);

    }
}
