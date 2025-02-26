package Strategy_Design_Pattern;

import java.util.Scanner;

public class StrategyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPaymentStrategy paymentStrategy;
        System.out.println("Enter the payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");
        int choice = sc.nextInt();
        if (choice == 1) {
            paymentStrategy = new CreditCardPayment();
        } else if (choice == 2) {
            paymentStrategy = new PayPalPayment();
        } else {
            paymentStrategy = new UPIPayment();
        }
        paymentStrategy.collectPaymentDetails();
        paymentStrategy.pay(100_000);
        sc.close();
    }
}
