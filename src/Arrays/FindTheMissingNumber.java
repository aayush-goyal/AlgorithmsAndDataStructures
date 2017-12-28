package Arrays;

import java.io.*;

public class FindTheMissingNumber {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] nums = br.readLine().split(" ");
            int[] numbers = new int[nums.length];

            for(int i=0; i<nums.length; i++)
                numbers[i] = Integer.parseInt(nums[i]);

            System.out.println(findMissingNUmberBySumMethod(numbers));
            System.out.println(findMissingNUmberByXORMethod(numbers));
        } catch (IOException ioe) {
            System.out.println("Unexpected error occurred.");
        }
    }

    private static int findMissingNUmberBySumMethod(int[] numbers) {
        int sum = (numbers.length+1)*(numbers.length+2)/2;
        for(int i=0; i<numbers.length; i++)
            sum -= numbers[i];

        return sum;
    }

    private static int findMissingNUmberByXORMethod(int[] numbers) {
        int XOR1 = numbers[0], XOR2 = 1;
        for(int i=1; i<numbers.length; i++)
            XOR1 ^= numbers[i];
        for(int i = 2; i<numbers.length+2; i++)
            XOR2 ^= i;
        return (XOR1 ^ XOR2);
    }
}