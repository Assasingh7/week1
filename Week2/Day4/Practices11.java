package Week2.Day4;

import java.util.Scanner;

public class Practices11 {
    static long count1(long n){
        long count=0;
        while(n!=0){
            long rem=n%10;
            
            n/=10;
            count++;
        }
        return count;
    }
    static long chew(long n){
        long c=count1(n);
        long countt=0;
        double temp=0;
        while(n!=0){
            long rem=n%10 ;
            // if(rem>9/2 && countt+1!=c) rem=9-rem;
            // if(countt==c+1 && rem!=9 && rem>0) rem=9-rem;
if (rem > 9 / 2 && !(countt == c - 1 && rem == 9)) { // Changed condition
                rem = 9 - rem;
            }
            temp+=rem*Math.pow(10,countt);  
            countt++;
           

            n/=10;
        }
        return (long)temp;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(chew(n));
    }
    
}
