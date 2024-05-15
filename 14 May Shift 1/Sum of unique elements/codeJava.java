import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNums = scanner.nextLine().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        Map<Integer, Integer> d = new HashMap<>();
        for (int num : nums) {
            if (!d.containsKey(num)) {
                d.put(num, 1);
            } else {
                d.put(num, d.get(num) + 1);
            }
        }
        int ans = 0;
        for (int key : d.keySet()) {
            if (d.get(key) == 1) {
                ans += key;
            }
        }
        System.out.print(ans);
    }
}
