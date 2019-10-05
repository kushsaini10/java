import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {

        intro();
        System.out.print("\n\n**********************************************\n\n");

        budget();
        System.out.print("\n\n**********************************************\n\n");

        time();
        System.out.print("\n\n**********************************************\n\n");

        distance();
        System.out.print("\n\n**********************************************\n\n");

    }

    public static void intro() {

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Vacation Planner ! \nWhat is your name? ");
        String name = input.nextLine();

        System.out.print("Nice to meet you " + name + ", where are you travelling to ? ");
        String place = input.nextLine();

        System.out.print("Great! " + place + " sounds like a great trip. ");

    }

    public static void budget() {

        Scanner input = new Scanner(System.in);

        System.out.print("How many days are you going to spend travelling? ");
        Integer days = input.nextInt();

        System.out.print("How much money, in USD, are you willing to spend on your trip? ");
        Double usd = input.nextDouble();

        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();

        System.out.print("How many " + currency + " are there in 1 USD? ");
        Double rates = input.nextDouble();

        System.out.println("\nIf you are travelling for " + days + " days that is same as " + days*24 + " hours or " + days*24*60 + " minutes ");
        System.out.println("You are going to spend $" + usd + " USD that means per day you can spend up to $" + usd/days + " USD ");
        System.out.print("Your total budget in " + currency + " is " + usd*rates + " " + currency + ", which per day is " + usd*rates/days + currency + " ");


    }


    public static void time() {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Integer diff = input.nextInt();

        System.out.print("It means when it is mid night at home it will be " + (diff+24)%24 + ":00 in your travel destination \nand when it is noon at home it will be " + (diff+12) + ":00");

    }


    public static void distance() {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the square area of your country in km2? ");
        Double area  = input.nextDouble();

        System.out.print("In miles that is" + area/(1.6*1.6));

    }
}
