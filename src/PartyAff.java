import java.util.Scanner;

public class PartyAff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String partyAff = "";
        String aff = "D - Democratic donkey\tR - Republican elephant\tI - Independent person\tO - other\nChoose your affiliation: ";


        System.out.print(aff);
        partyAff = in.nextLine();

        if(partyAff.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic donkey");
        }
        else  if(partyAff.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican elephant");
        }
        else  if(partyAff.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent person");
        }
        else  if(partyAff.equalsIgnoreCase("O"))
        {
            System.out.println("You chose Other");
        }
        else
        {
            System.out.println("This is not a given affiliation " + partyAff + " Must be { D R I O }");
        }


    }
}