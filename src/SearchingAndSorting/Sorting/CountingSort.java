package SearchingAndSorting.Sorting;

import java.io.*;

public class CountingSort {
    public static void main(String args[]) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the length of the array.");
            int length = Integer.parseInt(br.readLine());
            int A[] = new int[length], B[] = new int[length];

            System.out.println("Enter the number which will be largest among all the you entered.");
            int k = Integer.parseInt(br.readLine());
            int C[] = new int[k+1];

            System.out.println("Enter the " + length + " elements of the array that are less than a particular number.");
            String elements[] = br.readLine().split(" ");
            for(int i=0; i<A.length; i++) {
                A[i] = Integer.parseInt(elements[i]);
            }

            // Loop for storing the number of occurrences of a particular number in an array.
            for(int i : A) {
                C[i]++;
            }

            //  Loop that stores the number of elements less than or equal to a particular element.
            for(int i=1; i<C.length; i++) {
                C[i] = C[i-1] + C[i];
            }

            for(int i : A) {
                B[C[i]-1] = i;
                C[i]--;
            }

            for(int i : B) {
                System.out.print(i + " ");
            }

        } catch(IOException ioe) {
            System.out.println("Some I/O error occurred.");
        }
    }


}