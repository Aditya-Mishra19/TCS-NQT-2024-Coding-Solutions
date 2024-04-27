import java.util.HashMap;

public class Main {
    static void bruteForce(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                curSum += arr[j];
                if (curSum == target) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    static void optimalApproach(int[] arr, int n, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if (curSum == target) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            if (sumMap.containsKey(curSum - target)) {
                int startIndex = sumMap.get(curSum - target) + 1;
                for (int k = startIndex; k <= i; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            sumMap.put(curSum, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int N = arr.length;
        int target = 7;
        optimalApproach(arr, N, target);
    }
}
