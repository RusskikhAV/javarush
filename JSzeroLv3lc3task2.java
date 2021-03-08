import java.util.Scanner;

public class JSzeroLv3lc3task2 {
    public static void main(String[] args) {

        String militaryCommissar = ", явитесь в военкомат";

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        int age = console.nextInt();
        if (age >= 18)
            if (age <= 28)
                System.out.println(name + militaryCommissar);
    }
}
