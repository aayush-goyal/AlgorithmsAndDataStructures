package CompetitiveCoding.Codechef.Compete.SeptemberChallenge2017;

import java.util.Scanner;

class LittleChefsAndSum {
    public static void main(String[] args) {
        int minSum = 0, minI = 0;

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int N = scanner.nextInt(), preSum, sufSum;
            int array[] = new int[N];

            for(int j=0; j<array.length; j++) {
                array[j] = scanner.nextInt();
            }

            for(int j=1; j<=N; j++) {
                preSum = prefixSum(j, array);
                sufSum = suffixSum(j, array);

                if(j == 1) {
                    minSum = preSum + sufSum;
                    minI = j;
                }

                if(preSum + sufSum < minSum) {
                    minSum = preSum + sufSum;
                    minI = j;
                }
            }

            System.out.println(minI);
        }
    }

    private static int prefixSum(int j, int[] array) {
        int sum = 0;

        for(int i=0; i<j; i++) {
            sum += array[i];
        }

        return sum;
    }

    private static int suffixSum(int j, int[] array) {
        int sum = 0;

        for(int i=array.length-1; i>j-2; i--) {
            sum += array[i];
        }

        return sum;
    }
}