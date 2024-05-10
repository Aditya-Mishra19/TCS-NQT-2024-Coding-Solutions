import java.util.Scanner;

public class CustomRound {
    public static int customRound(double number) {
        int integerPart = (int) number;
        double decimalPart = number - integerPart;

        if (decimalPart >= 0.5) {
            return integerPart + 1;
        } else {
            return integerPart;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double nearest = (double) x / y;
        int roundedNumber = customRound(nearest);
        System.out.println(roundedNumber * y);
    }
}
