package SearchingAndSorting.Sorting;

public class QuickSort {
    public static void main(String args[]) {
        int A[] = {23, 45, 1, 4, 58, 85, 100, 12, 32, 13, 45};
        quickSort(A, 0, A.length-1);

        for(int i: A) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int A[], int start, int end) {
        if(start < end) {
            int partition = partition(A, start, end);
            quickSort(A, start, partition-1);
            quickSort(A, partition+1, end);
        }
    }

    /* This method creates a sub-array in-place comparing each element with the last element of the given array amd returns the
    index of the in-place sorted element which splits the whole sub-array in two unsorted in-place sub-array..
    After the whole comparison the last element will be sorted in-place in the array and there will be two sub-array such that
    they will be unsorted in nature but all the elements of them will either be smaller or larger than this in-place sorted element.

    If the numbers compared are smaller than the last element than they are swapped such that after the last element is in-place they
    form the elements of left sub-array and vice versa for elements greater than the last element. (Done by the loop in the method)
     */
    private static int partition(int A[], int start, int end) {
        int i = start-1, x = A[end], temp;
        for(int j=start; j<end; j++) {
            if(A[j]<=x) {
                i += 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        /* i now holds the last element of sub-array and therefore to sort the last element in-pace we need to swap it with the first
        element of the right sub-array. */

        temp = A[i+1];
        A[i+1] = A[end];
        A[end] = temp;

        return i+1;
    }

    private static int hoarePartition(int A[], int start, int end) {
        int i = start-1;
        /*
        x=A[p}
        i=p-1
        j=r+1
        repeat:
            j=j-1
            until A[j]<=x
        repeat:
            i=i+1
            until A[i]>=x
        if(i<j)
        exchange A[i] with A[j]
        else
        return j
        */
        return i+1;
    }

    /* TODO: Create a randomized version for partitioning by randomly choosing any element of the array for in-place sorting rather
    than always choosing only first or last element.
    randomly choose any element from array.
    swap with first or last element and then execute normal partitioning algorithm
    */
}