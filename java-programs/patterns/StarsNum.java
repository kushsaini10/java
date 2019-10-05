import java.util.Scanner;

public class StarsNum {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for(int h = 1,i = n; i>=1; i--, h++) {
            System.out.print("\n");

            for(int j = 1; j<i; j++) {

                System.out.print(" ");
            }

            for(int k = 1; k<=h; k++) {

                System.out.print(" " + num);
                num++;
            }



        }



    }
}
