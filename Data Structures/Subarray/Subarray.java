import java.util.*;

public class myClass {
    public static int numOfSubArrays(int[] arr, int size) {
        int sum = 0;
        int count = 0;

        for(int j = 0; j < size; j++) {
            for(int k = j; k < size; k++) {
                sum = sum + arr[k];
                if(sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(numOfSubArrays(arr, n));
    }
}
