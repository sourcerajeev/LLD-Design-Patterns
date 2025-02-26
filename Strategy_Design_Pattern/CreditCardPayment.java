package Strategy_Design_Pattern;

import java.util.Scanner;

public class CreditCardPayment implements IPaymentStrategy
{
    private final Scanner scanner = new Scanner(System.in);
    private String cardHolderName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Enter the card holder name: ");
        cardHolderName = scanner.nextLine();
        System.out.println("Enter the card number: ");
        cardNumber = scanner.nextLine();
        System.out.println("Enter the CVV: ");
        cvv = scanner.nextLine();
        System.out.println("Enter the expiry date: ");
        expiryDate = scanner.nextLine();
    }
    
}
