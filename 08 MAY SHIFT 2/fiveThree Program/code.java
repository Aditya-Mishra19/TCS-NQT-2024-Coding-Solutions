import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static String solve(List<String> arr) {
        StringBuilder result = new StringBuilder();
        for (String n : arr) {
            int num = Integer.parseInt(n);
            if (num % 3 == 0 && num % 5 == 0) {
                result.append("ThreeFive ");
            } else if (num % 5 == 0) {
                result.append("Five ");
            } else if (num % 3 == 0) {
                result.append("Three ");
            } else {
                result.append(num).append(" ");
            }
        }
        return result.toString();
    }

    public static void inputArrayFormat1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String input = scanner.nextLine();
        input = input.replaceAll("[\\[\\]]", ""); // Remove '[' and ']'
        String[] elements = input.split("\\s+");
        List<String> arr = new ArrayList<>();
        for (String element : elements) {
            arr.add(element);
        }
        System.out.println(solve(arr)); // Print the result
        scanner.close();
    }

    public static void main(String[] args) {
        inputArrayFormat1();
    }
}
