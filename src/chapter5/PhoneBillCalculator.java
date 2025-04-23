package chapter5;
/*
 * Write a ' Phone bill calculator' program that allow user to input
 * the plan fee
 * the number of overage minutes
 * charge 25 cents for every minute that user have gone over
 * add 15% tax on the subtotal
 * Calculate the final total
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    static double overageRate = .25; //25 cents= $.25
    static double tax = .15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        scanner.close();
        double overage = calculateOverage(overageMinutes);
        double tax = calculateTax(baseCost, overage);
        calculateAndPrintBill(baseCost, overage, tax);

    }

    public static double calculateOverage(double overageMinutes) {
        return overageMinutes * overageRate;
    }

    public static double calculateTax(double baseCost, double overage) {
        double subtotal = baseCost + overage;
        return subtotal * tax;
    }

    public static void calculateAndPrintBill(double baseCost, double overage, double tax) {
        double finalTotal = baseCost + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));

    }

}
