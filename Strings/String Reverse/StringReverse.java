import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        int i = 0;
        int j = A.length()-1;
        while(A.charAt(i) == A.charAt(j) && i++<j--);
        System.out.println(i > j ? "Yes" : "No");
    }
}
