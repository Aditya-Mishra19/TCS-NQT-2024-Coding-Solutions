import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<String> ans = new ArrayList<>();
        int totalFemale = 0;
        int totalGrade = 0;

        while (n-- > 0) {
            String name, gender;
            char grade;
            int age;

            name = scanner.next();
            age = scanner.nextInt();
            grade = scanner.next().charAt(0);
            gender = scanner.next();

            if (age > 20) {
                ans.add(name);
            }

            if (gender.equals("Female")) {
                totalFemale++;
                totalGrade += grade;
            }
        }

        for (String name : ans) {
            System.out.println(name);
        }

        double avg = totalFemale == 0 ? 0 : (double) totalGrade / totalFemale;
        System.out.println(avg);
    }
}
