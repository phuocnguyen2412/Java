import java.util.Scanner;

public class DemDauCach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int result = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result++;
            }
        }

        System.out.println(result);
    }
}
