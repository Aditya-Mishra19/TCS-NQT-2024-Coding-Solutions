import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Integer> store = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String shoeSize = scanner.next();
            store.put(shoeSize, store.getOrDefault(shoeSize, 0) + 1);
        }

        int pairs = 0;
        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            String opposite;
            if (key.charAt(key.length() - 1) == 'L') {
                opposite = key.substring(0, key.length() - 1) + 'R';
            } else {
                opposite = key.substring(0, key.length() - 1) + 'L';
            }
            if (store.containsKey(opposite)) {
                pairs += Math.min(val, store.get(opposite));
            }
        }

        System.out.println(pairs / 2); // Dividing by 2 as we are counting pairs
    }
}
