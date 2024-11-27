package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]) {

        double penny = .01; //100 penny= 1 dollar.so 1 penny=1/100 dollar
        double nickel = .05; // 20 nickel= 1 dollar.so 1 nickel =1/20 dollar
        double dime = .10;; // 10 dime= 1 dollar.so 1 dime =1/20 dollar
        double quarter = .25; // 4 quarter= 1 dollar.so 1 quarter =1/20 dollar

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = (penny * numOfPennies) + (nickel * numOfNickels) + (dime * numOfDimes) + (quarter * numOfQuarters);
        System.out.println("You have enter total $"+String.format("%.2f",total));
        if (total < 1) {
            double shortageAmount = 1 - total;
            System.out.println("Sorry, You have " + String.format("%.2f", shortageAmount) + "cents less. You have lost the Change for a Dollar Game");
        } else if (total > 1) {
            double overAmount = total - 1;
            System.out.println("Sorry, You have " + String.format("%.2f", overAmount) + "cents more than needed. You have lost the Change for a Dollar Game");
        } else {
            System.out.println("Congratulation!! It's $1.00. You have won the Change for a Dollar Game.");
        }

    }
}
