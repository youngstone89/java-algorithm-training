package arrays;
import java.util.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long min = (long)Arrays.stream(arr).min().getAsInt();
        long max = (long)Arrays.stream(arr).max().getAsInt();
        long sum = (long)Arrays.stream(arr).asLongStream().sum();

        long minsum = sum - max;
        long maxsum = sum - min;
        System.out.printf("%d %d", minsum, maxsum);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
