import java.util.*;

public class Main {
    public static void solve(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size() - k + 1; i++) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = i; j < i + k; j++) {
                maxHeap.offer(arr.get(j));
            }
            ans.add(maxHeap.peek());
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void optimalSolution(ArrayList<Integer> arr, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            maxHeap.offer(new int[]{arr.get(i), i});
        }
        ans.add(maxHeap.peek()[0]);

        for (int i = k; i < arr.size(); i++) {
            maxHeap.offer(new int[]{arr.get(i), i});
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }
            ans.add(maxHeap.peek()[0]);
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
            if (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (nextLine.isEmpty()) break;
            }
        }
        int k = scanner.nextInt();
        solve(arr, k);
        optimalSolution(arr, k);
    }
}
