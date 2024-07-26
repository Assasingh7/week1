package Week2.Day5;

import java.util.Scanner;

public class Practices15 {
     static int count(int n){
            int temp=0;
           while (n!=0) {
            temp++;
            n=n/10;
            
           }
           return temp;
           
        }
        static boolean armStrong(int n){
            int temp=n;
            double sum=0;
            int m=count(n);
            while (temp!=0) {
                int rem=temp%10;
                sum=sum+Math.pow(rem,m);
                temp/=10;

            }
            if(n==sum){
                return true;
            }
            return false;
        }
        static void armStrongPrint(int n,int m){
            for(int i=n;i<m;i++){
                if(armStrong(i)==true) System.out.println(i);
            }
        }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        armStrongPrint(n,m);
    }
}
