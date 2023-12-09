package gradecalculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averageMarks = (double) totalMarks / numSubjects;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);

        if (averageMarks >= 90) {
            System.out.println("Grade: A");
        } else if (averageMarks >= 80) {
            System.out.println("Grade: B");
        } else if (averageMarks >= 70) {
            System.out.println("Grade: C");
        } else if (averageMarks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
