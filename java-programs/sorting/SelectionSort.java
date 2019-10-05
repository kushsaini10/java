public class SelectionSort
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        int ar[] = {9, 8, 7, 4, 5, 6, 3, 2, 1};
        int n = ar.length;

        for(int i = 0; i < n-1; i++) {

            int minInd = i;

            for(int j = i; j < n; j++) {

                if(ar[j] < ar[minInd]) {
                    minInd = j;
                }
                int temp = ar[i];
                ar[i] = ar[minInd];
                ar[minInd] = temp;
            }
        }

        for(int i = 0; i < 9; i++) {
            System.out.print(ar[i] + " ");
        }


    }
}
