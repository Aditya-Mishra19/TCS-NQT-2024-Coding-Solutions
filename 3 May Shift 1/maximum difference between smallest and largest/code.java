import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int solve(List<String> arr) {
        int largest = Integer.MIN_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = arr.size() - 1; i >= 0; i--) {
            try {
                int num = Integer.parseInt(arr.get(i));
                largest = Math.max(largest, num);
                maxDiff = Math.max(maxDiff, largest - num);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.err.println("Invalid input: " + arr.get(i));
            }
        }
        return maxDiff;
    }

    public static int solveInt(List<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = arr.size() - 1; i >= 0; i--) {
            int num = arr.get(i);
            largest = Math.max(largest, num);
            maxDiff = Math.max(maxDiff, largest - num);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array format
        System.out.print("Enter elements separated by commas within square brackets like [element1,element2,...]: ");
        String input = scanner.nextLine().trim();
        input = input.substring(1, input.length() - 1); // Remove square brackets
        String[] arr1 = input.split(",");
        List<String> list1 = new ArrayList<>();
        for (String s : arr1) {
            list1.add(s.trim());
        }
        System.out.println("Case 1 - [-3,-5,1,6,-7,8,11], maxdiff: " + solve(list1));

        // Input space separated
        System.out.print("Enter elements separated by spaces: ");
        String spaceSeparatedInput = scanner.nextLine().trim();
        String[] arr2 = spaceSeparatedInput.split(" ");
        List<Integer> list2 = new ArrayList<>();
        for (String s : arr2) {
            list2.add(Integer.parseInt(s));
        }
        System.out.println("Case 2: -3 -5 1 6 -7 8 11, maxdiff: SS" + solveInt(list2));

        scanner.close();
    }
}
