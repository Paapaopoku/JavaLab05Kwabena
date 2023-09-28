import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 0;


        System.out.print("Enter your age: ");
        age = in.nextInt();

        if(age >=21)
        {
            in.nextLine();
            System.out.println("You said your age is: " + age + " So you get a wristband");
        }
        else
        {
            in.nextLine();
            System.out.println("You have to be 21 or older to get a wristband");
        }
    }
}
