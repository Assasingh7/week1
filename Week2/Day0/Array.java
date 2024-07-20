package Week2.Day0;

public class Array {
    static void print(int arr[]){
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        // char[] arr = new char[10];
        // System.out.print(arr[0]=5);
        int[] arr={1,2,3,4};
        print(arr);
    }
}
