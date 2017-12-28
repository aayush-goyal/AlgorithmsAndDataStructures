package CompetitiveCoding.Hackerrank._101Hack50;

import java.io.*;

public class EvenOddBoxes {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int q = Integer.parseInt(br.readLine());

            for(int i=0; i<q; i++) {
                int n = Integer.parseInt(br.readLine());
                String[] chocos = br.readLine().split(" ");
                int[] chocolates = new int[n];
                for(int j=0; j<n; j++) {
                    chocolates[i] = Integer.parseInt(chocos[i]);
                }

                for(int j=0; j<n; j++) {
                    if(j%2 == 0) {
                        if(chocolates[j]%2 != 0) {
                            int index = scoutForNextIndex(chocolates, j);
                            if(index == -1) {
                                System.out.println(-1);
                                break;
                            }
                            --chocolates[index];
                            chocolates[j]++;
                        }
                    } else {
                        if(chocolates[j]%2 == 0) {
                            int index = scoutForNextIndex(chocolates, j);
                            if(index == -1) {
                                System.out.println(-1);
                                break;
                            }
                            --chocolates[index];
                            chocolates[j]++;
                        }
                    }
                }

            }
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }

    private static int scoutForNextIndex(int[] A, int index) {
        for(int i=index; i<A.length; i++) {
            if(i%2 == 0) {
                if(A[i]%2 != 0)
                    return i;
            } else {
                if(A[i]%2 == 0)
                    return i;
            }
        }

        return -1;
    }
}