package Exercises;

import java.util.Scanner;

public class StudentGradeFunction {

    public static String numberOfStudentAndScore() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" How Many Students Do You Have In Your Class: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("How Many Subjects Do The Student Offer: ");
        int numberOfSubject = scanner.nextInt();

        String[] studentsName = new String[numberOfStudents];
        int[][] scores = new int[numberOfStudents][numberOfSubject];

        for (int row = 0; row < numberOfStudents; row += 1) {
            System.out.print("Enter name of Student " + (row + 1) + ":  ");
            studentsName[row] = scanner1.nextLine();
            for (int column = 0; column < numberOfSubject; column++) {
                System.out.print("Enter Score of " + studentsName[row] + " in subject " + (column + 1) + ":  ");
                scores[row][column] = scanner.nextInt();
            }
        }
        System.out.printf("%15s", "Name Of Students");
        for (int i = 0; i < numberOfSubject; i++) {
            System.out.printf("%15s", "Subject " + (i + 1));
        }
        System.out.printf("%15s", " TOTAL ");
        System.out.printf("%15s", " AVERAGE ");
        System.out.printf("%15s ", "POSITION");
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            int sum = 0;
            System.out.printf("%15s", studentsName[i]);
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.printf("%15s", scores[i][j]);
                sum += scores[i][j];
            }
            double average = (double) sum / numberOfSubject;
            System.out.printf("%15.2f", sum);
            System.out.printf("%15.2f", average);
            System.out.println();

        }
return "0";
    }
}


