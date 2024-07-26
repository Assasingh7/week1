package Week2.Day2;

import java.util.Scanner;

public class Practices2 {
     static int countDigits(int n,int m){
        int count=0;
        while(n!=0){
            int rem=n%10;
            if(rem==m) count++;
            n/=10;
        }
        return count;
    }
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int k=countDigits(n,m);
System.out.println(k);
    }
    
}
