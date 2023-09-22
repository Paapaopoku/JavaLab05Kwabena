import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double salesTax = 0;
        double totalPrice = 0;

        System.out.println("Enter price of item: ");

        if(itemPrice >=100)
        {
            in.nextLine();
            System.out.println("No sales tax ");
        }
        else{
            salesTax = itemPrice * 0.02;
            System.out.println("Your sales tax is " + salesTax);
        }
        totalPrice = itemPrice + salesTax;
        System.out.println("The total price is " + totalPrice);
    }
}