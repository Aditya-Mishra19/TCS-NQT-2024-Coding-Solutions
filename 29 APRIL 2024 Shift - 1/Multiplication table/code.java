import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mSum = 0;
        for (int i = 1; i <= n; i++) {
            mSum += n * i;
        }
        System.out.println(mSum);
    }
}
