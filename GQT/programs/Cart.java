package com.Ecommerce.GQT.programs;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> items = new ArrayList<>();

    public void add(Product p) {
        items.add(p);
        System.out.println(MainApp.GREEN + "✔ Added to Cart" + MainApp.RESET);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void checkout() {

        if (items.isEmpty()) {
            System.out.println(MainApp.RED + "❌ Cart is empty" + MainApp.RESET);
            return;
        }

        double total = 0;

        System.out.println("\n=========== CART BILL ===========");

        int i = 1;
        for (Product p : items) {
            System.out.printf(
                "%d. %s | %s | ₹%.2f%n",
                i++, p.getName(), p.getBrand(), p.getPrice()
            );
            total += p.getPrice();
        }

        System.out.println("--------------------------------");
        System.out.printf("TOTAL AMOUNT : ₹%.2f%n", total);
        System.out.println("================================");

        // 👉 Go to payment
        Payment.pay(total);

        items.clear(); // empty cart after order
    }
}
