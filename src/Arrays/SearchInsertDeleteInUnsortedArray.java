package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SearchInsertDeleteInUnsortedArray {

    final int SEARCH = 1;
    final int INSERT = 2;
    final int DELETE = 3;

    private int search(int arr[], int number) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == number)
                return i;

        return -1;
    }

    int insert(int array[], int number, int length) {
        array[length] = number;

        return (length + 1);
    }

    public static void main(String[] args) {

    }

    /*

    public static void main(String args[]) {
        SearchInsertDeleteInUnsortedArray sidiua=new SearchInsertDeleteInUnsortedArray();
        System.out.println("Enter the length of array.");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int array[]=new int[length];
        
        System.out.println("Enter the elements of the array.");
        for(int i=0; i<length; i++) {
            array[i]=scanner.nextInt();
        }
        
        System.out.println("Enter the operation to be performed.");
        int operation=scanner.nextInt();
        
        switch(operation) {
            case sidiua.SEARCH:
                System.out.println("Enter the number to be searched.");
                break;
            case sidiua.INSERT:
                break;
            case sidiua.DELETE:
                break;
            default:
                System.out.println("Sorry you entered wrong input.");
        }
        
    
    if (position==-1)
        printf("Element not found");
    else
        printf("Element Found at Position: %d", position+1 );
 
    return 0;
}



 
/* Driver program to test above function
int main()
{
    int arr[20] = {12, 16, 20, 40, 50, 70};
    int capacity = sizeof(arr)/sizeof(arr[0]);
    int n = 6;
    int i, key = 26;
 
    printf("\nBefore Insertion: ");
    for (i=0; i<n; i++)
        printf("%d  ", arr[i]);
 
    // Inserting key
    n = insertSorted(arr, n, key, capacity);
 
    printf("\nAfter Insertion: ");
    for (i=0; i<n; i++)
        printf("%d  ",arr[i]);
 
    return 0;
}

*/


// To search a key to be deleted
// int findElement(int arr[], int n, int key);
 
/* Function to delete an element
int deleteElement(int arr[], int n, int key)
{
    // Find position of element to be deleted
    int pos = findElement(arr, n, key);
 
    if (pos==-1)
    {
        printf("Element not found");
        return n;
    }
 
    // Deleting element
    int i;
    for (i=pos; i<n-1; i++)
        arr[i] = arr[i+1];
 
    return n-1;
}

*/
 
/* Function to implement search operation
int findElement(int arr[], int n, int key)
{
    int i;
    for (i=0; i<n; i++)
        if (arr[i] == key)
            return i;
 
    return -1;
}

*/

/*
// Driver code
int main()
{
    int i;
    int arr[] = {10, 50, 30, 40, 20};
 
    int n = sizeof(arr)/sizeof(arr[0]);
    int key = 30;
 
    printf("Array before deletion\n");
    for (i=0; i<n; i++)
      printf("%d  ", arr[i]);
 
    n = deleteElement(arr, n, key);
 
    printf("\n\nArray after deletion\n");
    for (i=0; i<n; i++)
      printf("%d  ", arr[i]);
 
    return 0;
}
    }
}

*/
}

/*
// Java program to implement linear
// search in unsorted arrays

class Main
{
    /* Function to implement
       search operation
static int findElement(int arr[], int n,int key)
{
    for (int i=0; i<n; i++)
        if (arr[i] == key)
            return i;

    return -1;
}

    // main Function
    public static void main(String args[])
    {
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;

        // Using a last element as search element
        int key =40;
        int position = findElement(arr,n,key);

        if (position==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position+1));
    }
}
Run on IDE

        Output:
        Element Found at Position: 5
        Insert Operation

        In an unsorted array, the insert operation is faster as compared to sorted array because we don’t have to care about the position at which the element is to be placed.
        CJava
// Java program to implement insert
// operation in an unsorted array.

class Main
{
    /* Function to insert a given key in
       the array. This function returns n+1
       if insertion is successful, else n.
    static int insertSorted(int arr[], int n, int key, int capacity)
    {
        // Cannot insert more elements if n
        // is already more than or equal to
        // capcity
        if (n >= capacity)
            return n;

        arr[n] = key;

        return (n+1);
    }

    /* Driver program to test above function
    public static void main (String[] args)
    {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;

        System.out.print("Before Insertion: ");
        for (i=0; i<n; i++)
            System.out.print(arr[i]+" ");

        // Inserting key
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
    Run on IDE

        Output:
        Before Insertion: 12 16 20 40 50 70
        After Insertion: 12 16 20 40 50 70 26
        Delete Operation

        In delete operation, the element to be deleted is searched using the linear search and then delete operation is performed followed by shifting the elements.
        CJava


        // Java program to implement delete
// operation in an unsorted array

class Main
{
    // function to search a key to
    // be deleted
    static int findElement(int arr[], int n, int key)
    {
        int i;
        for (i=0; i<n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    /* Function to delete an element
static int deleteElement(int arr[], int n, int key)
{
    // Find position of element to be
    // deleted
    int pos = findElement(arr, n, key);

    if (pos==-1)
    {
        System.out.println("Element not found");
        return n;
    }

    // Deleting element
    int i;
    for (i=pos; i<n-1; i++)
        arr[i] = arr[i+1];

    return n-1;
}

    // main Function
    public static void main(String args[])
    {
        int i;
        int arr[] = {10, 50, 30, 40, 20};

        int n = arr.length;
        int key = 30;

        System.out.println("Array before deletion");
        for (i=0; i<n; i++)
            System.out.print(arr[i] + " ");

        n = deleteElement(arr, n, key);

        System.out.println("\n\nArray after deletion");
        for (i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}

 */