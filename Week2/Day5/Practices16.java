package Week2.Day5;

import java.util.Scanner;

public class Practices16 { static long ct(long n){
        long c=0;
        while(n!=0){
            long rem=n%10;
            n/=10;
            c++;

        }
        return c;
    }
    static long dec(long sb,long sn){
        long count=ct(sn);
        long c=0;
        double temp=0;
        while(sn!=0){
            long rem=sn%10;
temp+=rem*Math.pow(sb,c);
c++;
sn/=10;

        }
        return (long)temp;
    }
    static long fun(long db,long sb,long sn){
        long d=dec(sb,sn);
        long temp=0;
        int c=0;
        while(d!=0 ){
            long q=d%db;
            temp+=q*Math.pow(10,c);
            c++;
            d/=db;

        }
        return temp;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long sb=sc.nextLong();
        long db=sc.nextLong();
        long sn=sc.nextLong();
        System.out.println(fun(db,sb,sn));

    }
    
}
