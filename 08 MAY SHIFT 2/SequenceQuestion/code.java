import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static boolean isPositiveInteger(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !str.isEmpty() && Integer.parseInt(str) > 0;
    }

    public static List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            sequence.add(n);
        }
        return sequence;
    }

    public static int[] maxLengthOfSequenceAndK(int n) {
        int maxLen = 0, kValue = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> sequence = generateSequence(i);
            int currLen = sequence.size();
            if (currLen > maxLen) {
                maxLen = currLen;
                kValue = i;
            }
        }
        return new int[]{maxLen, kValue};
    }

    public static int[] maxSequenceValueAndK(int n) {
        int max_k = 0, max_val = 0;
        for (int k = 1; k <= n; k++) {
            List<Integer> sequence = generateSequence(k);
            int max_val_k = sequence.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
            if (max_val_k > max_val) {
                max_val = max_val_k;
                max_k = k;
            }
        }
        return new int[]{max_val, max_k};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n_str = scanner.nextLine();
        scanner.close();
        if (isPositiveInteger(n_str)) {
            int n = Integer.parseInt(n_str);
            List<Integer> sequence = generateSequence(n);
            int[] max_val_k = maxSequenceValueAndK(n);
            int[] maxLen_kValue = maxLengthOfSequenceAndK(n);
            System.out.print("Sequence: [");
            for (int i = 0; i < sequence.size(); i++) {
                System.out.print(sequence.get(i));
                if (i != sequence.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            System.out.println(maxLen_kValue[0] + " " + maxLen_kValue[1]);
            System.out.println(max_val_k[0] + " " + max_val_k[1]);
        } else {
            System.out.println("Error!");
        }
    }
}
