import java.util.Scanner;

public class JSzeroLv3lc9task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
