public class JSzeroLv4lc3task5notmy {
    public static void main(String[] args){
        int n = 1;
        while (n <= 10){
            int m = 1;
            while (m <= 20) {
                if (n == 1 || n == 10) {
                    System.out.print("Б");
                }
                else if (m == 1 || m == 20){
                    System.out.print("Б");
                }
                else {
                    System.out.print(" ");
                }
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
