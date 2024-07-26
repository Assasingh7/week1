package Week2.Day2;

import java.util.Scanner;

public class Practices1 {
    static void sum(int n){
        int count=0;
        int sum1=0;
        int sum2=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            count++;

            if(count%2!=0){
                sum1+=rem;
                

            }else{
                sum2+=rem;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sum(n);

    }
    
}
