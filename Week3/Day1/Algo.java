package Week3.Day1;

public class Algo {
static int sum(int[] nums,int a,int b){
    int sum=0;
    for(int i=a;i<=b;i++){
        sum+=nums[i];

    }
    return sum;
}
static int subArray(int[] arr){
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        
    for (int j = i; j < arr.length; j++) {
        sum = sum + arr[i];
        max=Math.max(max, sum);
    }
        
    }
    return max;
}

    public static void main(String[] args) {
        
    }
    
}
