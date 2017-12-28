package CompetitiveCoding.RandomBhakchodi;

public class NewClass6 {
    private void foo() {
        System.out.println("Inside foo");
    }

    private static void bar() {
        System.out.println("Inside bar");
    }

    public static void main(String args[]) {
        // Math.ceil works fine with double inputs
        System.out.println(Math.ceil(7.0/3.0));
        NewClass6 nc6 = new NewClass6();
        nc6.foo();
        NewClass6.bar();

        int A[] = {2, 3, 4, 5, 6};

        for(int i:A) {
            System.out.println(A[i]);
        }
    }
}