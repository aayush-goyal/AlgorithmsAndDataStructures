package Arrays;

public class ReverseAnArray {
    public static void reverseArrayIterative(int[] A) {
        for(int i=0; i<A.length/2; i++) {
            int temp = A[i];
            A[i] = A[A.length-i-1];
            A[A.length-i-1] = temp;
        }

        for(int i : A)
            System.out.print(i + " ");
    }

    public static void reverseArrayRecursive(int[] A, int start, int end) {
        if(start >= end)
            return;
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
        reverseArrayRecursive(A, start+1, end-1);
    }
}
