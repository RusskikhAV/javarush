import java.util.Scanner;

public class JSzeroLv3lc6task1 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a + b);
        int e = (b + c);
        int f = (a + c);
        if((a < e) && (b < f) && (c < d))
            System.out.println(TRIANGLE_EXISTS);
        if((a >= e) || (b >= f) || (c >= d))
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
