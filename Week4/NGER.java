package Week4;

public class NGER {
    static int[] nger(int[] arr){
        int maxElement=0;
        int[] nger=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            nger[i]=maxElement;
            maxElement=Math.max(maxElement, arr[i]);

            
        }
        return nger;
    }
    public static void main(String[] args) {
        
    }
    
}
