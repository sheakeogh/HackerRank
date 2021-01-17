import java.util.*;

public class myClass {
    private static final Scanner scanner = new Scanner(System.in);

    public static int maxSum(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = Sum(arr, i, j);
                //max = Math.max(max, sum);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private static int Sum(int [][] arr, int row, int col) {
        return ((arr[row + 0][col + 0] + arr[row + 0][col + 1] + arr[row + 0][col + 2]) + (arr[row + 1][col + 1]) + (arr[row + 2][col + 0] + arr[row + 2][col + 1] + arr[row + 2][col + 2]));
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        
        System.out.println(maxSum(arr));
    }
}
