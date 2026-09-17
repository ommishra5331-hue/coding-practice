// QUESTION NUMBER 3
import java.util.Scanner;

class ElectricBill {
    int consumerId;
    String consumerName;
    int unitsConsumed;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricBill e = new ElectricBill();

        System.out.print("Enter Consumer ID: ");
        e.consumerId = sc.nextInt();

        sc.nextLine();   // consume leftover newline

        System.out.print("Enter Consumer Name: ");
        e.consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        e.unitsConsumed = sc.nextInt();

        int bill;

        if (e.unitsConsumed <= 100) {
            bill = e.unitsConsumed * 3;
        } 
        else if (e.unitsConsumed <= 300) {
            bill = (100 * 3) + ((e.unitsConsumed - 100) * 5);
        } 
        else {
            bill = (100 * 3) + (200 * 5) + ((e.unitsConsumed - 300) * 8);
        }

        System.out.println("\nConsumer ID : " + e.consumerId);
        System.out.println("Consumer Name : " + e.consumerName);
        System.out.println("Units Consumed : " + e.unitsConsumed);
        System.out.println("Electricity Bill = " + bill);

        sc.close();
    }
}