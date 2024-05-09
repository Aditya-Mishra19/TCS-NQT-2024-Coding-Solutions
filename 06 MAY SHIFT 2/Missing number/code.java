import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getMissingNumIntFormat(List<Integer> arr, int size) {
        int totalSum = 0;
        int n = size + 1;
        for (int num : arr) {
            totalSum += num;
        }
        int actualSum = (n * (n + 1)) / 2;
        return actualSum - totalSum;
    }

    public static int getMissingNumStrFormat(List<String> arr, int size) {
        int totalSum = 0;
        int n = size + 1;
        for (String str : arr) {
            int num = Integer.parseInt(str);
            totalSum += num;
        }
        int actualSum = (n * (n + 1)) / 2;
        return actualSum - totalSum;
    }

    public static void input_space_separated() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter space-separated elements: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the input buffer
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        List<Integer> arr = new ArrayList<>();
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        System.out.println("Missing number: " + getMissingNumIntFormat(arr, N));
    }

    public static void input_array_format() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter elements in format e1,e2,e3: ");
        int N = scanner.nextInt();
        scanner.nextLine(); 
        String input = scanner.nextLine();
        String[] tokens = input.split(",");
        List<String> arr = new ArrayList<>();
        for (String token : tokens) {
            arr.add(token);
        }
        System.out.println("Missing number: " + getMissingNumStrFormat(arr, N));
    }

    public static void main(String[] args) {
        input_space_separated();
        input_array_format();
    }
}
