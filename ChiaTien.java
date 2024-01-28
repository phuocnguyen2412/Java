import java.util.Scanner;
public class ChiaTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if(n%8 != 0){
            System.out.println("NO");
        }else{
           
            long b = 7*n/8;
            long a = (n+2*b)/2;
            long c = ( n + a - b)/2;
            System.out.println(a + " " + b + " " + c);
        }
    }
}
