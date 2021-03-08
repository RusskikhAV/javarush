public class JSzeroLv4lc3task5 {
    public static void main(String[] args) {
        String a = "Б";
        String b = " ";
        int i = 1;
        while (i == 1) {
            System.out.println(a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a);
            int m = 0;
            while (m < 8) {
                int n = 1;
                while (n < 20) {

                    //System.out.print(n);

                    if (n == 1) {
                        System.out.print(a);
                    }
                    else if (n == 20)
                        System.out.print("Б");
                    else {
                        System.out.print(b);
                    }
                    n++;
                }
                System.out.println(a);
                m++;
            }
            System.out.print(a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a + a);
            i--;
        }
    }
}