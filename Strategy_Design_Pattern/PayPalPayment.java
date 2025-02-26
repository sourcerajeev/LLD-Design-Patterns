package Strategy_Design_Pattern;

import java.util.Scanner;

public class PayPalPayment implements IPaymentStrategy
{
    private final Scanner scanner = new Scanner(System.in);
    private String emailId;
    private String password;

    @Override
    public void pay(float amount)
    {
        System.out.println(amount + " paid using PayPal.");
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Enter the email id: ");
        emailId = scanner.nextLine();
        System.out.println("Enter the password: ");
        password = scanner.nextLine();
    }

}
