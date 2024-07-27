package Week3.Day0;

public class Searching {
    static int lowerBound(int[] arr,int num){
        int firstOccurrence=-1;
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                firstOccurrence=mid;
                high=mid-1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }


        return firstOccurrence;
    }
   
    static int binarySearch(int arr[],int num){
        int low=0,high=arr.length-1;
        int mid=0;
        while (low<=high) {
mid=(low+high)/2;
if(arr[mid]==num) return mid;
else if(arr[mid]<num) low=mid+1;
else high=mid-1;

            
        }
        return -1;
    }
    static int upperBound(int[] arr,int num){
        int ans=-1;
        int count=0;
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }else if(arr[mid]>=num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }


        return ans;
    }
    static int countOccurence(int[] arr,int num){
if(lowerBound(arr, num)==-1) return 0;
        return upperBound(arr, num)-lowerBound(arr, num);
        
    }
    public static void main(String[] args) {
        int[] arr={1,3,3,3,6,6,7,8,9};
        int num=9;
        System.out.println(countOccurence(arr, num));
    }
}
