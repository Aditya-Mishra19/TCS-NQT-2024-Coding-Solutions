import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] l = s.split(" ");
        int k = Integer.parseInt(l[0]);
        int N = Integer.parseInt(l[1]);
        List<Pair<Integer, String>> arr = new ArrayList<>();

        for (int i = 2; i < l.length; i += 2) {
            int marks = Integer.parseInt(l[i]);
            String name = l[i + 1];
            arr.add(new Pair<>(marks, name));
        }

        Collections.sort(arr, new Comparator<Pair<Integer, String>>() {
            @Override
            public int compare(Pair<Integer, String> o1, Pair<Integer, String> o2) {
                return Integer.compare(o2.getKey(), o1.getKey());
            }
        });

        for (int top = 0; top < k && top < arr.size(); top++) {
            Pair<Integer, String> pair = arr.get(top);
            System.out.println(pair.getValue() + ": " + pair.getKey());
        }
    }
}
