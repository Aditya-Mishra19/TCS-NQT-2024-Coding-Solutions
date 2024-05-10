import java.util.Scanner;

public class Main {
    public static String addValueToChars(String inputStr, int value) {
        StringBuilder result = new StringBuilder();
        for (char ch : inputStr.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    result.append((char) (((ch - 'a' + value) % 26) + 'a'));
                } else {
                    result.append((char) (((ch - 'A' + value) % 26) + 'A'));
                }
            } else if (Character.isDigit(ch)) {
                result.append((char) (((ch - '0' + value) % 10) + '0'));
            } else {
                if (ch == '@') {
                    result.append('#');
                } else {
                    result.append('@');
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String inputStr = scanner.next();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();

        String outputStr = addValueToChars(inputStr, value);
        System.out.println("Output: " + outputStr);
    }
}
