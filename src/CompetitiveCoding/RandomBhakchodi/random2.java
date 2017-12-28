package CompetitiveCoding.RandomBhakchodi;

import java.util.Scanner;

public class random2 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
 
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(cw(arr));
 
			t--;
		}
		
 
	}
	public static int cw(int []arr){
		int s0=0,s1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				s0++;
			else
				s1++;
		}
		if(s0%2==0 &&s1%2==0)
			return s0;
		else if(s0%2==0 && s1%2==1)
			return s1;
		else if(s0%2==1 && s1%2==0)
			return s0;
		else
			return s1;
	}
}