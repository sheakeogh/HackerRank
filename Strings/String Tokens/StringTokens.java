import java.util.*;

public class myClass {
    private static String remove(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return s.substring(i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = remove(s);
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] arr = s.split("[^a-zA-Z]+");
        System.out.println(arr.length);
        for (String value : arr) {
            System.out.println(value);
        }
    }
}
