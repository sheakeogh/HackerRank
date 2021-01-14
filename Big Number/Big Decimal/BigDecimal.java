import java.util.*;
import java.math.*;

class myClass{
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        sc.close();

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };

        Arrays.sort(s, 0, n, myComparator);

        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}
