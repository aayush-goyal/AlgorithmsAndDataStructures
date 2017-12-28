package CompetitiveCoding.Codechef.Beginner;

import java.util.*;

class ChefAndDolls {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int nod=scanner.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < nod; j++) {
                int num = scanner.nextInt();
                if(list.contains(num)) {
                    list.remove(list.indexOf(num));
                } else {
                    list.add(num);
                }
            }

            System.out.println(list.get(0));
        }
    }
}