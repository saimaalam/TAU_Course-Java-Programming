package chapter6;

public class PhoneBill
{
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double usedMinutes;
    final double overageRate = 0.25;
    final double taxRate = .15;


    public PhoneBill() {
        id = 1;
        baseCost = 70;
        allottedMinutes =600;
        usedMinutes = 600;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 70;
        allottedMinutes =600;
        usedMinutes = 600;
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setAllottedMinutes(double allottedMinutes) {

        this.allottedMinutes = allottedMinutes;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setUsedMinutes(double usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double getUsedMinutes() {

        return usedMinutes;
    }

    public double calculateOverage() {
        if(usedMinutes <= allottedMinutes) {
            return 0;
        }
        else {
           double overageMinutes= usedMinutes - allottedMinutes;
           return overageMinutes*overageRate;
        }
    }

    public double calculateTax(){
        double overage = calculateOverage();
        return taxRate*(baseCost+overage);
    }

    public double calculateTotalBill(){
        return baseCost+calculateOverage()+calculateTax();
    }
    public void printBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("ID: " + id);
        System.out.println("Base cost: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total bill: $" + String.format("%.2f", calculateTotalBill()));
    }

}
