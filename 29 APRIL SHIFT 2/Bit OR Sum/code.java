import java.util.*;

public class SubarrayBitwiseORs {
    public static int subarrayBitwiseORs(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        for (int num : arr) {
            int right = res.size();
            res.add(num);
            for (int i = left; i < right; ++i) {
                int value = res.get(i) | num;
                if (res.get(res.size() - 1) != value) {
                    res.add(value);
                }
            }
            left = right;
        }
        Set<Integer> resultSet = new HashSet<>(res);
        return resultSet.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(subarrayBitwiseORs(arr));
        scanner.close();
    }
}
