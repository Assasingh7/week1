package Week2.Day6;

import java.util.Scanner;

public class Practices19 {
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
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean a=armStrong(n); 
System.out.println(a);
    }
    
}
