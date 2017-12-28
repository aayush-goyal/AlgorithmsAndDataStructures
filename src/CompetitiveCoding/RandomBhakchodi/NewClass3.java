/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.RandomBhakchodi;

import java.io.*;

/**
 *
 * @author #The_Joker
 */
public class NewClass3 {
    public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    for (int x = 0; x < N; x++) {
      int Q = Integer.parseInt(br.readLine());
      String[] payDetails = br.readLine().split("\\s+");
      int i;
      int length = payDetails.length;
      for (i = 0; i < length; i++) {
        if (payDetails[i].equals("0")) {
          break;
        }
      }
      int notPaid=0;
      int k=i;
      for(;k<length;k++){
        if(payDetails[k].equals("0")){
          notPaid++;
        }
      }
      System.out.println(((notPaid*1000)+(length-i)*100));
    }
  }
}