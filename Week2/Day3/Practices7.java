package Week2.Day3;

import java.util.Scanner;

public class Practices7 {
     static void fToC(int minF,int maxF,int steps){
        
        for(int i=minF;i<=maxF;i+=steps){
           int  C=(i-32);
            System.out.println(i+"\t"+5*C/9);
            C=0;
        }
    } 
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int s=sc.nextInt();
        fToC(min,max,s);
    }
    
}
