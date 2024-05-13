import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printDictSorted(Map<String, Integer> mydict, boolean reverse) {
        ArrayList<String> sortedKeys = new ArrayList<>(mydict.keySet());
        if (reverse) {
            Collections.sort(sortedKeys, Collections.reverseOrder());
        } else {
            Collections.sort(sortedKeys);
        }
        for (String key : sortedKeys) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("\\s+");
        Map<String, Integer> d = new HashMap<>();
        for (String fruit : arr) {
            d.put(fruit, d.getOrDefault(fruit, 0) + 1);
        }

        printDictSorted(d, false);
        printDictSorted(d, true);
    }
}

