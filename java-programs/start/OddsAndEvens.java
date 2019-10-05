import java.util.*;

public class OddsAndEvens {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's play a game called \"Odds And Evens\"");

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("\nHi! " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();

        if("o".equals(choice) || "O".equals(choice))
            System.out.print("\n" + name + ", has picked Odds! Computer will be Evens. ");

        else if("e".equals(choice) || "E".equals(choice))
            System.out.print("\n" + name + ", has picked Evens! Computer will be Odds. ");

        else System.out.print("Wrong Input!!!");

        System.out.print("\n\n**********************************************\n\n");

        System.out.print("How many fingers do you put out? ");
        Integer finger = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.print("Computer plays number " + computer);

        System.out.print("\n\n**********************************************\n\n");

        int sum = finger + computer;

        System.out.println(finger + " + " + computer + " = " + sum);

        boolean oddoreven = sum % 2 == 0;

        if(oddoreven) {
            System.out.print(sum + " is ... even ");

            if("o".equals(choice) || "O".equals(choice))
                System.out.print("\nThat means " + name + " loses!! ");

            else if("e".equals(choice) || "E".equals(choice))
                System.out.print("\nThat means " + name + " wins!! ");

        }

        else {
            System.out.print(sum + " is ... even ");

            if("o".equals(choice) || "O".equals(choice))
                System.out.print("\nThat means " + name + " wins!! ");

            else if("e".equals(choice) || "E".equals(choice))
                System.out.print("\nThat means " + name + " loses!! ");

        }
    }
}
