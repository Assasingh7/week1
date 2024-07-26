package Week2.Day4;

import java.util.Scanner;

public class Practices9 {
     static void checkForPrime(int n){
        for(int i=2;i<=n;i++){
            if(n%i!=0){
                System.out.println("Prime");
                break;
            }else if(n%i==0){
                System.out.println("Not Prime");
                break;
            }
        }
    }
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
checkForPrime(n);
    }
}
