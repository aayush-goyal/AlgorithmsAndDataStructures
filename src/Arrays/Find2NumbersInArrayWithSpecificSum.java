package Arrays;

import java.util.*;

public class Find2NumbersInArrayWithSpecificSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int length = scanner.nextInt();
        System.out.println("Enter the " + length + " elements of the array.");
        int array[] = new int[length], sum;
        for(int i=0; i<length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the sum.");
        sum = scanner.nextInt();

        findingWithSorting(array, sum);
        findingWithBinaryHashMap(array, sum);

    }

    private static void findingWithSorting(int[] A, int sum) {
        Arrays.sort(A);
        int i= 0, j=A.length-1, a = A[i], b = A[j];
        while(i < j) {
            if(a+b > sum)
                b = A[--j];
            else if(a+b < sum)
                a = A[++i];
            else {
                System.out.println(a + " " + b);
                return;
            }
        }


        System.out.println("No pair exists.");
    }

    private static void findingWithBinaryHashMap(int[] A, int sum) {
        boolean[] binmap = new boolean[findMax(A)];

        for (int i : A)
        {
            int temp = sum-i;

            // checking for condition
            if (temp>=0 && binmap[temp-1])
            {
                System.out.println("Pair with given sum " + sum + " is (" + i + ", "+temp+")");
            }
            binmap[i-1] = true;
        }
    }

    private static int findMax(int[] array) {
        int max = 0;
        for(int i : array) {
            if(i > max)
                max = i;
        }

        return max;
    }
}