import java.util.Scanner;

public class GioLamBai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập thời gian hiện tại và thời gian làm bài tập
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        int x = input.nextInt();

        
        int s0 = x % 60;
        int m0 = x / 60 % 60;
        int h0 = x / 60 / 60;
       
        int s1 = (s + s0) % 60;


        int m1 = (m + m0 + (s + s0) / 60) % 60;
        int h1 = (h + h0 + (m + m0 + (s + s0) / 60) / 60) ;
        if(h1 >= 13) h1 = h1 - 12;
        

        System.out.println(h1 + " " + m1 + " " + s1);
    }
}
