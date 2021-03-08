import java.util.Scanner;

/*
Суммирование
*/

public class JSzeroLv4lc3task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = "ENTER";
        boolean exit = false;
        int x = 0;
        while (!exit) {
            String string = scanner.nextLine();
            if (!string.equals(enter))
            {
                x = x + Integer.parseInt(string);
            }
            else {
                System.out.println(x);
                exit = true;
            }
        }
    }
}