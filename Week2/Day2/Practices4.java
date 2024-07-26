package Week2.Day2;

import java.util.Scanner;

public class Practices4 {
     static int count( int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;

        }
        return count;
    }
    static int binary2Decimal(int n){
        int c=0;
        double temp=0;
        while(n!=0){
            int rem=n%10;
           double temp1=rem*(Math.pow(2,c));
           temp+=temp1;

            
            c++;
            n/=10;
            

        }
        return (int)temp;



    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int k=binary2Decimal(n);
// int k1=(int)(k); 
System.out.println(k);

    }
}
