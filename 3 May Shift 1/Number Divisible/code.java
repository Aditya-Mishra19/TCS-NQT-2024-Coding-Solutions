import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 100 && number <= 999) {
            if (number % 9 == 0) {
                System.out.println("Number " + number + " is divisible by 9");
            } else {
                System.out.println("Number " + number + " is not divisible by 9");
            }
        }
    }
}
