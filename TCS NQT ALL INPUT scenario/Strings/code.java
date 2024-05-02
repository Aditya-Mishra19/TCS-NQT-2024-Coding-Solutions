import java.util.ArrayList;
import java.util.Scanner;

public class InputExample {
    public static ArrayList<String> inputArrayFormat() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                arr.add(Character.toString(c));
            }
        }
        return arr;
    }

    public static ArrayList<String> inputSpaceSeparated() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNext()) {
            arr.add(ss.next());
        }
        return arr;
    }

    public static ArrayList<String> inputArraySizeNotGiven() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements (press Enter after each element, press Enter twice to stop):");
        while (true) {
            String element = scanner.nextLine().trim();
            if (element.isEmpty()) {
                break;
            }
            arr.add(element);
        }
        return arr;
    }

    public static void main(String[] args) {
        // Case 1: ['A', 'B', 'C', 'D']
        System.out.println("Case 1: ['A', 'B', 'C', 'D']");
        System.out.println(inputArrayFormat());

        // Case 2: A B C D
        System.out.println("Case 2: A B C D");
        System.out.println(inputSpaceSeparated());

        // Case with size not given
        System.out.println("Case with size not given");
        System.out.println(inputArraySizeNotGiven());
    }
}
