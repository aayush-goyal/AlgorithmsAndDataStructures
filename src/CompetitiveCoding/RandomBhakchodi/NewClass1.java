package CompetitiveCoding.RandomBhakchodi;

import java.util.Scanner;

public class NewClass1 {
            static long size=0, miss=0;
        static long a=0;
        static long b=0;
    	public static void main (String[] args) throws java.lang.Exception {
    	    Scanner inp = new Scanner(System.in);
    	    int n = inp.nextInt();
    	    for(int i=0;i<n;i++)
    	    {
    	        size = inp.nextInt();
    	        int[] in = new int[(int)size];
    	        for(int j=0;j<size;j++)
    	        {
    	            in[j]=inp.nextInt();
    	        }
    	        java.util.Arrays.sort(in);
    	        for(int j=0;j<size;j=j+2)
    	        {
    	            if(j==size-1)
    	            {
    	                miss=in[j];
    	                break;
    	            }
     
    	            a=in[j];
    	            b=in[j+1];
    	            if(a!=b)
    	            {
    	                miss=a;
    	                break;
    	            }
    	        }
    	        
    	        System.out.println(miss);
    	    }
    	}
    
}