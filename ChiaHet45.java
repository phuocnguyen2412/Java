import java.util.Arrays;
import java.util.Scanner;

public class ChiaHet45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();

        int sum = Arrays.stream(N.split("")).mapToInt(Integer::parseInt).sum();

        if (sum == 0) {
            System.out.println(N);
        } else {
            if (sum % 3 == 0) {
            
                char[] digits = N.toCharArray();
                Arrays.sort(digits);
                StringBuilder result = new StringBuilder(new String(digits));
                result.reverse();
                System.out.println(result);
            } else {
              
                System.out.println("-1");
            }
        }
    }
}
