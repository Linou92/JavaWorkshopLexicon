package se.lexicon;

public class ShoppingReceipt {
    public  static void printShoppingReceipt() {
        String[] items = {"Apple", "Milk", "Bread"};
        int[] quantities = {2, 1, 3};
        double[] prices = {15.00, 22.50, 18.00};

        double grandTotal = 0;

        IO.println("====================\n" +
                "Receipt\n" +
                "====================\n");

        for(int i = 0; i < items.length; i++) {
            double total = quantities[i] * prices[i];
            grandTotal += total;

            IO.println(String.format(
                    "%s\t%d x %.2f = %.2f SEK",
                    items[i],
                    quantities[i],
                    prices[i],
                    total));
        }

        IO.println(String.format("------------------------------%n" +
                        "Grand Total: %.2f SEK%n" +
                        "==============================%n",
                grandTotal));
    }
}
