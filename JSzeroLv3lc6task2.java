import java.util.Scanner;

public class JSzeroLv3lc6task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a < 20 || a > 60)
            System.out.println("можно не работать");
    }
}
