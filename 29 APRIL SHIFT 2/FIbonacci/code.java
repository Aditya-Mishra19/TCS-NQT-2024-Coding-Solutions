import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        int a = 0, b = 1;
        if (n < 0) {
            System.out.println("Incorrect input");
            return -1; // or any error code you prefer
        } else if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            for (int i = 2; i <= n; ++i) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
        scanner.close();
    }
}
