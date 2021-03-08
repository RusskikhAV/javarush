import java.util.Scanner;

public class JSzeroLv4lc3task2 {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int n = 0;
        while (n < 10)
        {
            System.out.println(a + text);
            n++;
        }

    }
}
