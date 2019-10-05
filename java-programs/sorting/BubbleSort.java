public class BubbleSort
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        int ar[] = {9, 8, 7, 4, 5, 6, 3, 2, 1};
        int n = ar.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(ar[j+1] < ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
