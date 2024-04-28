import java.util.Scanner;

public class Main {
    public static void findCubeSum(int start, int end) {
        int cubeSum = 0;
        for (int i = start; i <= end; i++) {
            cubeSum += Math.pow(i, 3);
        }
        System.out.println(cubeSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        findCubeSum(start, end);
        scanner.close();
    }
}
