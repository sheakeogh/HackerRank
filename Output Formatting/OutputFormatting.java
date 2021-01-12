import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int b = scan.nextInt();
        String c = scan.next();
        int d = scan.nextInt();
        String e = scan.next();
        int f = scan.nextInt();
        scan.close();

        System.out.println("================================");
        System.out.printf("%-15s%03d\n", a, b);
        System.out.printf("%-15s%03d\n", c, d);
        System.out.printf("%-15s%03d\n", e, f);
        System.out.println("================================");
    }
}
