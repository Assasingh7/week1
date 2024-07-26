package Week2.Day4;

import java.util.Scanner;

public class Practices10 {
      static int gcd(int a,int b){
    int gcd=1;
    for(int i=Math.min(a,b);i>=1;i--){
        if(a%i==0 && b%i==0){
            gcd=i;
            break;
        }
    }
    return gcd;

}
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println(gcd(n1,n2));
    }
}
