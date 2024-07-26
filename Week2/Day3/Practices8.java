package Week2.Day3;

import java.util.Scanner;

public class Practices8 {
     static int inverse(int n){
        int inverse=0;
        int position=1;
        while(n>0){
            int digit=n%10;
            int innerPosition=(int)Math.pow(10,digit-1);
            inverse+=position*innerPosition;
            n/=10;
            position++;
        }
        return inverse;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
System.out.println(inverse(n));
    }
    
}
