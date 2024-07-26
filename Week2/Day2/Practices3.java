package Week2.Day2;

import java.util.Scanner;

public class Practices3 {
      static int countt(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    static double reverse(int n){
        int count=countt(n);
        double temp=0;
        // int rev=0;
        while(count>0){
            int rem=n%10;
            temp=temp+rem*(Math.pow(10,count));
        //    rev+=temp;
             count--;
            n/=10;
            rem=0;
          
        }
        return temp/10;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       double k2=reverse(n);
       int k1=(int)(k2);
        System.out.println(k1);
    }
}
