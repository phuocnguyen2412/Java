import java.util.Scanner;
public class UocNguyenTo {
    public static boolean isPrime(long n){
        if (n < 2 ) return false;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        
        for (int i = 2 ; i <= n ; i++) {
            if(n%i == 0 && isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
