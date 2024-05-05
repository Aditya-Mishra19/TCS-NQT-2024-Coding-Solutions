import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        // Max values
        int emp1 = arr[N - 1];
        int emp2 = arr[N - 2];
        int emp3 = arr[N - 3];

        // Negative case
        int neg1 = arr[0];
        int neg2 = arr[1];

        System.out.println(Math.max(emp1 * emp2 * emp3, neg1 * neg2 * emp1));
    }
}
