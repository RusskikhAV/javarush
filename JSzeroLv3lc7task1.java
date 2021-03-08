import java.util.Scanner;

public class JSzeroLv3lc7task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int max = numberA >= numberB ? numberA : numberB;
        System.out.println(max);
    }
}
