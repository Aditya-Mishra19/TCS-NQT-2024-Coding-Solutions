import java.util.*;

public class Main {

    public static int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int preSum = 0, cnt = 0;

        for (int num : arr) {
            preSum += num;
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] inputStrings = inputLine.split(" ");
        int[] arr = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            arr[i] = Integer.parseInt(inputStrings[i]);
        }


        int k = scanner.nextInt();

        int result = subarraySum(arr, k);
        System.out.println(result);
        
        scanner.close();
    }
}
