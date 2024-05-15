import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] arr = in.split(" ");
        int n = Integer.parseInt(arr[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int q = i; q <= j; q++) {
                    if (q != j) {
                        System.out.print(sb.charAt(q) + " ");
                    } else {
                        System.out.print(sb.charAt(q));
                    }
                }
                if (i != n - 1)
                    System.out.print(",");
            }
        }
    }
}

