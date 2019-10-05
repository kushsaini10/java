import java.util.Scanner;

public class Stars2 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int row = 2 * n - 1;

        for (int i = 1; i <= row; i++) {

            if (i <= n) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("* ");
                }
            } else {

                for (int j = row-i+1; j > 0; j--) {
                    System.out.print("* ");
                }

            }

            System.out.println();

        }
    }
}