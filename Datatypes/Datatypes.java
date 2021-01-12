import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            try {
                long a = scan.nextLong();
                System.out.println(a + " can be fitted in:");
                if(a >= (-(Math.pow(2, 7))) && a <= (Math.pow(2, 7) - 1)) {
                    System.out.println("* byte");
                }
                if(a >= (-(Math.pow(2, 15))) && a <= (Math.pow(2, 15) - 1)) {
                    System.out.println("* short");
                }
                if(a >= (-(Math.pow(2, 31))) && a <= (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }
                if(a >= (-(Math.pow(2, 63))) && a <= (Math.pow(2, 63) - 1)) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
