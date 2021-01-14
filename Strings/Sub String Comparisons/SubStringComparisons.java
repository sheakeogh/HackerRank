import java.util.*;

public class myClass {
    public static String getSmallestAndLargest(String s, int k) {
        String tmp = s.substring(0, k);
        String largest = tmp;
        String smallest = tmp;
        for(int i = 1; i <= s.length() - k; i++) {
            tmp = s.substring(i, i + k);
            if(tmp.compareTo(smallest) < 0) {
                smallest = tmp;
            }
            if(tmp.compareTo(largest) > 0) {
                largest = tmp;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
