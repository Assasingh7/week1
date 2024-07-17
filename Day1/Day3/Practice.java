import java.util.Scanner;

class Practice{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=5;
    // for (int i = 1; i <=n; i++) {
    //     for (int j = 1; j <=n; j++) {
    //         if(i==j || i+j==n+1){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // for (int i = 1; i <=n; i++) {
    //     for (int k = 1; k <=n-i; k++) {
    //         System.out.print("  ");
    //     }
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print("* ");
    //     }
    //     for (int j = 2; j <=i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for (int i = 1; i <=n; i++) {
    //     for (int k = 1; k <=n-i; k++) {
    //         System.out.print("  ");

    // }
    // for (int j = 1; j <=2*i-1; j++) {
    //     System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = n; i >=1; i--) {
    //     for (int k = 1; k <=n-i; k++) {
    //         System.out.print("  ");

    // }
    // for (int j = 1; j <=2*i-1; j++) {
    //     System.out.print("* ");
    // }
    // System.out.println();
    // }
// for (int i = 1; i <=n; i++) {
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("  ");
//     }
//     for (int j = 1; j <=2*i-1; j++) {
//         if((j)%2!=0 ){
//             System.out.print("* ");
//         }else{
//             System.out.print("! ");
//         }
//     }
//     System.out.println();
// }
// for (int i = 1; i <=n; i++) {
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("  ");
//     }
//     for (int j = 1; j <=2*i-1; j++) {
//         if((j)%2!=0 ){
//             System.out.print("* ");
//         }else{
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }
//  for (int i = 1; i <=n; i++) {
//         for (int k = 1; k <=n-i; k++) {
//             System.out.print("  ");
//         }
//         for (int j = 1; j <=i; j++) {
//             if(j%2!=0 ){
//                 System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//         }
//         for (int j = 2; j <=i; j++) {
//             if((i==j) || (((i+j)%2==0) && (i+j)>=n)){
//                 System.out.print("* ");

//             }else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }
//  for (int i = 1; i <=n; i++) {
//         for (int k = 1; k <=n-i; k++) {
//             System.out.print("  ");
//         }
//         for (int j = 1; j <=i; j++) {
//             if(j%2!=0 ){
//                 System.out.print("* ");
//             }else{
//                 System.out.print("! ");
//             }
//         }
//         for (int j = 2; j <=i; j++) {
//             if((i==j) || (((i+j)%2==0) && (i+j)>=n)){
//                 System.out.print("* ");

//             }else{
//                 System.out.print("! ");
//             }
//         }
//         System.out.println();
//     }
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for (int i = n-1; i >=1 ; i--) {
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for (int i = 1; i <= n; i++) {
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("  ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for (int i = n-1; i >=1 ; i--) {
    
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("  ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for (int i = n; i >=1 ; i--) {
    
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("    ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// for (int i = 2; i <=n ; i++) {
    
//     for (int k = 1; k <=n-i; k++) {
//         System.out.print("    ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
for (int i = n; i >=2; i--) {
    for (int j = 1; j <=i; j++) {
        System.out.print("  ");
    }
    for (int j = 1; j <=i; j++) {
        System.out.print(" *");
    }
    System.out.println();
}
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=i; j++) {
        System.out.print("  ");
    }
    for (int j = 1; j <=i; j++) {
        System.out.print(" *");
    }
    System.out.println();
}



    sc.close();
}
}