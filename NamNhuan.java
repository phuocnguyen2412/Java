import java.util.Scanner;
public class NamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long year = input.nextLong();
        if((year%4 == 0 && year % 100!=0) || (year%100 == 0 && year %400 == 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
