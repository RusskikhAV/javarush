import java.util.Scanner;

public class JSzeroLv3lc7task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 5)
            System.out.println("число меньше 5");
        if (number > 5)
            System.out.println("число больше 5");
        if (number == 5)
            System.out.println("число равно 5");
    }
}
