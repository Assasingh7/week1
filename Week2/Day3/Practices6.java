package Week2.Day3;

import java.util.Scanner;

public class Practices6 {
     static int nFibonacci(int N){
        int count=1;
        int n1=0,n2=1,n3=0;
        while(count!=N){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
        return n3;

       
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int k=nFibonacci(s);
        System.out.println(k);
    }
    
}
