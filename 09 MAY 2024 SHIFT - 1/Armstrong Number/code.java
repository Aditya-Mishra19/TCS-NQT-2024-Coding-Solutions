import java.util.Scanner;
import java.util.ArrayList;

public class ArmstrongNumber {
    static boolean isArmStrongNumber(int n, int k) {
        int sum = 0;
        int originalNum = n;
        while (originalNum > 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, k);
            originalNum /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();
        String[] arr = input.split(",");
        ArrayList<String> numbers = new ArrayList<>();
        for (String num : arr) {
            numbers.add(num);
        }
        int flag = 0;
        for (String num_str : numbers) {
            int num = Integer.parseInt(num_str);
            int n = num_str.length();
            if (isArmStrongNumber(num, n)) {
                System.out.print(num + " ");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.print("No Armstrong numbers present");
        }
        scanner.close();
    }
}
