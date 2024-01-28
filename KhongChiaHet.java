import java.util.Scanner;

public class KhongChiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            
            long n = scanner.nextInt();
            long k = scanner.nextInt();

            long countBeforeK = (k - 1) / (n - 1);
         

            System.out.println(k + countBeforeK);
        }
    }
  
}
