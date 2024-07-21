package Day1.Day6;

public class Practice4 {
    public static void main(String[] args) {
        int n=10;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         if(j<=n  && j!=i)
        //         System.out.print(i+" * ");
        //         else System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // for (int i = n-1; i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         if(j<=n  && j!=i)
        //         System.out.print(i+" * ");
        //         else System.out.print(i);
        //     }
        //     System.out.println();
        // }
        
for (int i = 1; i <=n; i++) {
    for(int k=1;k<=n-i;k++){
        System.out.print("  ");
    }
    for (int j = 1; j <=i; j++) {
        if(i==j) System.out.print(0+" ");
        else System.out.print(n-i+j+" ");
    }
    for (int j = 2; j <=i; j++) {
        System.out.print(n-j+1+" ");
    }
    System.out.println();
}
//                   0 
//                 9 0 9 
//               8 9 0 9 8
//             7 8 9 0 9 8 7
//           6 7 8 9 0 9 8 7 6
//         5 6 7 8 9 0 9 8 7 6 5
//       4 5 6 7 8 9 0 9 8 7 6 5 4
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1

    }


    }

