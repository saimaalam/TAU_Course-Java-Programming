package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter a number for the day of the week");
        int day=scanner.nextInt();
        while (day<1 || day>7) {
            System.out.println("Enter numbers between 1 to 7");
            day=scanner.nextInt();
        }
        scanner.close();
        System.out.println( days[day-1]);
    }
}
