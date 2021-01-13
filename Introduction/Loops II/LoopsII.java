import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        for (int i = 0; i < nums; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = (int)(sum + (b * Math.pow(2, j)));
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
