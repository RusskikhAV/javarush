import java.util.Scanner;

public class JSzeroLv3lc5task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if(a == b)
            if(b == c)
                System.out.println(a + " " +  b + " " +  c );
        if(a == b)
            if(b != c)
                System.out.println(a + " " +  b );
        if(a != b)
            if(b == c)
                System.out.println(b + " " +  c );
        if(a != b)
            if(b != c)
                if(a == c)
                    System.out.println(a + " " +  c );
    }
}
