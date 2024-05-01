import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void findMajorityElement(int[] arr, int N) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int key : freq.keySet()) {
            if (freq.get(key) >= N / 2) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; ++i) {
            array[i] = scanner.nextInt();
        }
        findMajorityElement(array, N);
    }
}
