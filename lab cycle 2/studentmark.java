import java.util.Scanner;

public class studentmark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];
        int total = 0;

        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / n;

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
