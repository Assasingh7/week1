package Week2.Day5;

import java.util.Scanner;

public class Practices14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int sum=0;
while(sc.hasNextInt()){
    int n=sc.nextInt();
    sum+=n;
    if(sum<0) break;
    System.out.println(n);
}
    }
}
