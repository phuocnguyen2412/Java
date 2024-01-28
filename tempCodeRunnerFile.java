import java.util.Scanner;

public class ChiaHet45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String N = scanner.nextLine();

    


        System.out.println(findMultipleOf45(N, 0));
    }

    private static String findMultipleOf45(String s, int index) {

        if (index == s.length()) {
            return "-1";
        }

        for (int i = index; i < s.length(); i++) {
            char[] digits = s.toCharArray();
            char temp = digits[index];
            digits[index] = digits[i];
            digits[i] = temp;


            int num = Integer.parseInt(new String(digits));

            if (num % 45 == 0) {
                return Integer.toString(num);
            }

            String result = findMultipleOf45(new String(digits), index + 1);
            if (!result.equals("-1")) {
                return result;
            }
        }

     
        return "-1";
    }
}
