package Week2.Day0;
public class Day0 {
    static void swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    }
    static void nnaturalno(int n){
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }
    // static boolean check(int n){
    //     if(n%2==0 || n<=2 || n%3==0 || n%5==0 || n%7==0 ){
    //         return false;
    //     }
    //     return true;
    // }
    static boolean check(int n){
           for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
           }
            return true;
        }
        static int inverse(int n){
            int temp=0;
           while (n!=0) {
            temp=temp*10+n%10;
            n=n/10;
            
           }
           return temp;
           
        }
        static int count(int n){
            int temp=0;
           while (n!=0) {
            temp++;
            n=n/10;
            
           }
           return temp;
           
        }
        static boolean armStrong(int n){
            int temp=n;
            double sum=0;
            int m=count(n);
            while (temp!=0) {
                int rem=temp%10;
                sum=sum+Math.pow(rem,m);
                temp/=10;

            }
            if(n==sum){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        // int a=1;
        // int b=2;
    //     swap(a, b);
    //     nnaturalno(10);
    //    boolean n= check(3);
    boolean n=armStrong(371);
        System.out.print(n);
    }
}
