package Week2.Day5;

import java.util.Scanner;

public class Practices13 {
    static void func(int n,int m){
int c=0;

        for(int i=1;i<=n*m;i++){
            if((3*i+2)%m!=0  ){
                System.out.println(3*i+2);
                c++;
                if(c==n) break;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
func(n,m);

    }
}
