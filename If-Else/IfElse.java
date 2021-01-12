import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a % 2 == 1) {
            System.out.println("Weird");
        }
        if((a % 2 == 0) && (a >= 2) && (a <= 5)) {
            System.out.println("Not Weird");
        }
        if((a % 2 == 0) && (a >= 6) && (a <= 20)) {
            System.out.println("Weird");
        }
        if((a % 2 == 0) && (a > 20)) {
            System.out.println("Not Weird");
        }
    }
}
