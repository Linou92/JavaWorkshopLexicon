package se.lexicon;

import java.util.Scanner;

public class ReceiptBuilder {
    public static void printReceiptBuilder(){
        Scanner scanner = new Scanner(System.in);

        StringBuilder receipt = new StringBuilder();
        double total = 0;

        receipt.append("==============================\n" + "           Receipt\n" + "==============================\n");

        while (true) {
            IO.println("Enter item name (or 'done'): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("done")) {
                break;
            }

            IO.println("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // clear newline
            total += price;
            receipt.append(String.format("%-20s %.2f%n", item, price));
        }

        receipt.append("------------------------------\n" + String.format("%-20s %.2f%n", "Grand Total:", total) + "==============================");
        IO.println();
        IO.println(receipt);
    }
}
