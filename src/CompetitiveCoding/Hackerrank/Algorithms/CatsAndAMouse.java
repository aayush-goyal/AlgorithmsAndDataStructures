package CompetitiveCoding.Hackerrank.Algorithms;

import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if(y > x) {
                if(z >= y)
                    System.out.println("Cat B");
                else if(x >= z)
                    System.out.println("Cat A");
                else if(y > z && z > x) {
                    if(y-z > z-x)
                        System.out.println("Cat A");
                    else if(z-x > y-z)
                        System.out.println("Cat B");
                    else
                        System.out.println("Mouse C");
                }
            } else if(x > y) {
                if(z >= x)
                    System.out.println("Cat A");
                else if(y >= z)
                    System.out.println("Cat B");
                else if(x > z && z > y) {
                    if(x-z > z-y)
                        System.out.println("Cat B");
                    else if(z-y > x-z)
                        System.out.println("Cat A");
                    else
                        System.out.println("Mouse C");
                }
            } else
                System.out.println("Mouse C");
        }
    }
}