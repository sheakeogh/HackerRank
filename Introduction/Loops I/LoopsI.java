import java.util.*;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", a, i, a*i);
        }
    }
}
