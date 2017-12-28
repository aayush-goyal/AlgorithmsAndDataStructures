package CompetitiveCoding.RandomBhakchodi;

public class example {
    int i[] = {0};
    public static void main(String args[]) {
        int i[] = {1};
        i = change_i(i);
        System.out.println(i[0]);
    }
    static int[] change_i(int i[]) {
        int j[] = {2};
        i = j;
        return i;
    }
}