import java.util.Scanner;

public class JSzeroLv3lc3task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int temperature = console.nextInt();

        if (temperature < 0)
            System.out.println("на улице холодно");
        else
            System.out.println("на улице тепло");
    }
}
