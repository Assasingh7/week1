package Week2.Day2;

import java.util.Scanner;

public class Practices5 {
    static int check(int n){
    for(int i=2;i<n;i++){
        if(n%i==0){
return 0;
        }
    }
    return 1;

}
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
static int lcm(int a,int b){
    return (a*b)/gcd(a,b);
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int m=sc.nextInt();
int a=lcm(n,m);
System.out.println(a);
    }
    
}
