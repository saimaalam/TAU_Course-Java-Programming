package chapter5;

import chapter6.PhoneBill;

public class BillCalculator {
    public static void main(String[] args) {
        //PhoneBill bill = new PhoneBill(123,79.99,800,700);
        PhoneBill bill = new PhoneBill();
        bill.setUsedMinutes(700);
        bill.setAllottedMinutes(400);
        bill.printBill();
    }
}
