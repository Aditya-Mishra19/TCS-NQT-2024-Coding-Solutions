import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number) {
        if (number <= 1) {  // 1 and below are not prime
            return false;
        }
        if (number <= 3) {  // 2 and 3 are prime
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {  // Eliminate multiples of 2 and 3
            return false;
        }

        // Check divisibility by numbers of the form 6k ± 1, up to sqrt(n)
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static boolean calculateSum(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            n /= 10;
        }
        return isPrime(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = n; i <= m; i++) {S
            if (isPrime(i) && calculateSum(i)) {
                System.out.println(i);
            }
        }
    }
}
