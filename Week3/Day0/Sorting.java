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
    public static void main(String[] args) {
        int[] arr={1};
        bubbleSort(arr);
        display(arr);
    }
    
}
