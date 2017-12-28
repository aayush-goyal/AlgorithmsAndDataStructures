package Arrays;

public class ExperimentsWithArray {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5};
        ReverseAnArray.reverseArrayIterative(A);
        ReverseAnArray.reverseArrayRecursive(A, 0, A.length-1);

        System.out.println();

        for(int i : A)
            System.out.print(i + " ");
    }
}
