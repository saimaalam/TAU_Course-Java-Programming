package chapter7;

import java.util.Scanner;

public class Grades {
    private static double[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to enter?");
        grades = new double[scanner.nextInt()];

        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());

    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade : " + (i + 1));
            grades[i] = scanner.nextInt();
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Enter numbers between 0 to 100");
                grades[i] = scanner.nextInt();
            }
        }
    }

    public static double calculateSum() {
        double sum = 0;
        for (double grade : grades) {
            sum = sum + grade;
        }
        return sum;

    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static double getHighest() {
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static double getLowest() {
        double lowest = grades[0];
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

}
