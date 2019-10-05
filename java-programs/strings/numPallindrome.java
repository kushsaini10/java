import java.util.Scanner;

public class numPallindrome {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n, digit = 0, reverse = 0;

        while(temp != 0) {

            digit = temp % 10;
            reverse = reverse*10 + digit;
            temp /= 10;

        }

        System.out.println(reverse);

        if(reverse == n) System.out.println(n + " is a Pallindrome.");

        else System.out.println(n + " is not a Pallindrome.");

    }
}