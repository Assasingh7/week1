package Week2.Day1;

public class Linear {
    static int linearSearch(int arr[],int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element) return i;
            else return -1;
        }
        return -1;
    }
    static boolean binarySearch(int arr[],int n){
        int i=0,j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n)i=mid+1;
            else j=mid-1;
            
        }
        return false;



    }
    static boolean binarySearchPart(int arr[],int n,int i,int j){
        // int i=0,j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n)i=mid+1;
            else j=mid-1;
            
        }
        return false;


    }
    static void printArr(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearchPart(arr, 2,0,4));

    }
}
