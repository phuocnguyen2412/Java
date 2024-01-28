import java.util.Scanner;
public class BCNN {
    public static void main(String[] args) {
        long a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextLong();
        b = input.nextLong();
        long max = (a>b)? a : b;
        long i = 2;
        long result = max;
        while(result%b != 0 || result%a != 0) {
            result = max*i;
            i++;
        }
        System.out.println(result);
}}
