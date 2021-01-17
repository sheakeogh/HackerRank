import java.util.*;
import java.util.regex.*;

public class myClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        for(int i = testCases; i > 0; i--) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
