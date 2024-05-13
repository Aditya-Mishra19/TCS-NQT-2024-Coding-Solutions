import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void printAllCombinations(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr.get(j));
                if (i < arr.size() - 1 || j < i) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter space-separated numbers: ");
        String s = scanner.nextLine();
        String[] l = s.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < l.length; i++) {
            list.add(l[i]);
        }
        printAllCombinations(list);
    }
}
