/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitiveCoding.RandomBhakchodi;

public class NewClass2 {
    
    int a, b;
    
    public NewClass2(int first, int second) {
        this.a=first;
        this.b=second;
    }
    
    public static int def(NewClass2 nclass2) {
        nclass2.a/=2;
        nclass2.b/=5;
        nclass2=new NewClass2(20, 20);
        return nclass2.a+nclass2.b;
    }
    
    public static int def2(int a, int b) {
        a/=2;
        b/=5;
        return a+b;
    }
    
    public static void main(String args[]) {
        NewClass2 nc=new NewClass2(10, 10);
        NewClass2 nc2=nc;
        nc.a=2;
        nc=null;
        System.out.println(nc2.a);
        
        int sum=def(nc2);
        int c=10, d=90;
        int sum2=def2(c, d);
        System.out.println(nc2.a+" "+nc2.b);
        System.out.println(c+" "+d);
    }
}
