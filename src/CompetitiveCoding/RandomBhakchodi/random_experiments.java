package CompetitiveCoding.RandomBhakchodi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author #The_Joker
 */
public class random_experiments {
    	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(input.readLine());
		//Scanner in = new Scanner(System.in);
		//int testCases = in.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			long numCoins = Integer.parseInt(input.readLine());
			long value = 1;
			
			for(int j = 2; j < 45000; j++){				
				long temp = (j * (j -1)) / 2;
				if(temp > numCoins){
					value = j - 2;
					break;
				}
				else if(temp == numCoins){
					value = j - 1;
					break;
				}
			}
			
			System.out.println(value);
		}
	}
} 