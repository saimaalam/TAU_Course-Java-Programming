package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String args[]){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i< numberOfStudents; i++){

            double total = 0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1) +" for student#"+(i+1));
                double score = scanner.nextDouble();
                if(score<100 && score>-1) {
                    total = total + score;
                }
                else {
                    System.out.println("Invalid entry.Score should be between 0 to 100. Enter again.");
                    score = scanner.nextDouble();
                }

            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
