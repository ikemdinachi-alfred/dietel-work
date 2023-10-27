package ChibuzorWeekendSnakes;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();


        String[] students = new String[numStudents];
        double[][] score = new double[numStudents][numSubjects];

        // Collecting student names and score
        for (int row = 0; row < numStudents; row++) {
            System.out.print("Enter name of student " + (row + 1) + ": ");
            students[row] = input1.nextLine();
            for (int column = 0; column < numSubjects; column++) {
                System.out.print("Enter score of " + students[row] + " in subject " + (column + 1) + ": ");
                score[row][column] = input2.nextDouble();
            }
        }

        // Displaying table with subjects and scores
        System.out.printf("%15s", "Student Name");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("%15s", "Subject " + (i + 1));
        }
        System.out.printf("%15s", " TOTAL ");
        System.out.printf("%15s", " AVERAGE ");
        System.out.printf("%15s ", "POSITION");
        System.out.println();

        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            System.out.printf("%15s", students[i]);
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%15.2f", score[i][j]);
                sum += score[i][j];
            }
            double average = sum / numSubjects;
            System.out.printf("%15.2f", sum);
            System.out.printf("%15.2f", average);
            System.out.println();
        }

        // Calculating highest and lowest in each subject
        for (int i = 0; i < numSubjects; i++) {
            double highest = score[0][i];
            double lowest = score[0][i];
            int highestIndex = 0;
            int lowestIndex = 0;
            for (int j = 1; j < numStudents; j++) {
                if (score[j][i] > highest) {
                    highest = score[j][i];
                    highestIndex = j;
                }
                if (score[j][i] < lowest) {
                    lowest = score[j][i];
                    lowestIndex = j;
                }
                System.out.printf("%n%n%n%n");
            }
            System.out.println("Highest grade in subject " + (i + 1) + " is: " + highest + ", scored by: " + students[highestIndex]);

            System.out.println("Lowest grade in subject " + (i + 1) + " is: " + lowest + ", scored by: " + students[lowestIndex]);
        }
    }
}


