import java.util.*;
import java.math.*;

public class myClass {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger num = new BigInteger(n);
        scanner.close();

        if(num.isProbablePrime(1)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
