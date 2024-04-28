import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Method 1
        int maxCost = 0;
        String maxCostItem = "";
        double totalPrice = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            String item = scanner.next();
            int quantity = scanner.nextInt();
            int price = scanner.nextInt();

            totalPrice += quantity * price;
            if (totalPrice > maxCost) {
                maxCostItem = item;
            }
            avg = totalPrice / (i + 1);
        }

        System.out.printf("Task 1 - Item: %s\nTotal price: %.2f\nAverage Price: %.2f\n", maxCostItem, totalPrice, avg);

        // Method 2
        Map<String, Double> store = new HashMap<>();
        maxCost = 0;
        maxCostItem = "";
        totalPrice = 0;

        for (int i = 0; i < n; i++) {
            String item = scanner.next();
            int quantity = scanner.nextInt();
            int price = scanner.nextInt();
            totalPrice = quantity * price;
            store.put(item, store.getOrDefault(item, 0.0) + totalPrice);

            if (maxCost < store.get(item)) {
                maxCostItem = item;
                maxCost = store.get(item).intValue();
            }
        }

        double total = store.values().stream().mapToDouble(Double::doubleValue).sum();
        avg = total / n;

        System.out.printf("\nTask 2 - Item: %s\nTotal price: %.2f\nAverage Price: %.2f\n", maxCostItem, total, avg);

        scanner.close();
    }
}
