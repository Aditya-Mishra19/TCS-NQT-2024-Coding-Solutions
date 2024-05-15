import java.util.Scanner;

public class Main {
    
    public static double calculateTotalCost(int weight, int distance) {
        double baseMoney = 5.00;
        double costPerKg = 2.00;
        double costPer10Km = 0.50;
        
        double weightCost = weight * costPerKg;
        double distanceCost = (distance / 10) * costPer10Km;
        
        double totalCost = baseMoney + weightCost + distanceCost;
        return totalCost;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int weight = scanner.nextInt();
        int distance = scanner.nextInt();
        
        double totalCost = calculateTotalCost(weight, distance);
        System.out.printf("$%.2f%n", totalCost);
        
        scanner.close();
    }
}
