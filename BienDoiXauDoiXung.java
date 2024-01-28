import java.util.Scanner;

public class BienDoiXauDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int T = scanner.nextInt();


        for (int i = 0; i < T; i++) {
            
            String S = scanner.next();

        String result = canMakePalindrome(S);

            System.out.println(result);
        }
    }

    private static String canMakePalindrome(String s) {
        int n = s.length();
        int count = 0;


        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                count++;
            }
        }

    
        if ((count == 1 && n % 2 == 1) || count == 2) {
            return "YES";
        }

        return "NO";
    }
}
