public class BinarySearch{
    public static int binarysearch(int arr[],int x){
        int l = 0;
        int r = arr.length-1;
        
        while(l<=r){
            int mid = l + (r - l )/2;
            if(arr[mid]==x){
                return mid;
            }
            if (arr[mid]>x) {
                r = mid -1;
            }
            if (arr[mid]<x) {
                l = mid+1;
            }
        }
        return -1;
        }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int x = 5;
        int result = binarysearch(arr, x);
        if(result == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found at index: "+ result);
        }
    }

}