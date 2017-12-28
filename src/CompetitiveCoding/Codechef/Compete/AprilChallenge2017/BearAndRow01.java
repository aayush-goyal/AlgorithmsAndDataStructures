package CompetitiveCoding.Codechef.Compete.AprilChallenge2017;

import java.util.*;

class BearAndRow01 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int noc=scanner.nextInt();
        for(int i=0; i<noc; i++) {
            int noo=0, time=0;
            String input=scanner.next();
            String temp_array[];
            temp_array=input.split("");
            int array[]=new int[temp_array.length];
            
            for(int j=0; j<temp_array.length; j++) {
                array[j]=Integer.parseInt(temp_array[j]);
            }
            
            for(int j:array) {
                if(j==1) {
                    noo++;
                }
            }
            
            while(!is_game_complete(array, noo)) {
                int index1=find_index_of_movable_one(array);
                int index2=index_where_to_move(array, index1);
                int distance=index2-index1;
                time+=distance+1;
                array=change_array(array, index1, index2);
            }
            
            System.out.println(time);
            
        }
    }
    
    static boolean is_game_complete(int arr[], int noo) {
        for(int i=0; i<arr.length-noo; i++) {
            if(arr[i]==1) {
                return false;
            }
        }
        return true;
    }
    
    static int find_index_of_movable_one(int arr[]) {
        int index1=0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]==1 && arr[i+1]!=1) {
                index1=i;
                break;
            }
        }
        
        return index1;
    }
    
    static int index_where_to_move(int arr[], int index1) {
        int index2=0;
        for(int i=index1+1; i<arr.length; i++) {
            if(arr[i]==1) {
                return i-1;
            }
        }
        
        return arr.length-1;
    }
    
    static int[] change_array(int arr[], int index1, int index2) {
        arr[index1]=0;
        arr[index2]=1;
        
        return arr;
    }
}