package DynamicProgramming;

public class RodCutting {
    public static void main(String[] args) {
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30
        , 35, 38, 40, 45, 52, 55, 57, 59, 60, 63,
        65, 68, 72, 80, 90, 102, 105, 110, 112, 121,
        123, 127, 129, 130, 135, 138, 143, 152, 155, 159};
        long initialTime = System.currentTimeMillis();
        System.out.println(cutRodRecursiveTopDown(p, 27));
        long finalTime = System.currentTimeMillis() - initialTime;
        System.out.println("Time taken by recursion method in seconds: " + finalTime/1000);
        System.out.println(cutRodTopDownMemoized(p, 9));
        System.out.println(cutRodBottomUp(p, 9));
        // int r[][] = cutRodBottomUpExtended(p, 27);
    }

    private static int cutRodRecursiveTopDown(int[] p, int n) {
        if(n == -1)
            return 0;
        int q = Integer.MIN_VALUE;
        for(int i=0; i<=n; i++) {
            q = Math.max(q, p[i] + cutRodRecursiveTopDown(p, n-i-1));
        }
        return q;
    }

    private static int cutRodTopDownMemoized(int[] p, int n) {
        int[] r = new int[n+1];
        for(int i=0; i<r.length; i++) {
            r[i] = Integer.MIN_VALUE;
        }
        return cutRodTopDownMemoizedAuxillary(p, n, r);
    }

    private static int cutRodTopDownMemoizedAuxillary(int[] p, int n, int[] r) {
        if(n == -1)
            return 0;
        if(r[n]>=0)
            return r[n];
        else {
            int q = Integer.MIN_VALUE;
            for(int i=0; i<=n; i++) {
                q = Math.max(q, p[i] + cutRodTopDownMemoizedAuxillary(p, n-i-1, r));
            }
            r[n] = q;
            return q;
        }
    }

    private static int cutRodBottomUp(int[] p, int n) {
        int[] r = new int[n+1];
        for(int i=0; i<=n; i++) {
            int q =Integer.MIN_VALUE;
            for(int j=0; j<=i; j++) {
                if (i - j == 0) {
                    q = Math.max(q, p[j]);
                    continue;
                }
                q = Math.max(q, p[j] + r[i-j-1]);
            }
            r[i] = q;
        }

        return r[n];
    }

    /* private static int[][] cutRodBottomUpExtended(int[] p, int n) {
    // TODO Instead of returning two arra we can also just return the the optimal value and optimal piece length for a given n.
        int[][] r = new int[2][n+1];
        for(int i=0; i<=n; i++) {
            int q = Integer.MIN_VALUE;
            for(int j=0; j<=i; j++) {
                if(q<p[i] + r[1][i-j-1]) {
                    q = p[j] + r[1][i-j];
                    r[2][i] = j;
                }
            }
            r[1][i] = q;
        }
        return r;

        letrOE0: : n and sOE0 : : n be new arrays
2 rOE0 D 0
3 for j D 1 to n
4 q D 1
5 for i D 1 to j
6 if q < pOEi C rOEj  i 
7 q D pOEi  C rOEj  i 
8 sOEj  D i
9 rOEj  D q
10 return r and s
    }
    */
}