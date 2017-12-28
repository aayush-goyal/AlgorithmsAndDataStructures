package CompetitiveCoding.RandomBhakchodi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass {
    public static void main(String args[]) {
        		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		int test=Integer.parseInt(br.readLine());
		while(test-->0){
			int salary=Integer.parseInt(br.readLine());
			double gross=0,hra=0,da=0;
			if(salary<1500){
				da=salary*.9;
				hra=salary*.1;
			}else if(salary>=1500){
				da=salary*.98;
				hra=500;
			}
			gross=salary+hra+da;
			 if(salary>=50275 && salary%100==75)
	            {
	                gross=gross-1;
	            }
			String result=String.format("%g",gross);
			while(result.contains(".")&&result.endsWith("0")||result.endsWith(".")){
				result=result.substring(0,result.length()-1);
			}
			System.out.println(result);
			
		}
                } catch(IOException e) {
                    System.out.println(e);
                }
    }
    
}
