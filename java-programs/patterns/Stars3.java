import java.util.Scanner;

public class Stars3 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(" *");

        for (int i = 1; i <= n-2; i++) {

            System.out.println();
            System.out.print(" *");

            for (int j = 1; j <= i-1; j++) {

                System.out.print("  ");
            }

            System.out.print(" *");
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {

            System.out.print(" *");


        }


    }
}
