import java.util.*;

public class myClass {
    static int B = 0;
    static int H = 0;
    static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);
        flag = false;
        B = scan.nextInt();
        H = scan.nextInt();

        if(B > 0 && H > 0) {
            flag = true;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
