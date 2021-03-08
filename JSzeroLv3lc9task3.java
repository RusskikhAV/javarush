import java.util.Scanner;

public class JSzeroLv3lc9task3 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.equalsIgnoreCase(secret))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}
