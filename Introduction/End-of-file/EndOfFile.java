import java.io.*;
import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;

        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            if(s.contains("end-of-file")) {
                i++;
                System.out.println(i + " " + s);
                break;
            }
            else {
                i++;
                System.out.println(i + " " + s);
            }
        }

        scan.close();
    }
}
