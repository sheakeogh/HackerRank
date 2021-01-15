import java.util.*;

public class myClass {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        boolean flag;

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        flag = Arrays.equals(arrA, arrB);

        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
