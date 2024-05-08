import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static void findMajorityElement(String[] arr, int N) {
        HashMap<String, Integer> freq = new HashMap<>();
        for (String n : arr) {
            if (freq.containsKey(n)) {
                freq.put(n, freq.get(n) + 1);
            } else {
                freq.put(n, 1);
            }
        }
        for (String key : freq.keySet()) {
            if (freq.get(key) >= N / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void findMajorityElementInt(int[] arr, int N) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        for (int key : freq.keySet()) {
            if (freq.get(key) >= N / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void inputArrayFormat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter elements in format [e1,e2,e3]: ");
        String input = scanner.nextLine().replaceAll("[\\[\\]]", "");
        String[] arr = input.split(",");
        findMajorityElement(arr, arr.length);
    }

    public static void inputSpaceSeparated() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCase 2: Enter space-separated elements: ");
        String input = scanner.nextLine();
        String[] strArr = input.split("\\s+");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        findMajorityElementInt(arr, arr.length);
    }

    public static void main(String[] args) {
        inputArrayFormat();
        inputSpaceSeparated();
    }
}
