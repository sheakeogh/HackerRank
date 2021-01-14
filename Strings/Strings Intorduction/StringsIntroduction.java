import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int lengthA = A.length();
        int lengthB = B.length();
        int n = 0;
        System.out.println(lengthA + lengthB);

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String A1 = A.substring(0, 1);
        String A2 = A.substring(1, lengthA);
        A1 = A1.toUpperCase();
        String B1 = B.substring(0, 1);
        String B2 = B.substring(1, lengthB);
        B1 = B1.toUpperCase();
        System.out.println(A1 + A2 + " " + B1 + B2);
    }
}
