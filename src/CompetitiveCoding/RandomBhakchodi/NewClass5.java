package CompetitiveCoding.RandomBhakchodi;

import java.io.*;

public class NewClass5 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine()), height[]=new int[n];
            int tempStartIndex = 0, startIndex = 0, tempMidIndex = 0, midIndex = 0, tempEndIndex = 0, endIndex = 0,
                    length = 0, tempLength = 0, minOperationNumber = 0;
            String tempHeight[] = br.readLine().split(" ");
            boolean increasing = false, decreasing = false;

            for(int j=0; j<n; j++) {
                height[j] = Integer.parseInt(tempHeight[j]);
            }
                // 1 2 3 5 6 7 4 3 2 1 1/2
            for(int j=0; j<n-1; j++) {
                if(!increasing && height[j+1]>height[j]) {
                    tempStartIndex=j;
                    tempLength++;
                    increasing = true;
                } else if(decreasing && height[j-1]>height[j] && height[j+1]<height[j]) {
                    tempEndIndex=j+1;
                    tempLength+=2;
                    if(tempEndIndex-tempMidIndex != tempMidIndex-tempStartIndex) {
                        tempStartIndex += 1;
                    }
                    if(tempLength > length && tempLength%2 != 0) {
                        length = tempLength;
                        startIndex = tempStartIndex;
                        midIndex = tempMidIndex;
                        endIndex = tempEndIndex;
                    }
                    tempLength = 0;
                    decreasing = false;
                } else if(increasing && tempLength != 0 && height[j+1]>height[j]) {
                    tempLength++;
                } else if(increasing && tempLength !=0 && height[j]>height[j+1]) {
                    decreasing = true;
                    increasing = false;
                    tempMidIndex=j;
                    tempLength++;
                } else if(decreasing && tempLength != 0 && height[j]>height[j+1]) {
                    tempLength++;
                } else {
                    tempStartIndex = 0; tempLength = 0;
                }
            }

            for(int j=0; j<n; j++) {
                if(j == startIndex) {

                } else if(j == midIndex) {

                } else if(j == endIndex) {

                } else {
                    minOperationNumber+=height[j];
                    height[j]=0;
                }
            }

            for(int j=startIndex; j<=endIndex; j++) {
                System.out.print(height[j] + " ");
            }
            System.out.println();
            System.out.println(length + " " + startIndex + " " + endIndex);

            System.out.println(minOperationNumber);
        }
    }
	
}