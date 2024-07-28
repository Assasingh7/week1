package Week3.Day0;

public class Sorting {
    static void bubbleSort(int[] arr){
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length-turn; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    static void display(int[] arr){

        for (int i : arr)System.out.print(i+" "); 
            
        
    }
    static void insertionSort(int[] arr){
int n=arr.length;
for (int i = 1; i < n; i++) {
    int key=arr[i];
    int j=i-1;
    while (j>=0 && arr[j]>key) {
        arr[j+1]=arr[j];
        --j; 
    }
    arr[j+1]=key;
}
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int idx=minimumValue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    private static int minimumValue(int[] arr, int a) {
       int mini=a;
       for(int i=a+1;i<arr.length;i++){
        if(arr[mini]>arr[i]) mini=i;

       }
       return mini;
    }
    public static void main(String[] args) {

        int[] arr={1,5,6,3};
        insertionSort(arr);
        display(arr);

    }
    
}
