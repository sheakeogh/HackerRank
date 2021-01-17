import java.util.*;
import java.util.regex.*;

public class myClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String line = in.nextLine();
            boolean match = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matched = pattern.matcher(line);

            while(matched.find()) {
                System.out.println(matched.group(2));
                match = true;
            }

            if(! match) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
