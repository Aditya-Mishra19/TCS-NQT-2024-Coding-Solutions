import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortBySwap {

    public static List<Character> sortBySwap(char[] arr, int N) {
        int left = 0;
        int mid = 0;
        int right = N - 1;
        while (mid <= right) {
            if (arr[mid] == '3') {
                char temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            } else if (arr[mid] == '6') {
                mid++;
            } else if (arr[mid] == '7') {
                char temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }
        List<Character> result = new ArrayList<>();
        for (char c : arr) {
            result.add(c);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter space-separated elements: ");
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        List<Character> sortedArr = sortBySwap(arr, arr.length);
        for (char c : sortedArr) {
            System.out.print(c + " ");
        }
    }
}
