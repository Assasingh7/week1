package Day1.Day5;

public class Practice3 {
    public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <=i; j++) {
//  if(j==1)System.out.print("* ");
//  else System.out.print("  ");               
//             }
//             for(int k=3;k<=i && k<=n;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=1;j++){
//                 if(i>1)
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <=i; j++) {
//  if(j==1)System.out.print("* ");
//  else System.out.print("  ");               
//             }
//             for(int k=3;k<=i && k<=n;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=1;j++){
//                 if(i>1)
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
int n=4;
for(int i=1;i<=n;i++){
    for(int k=1;k<=n-i;k++){
        System.out.print("  ");
    }
    for (int j = 1; j <=i; j++) {
if(j==1)System.out.print(i+" ");
else System.out.print("0 ");               
    }
    for(int k=3;k<=i && k<=n;k++){
        System.out.print("0 ");
    }
    for(int j=1;j<=1;j++){
        if(i>1)
        System.out.print(i+" ");
    }
    System.out.println();
}
    }
}
