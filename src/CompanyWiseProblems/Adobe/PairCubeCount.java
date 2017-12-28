package CompanyWiseProblems.Adobe;

import java.util.Scanner;

public class PairCubeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int N = scanner.nextInt();
            int count = 0;
            if(N == 0) {
                System.out.println("0");
                continue;
            } else if(N == 1) {
                System.out.println("1");
                continue;
            }
            for(int j=0; j<47; j++) {
                for(int k=j; k<47; k++) {
                    if(Math.pow(j, 3) + Math.pow(k, 3) == N){
                        if(j == k)
                            count++;
                        else if(j == 0 || k == 0)
                            count++;
                        else
                            count += 2;
                    }
                }
            }

            System.out.println(count);
        }
    }
}