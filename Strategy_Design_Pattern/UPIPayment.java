package Strategy_Design_Pattern;

import java.util.Scanner;

public class UPIPayment implements IPaymentStrategy
{
    private final Scanner scanner = new Scanner(System.in);
    private String upiId;
    private String password;

    @Override
    public void pay(float amount)
    {
        System.out.println("Paid " + amount + " using UPI.");
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Enter the UPI ID: ");
        upiId = scanner.nextLine();
        System.out.println("Enter the password: ");
        password = scanner.nextLine();
    }
    
}
