package com.Ecommerce.GQT.programs;

import java.util.Scanner;

public class Payment {

    static final String GREEN = "\u001B[32m";
    static final String RED   = "\u001B[31m";
    static final String RESET = "\u001B[0m";

    public static void pay(double amount) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Net Banking");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        String mode = "", d1 = "", d2 = "";

        if (choice == 1) {
            mode = "UPI";
            System.out.print("Enter UPI ID: ");
            d1 = sc.next();
        }
        else if (choice == 2) {
            mode = "Net Banking";
            System.out.print("Enter Account No: ");
            d1 = sc.next();
            System.out.print("Enter IFSC Code: ");
            d2 = sc.next();
        }
        else {
            System.out.println(RED + "❌ Invalid Payment Option" + RESET);
            return;
        }

        

        // ✅ PAYMENT SUCCESS → PRINT BILL
        System.out.println("\n========== PAYMENT BILL ==========");
        System.out.println("+--------------------------------------+");
        System.out.printf("| %-20s | %-15s |\n", "Field", "Details");
        System.out.println("+--------------------------------------+");
        System.out.printf("| %-20s | ₹%-14.2f |\n", "Amount Paid", amount);
        System.out.printf("| %-20s | %-15s |\n", "Payment Mode", mode);
        if (choice == 1) {
            System.out.printf("| %-20s | %-15s |\n", "UPI ID", d1);
        } else {
            System.out.printf("| %-20s | %-15s |\n", "Account No", d1);
            System.out.printf("| %-20s | %-15s |\n", "IFSC Code", d2);
        }
        

        System.out.println("+--------------------------------------+");

        System.out.println(GREEN +
                "✔ PAYMENT SUCCESSFUL\n" +
                "✔ ORDER PLACED"
                + RESET);
    }
}