import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0.0;
        double salesTax = 0.0;
        double totalPrice = 0.0;

        System.out.print("Enter price of item: ");
        itemPrice = in.nextDouble();

        if(itemPrice <=100)
        {
            in.nextLine();
            System.out.println("No sales tax ");
        }
        else
        {
            salesTax = itemPrice * 0.02;
            in.nextLine();
            System.out.println("Your sales tax is: " + salesTax);
        }

        totalPrice = itemPrice + salesTax;
        System.out.println("The total price is " + totalPrice);
    }
}