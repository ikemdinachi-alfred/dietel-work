package ClassTask;

import java.util.Scanner;

public class StudentsScores {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                Scanner input1 = new Scanner(System.in);

                String[] students = new String[10];
                double[][] grades = new double[10][10];

                // Collecting student names and grades
                for (int i = 0; i < 10; i++) {
                    System.out.print("Enter name of student " + (i + 1) + ": ");
                    students[i] = input1.nextLine();
                    for (int j = 0; j < 10; j++) {
                        System.out.print("Enter grade of " + students[i] + " in subject " + (j + 1) + ": ");
                        grades[i][j] = input.nextDouble();
                    }
                    input1.nextLine();
                }

                // Calculating average score of each student
                for (int i = 0; i < 10; i++) {
                    double sum = 0;
                    for (int j = 0; j < 10; j++) {
                        sum += grades[i][j];
                    }
                    double average = sum / 10;
                    System.out.println("Average score of " + students[i] + " is: " + average);
                }

                // Calculating highest and lowest in each subject
                for (int i = 0; i < 10; i++) {
                    double highest = grades[0][i];
                    double lowest = grades[0][i];
                    for (int j = 1; j < 10; j++) {
                        if (grades[j][i] > highest) {
                            highest = grades[j][i];
                        }
                        if (grades[j][i] < lowest) {
                            lowest = grades[j][i];
                        }
                    }
                    System.out.println("Highest grade in subject " + (i + 1) + " is: " + highest);
                    System.out.println("Lowest grade in subject " + (i + 1) + " is: " + lowest);
                }
            }
        }
