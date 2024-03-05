public class PrefixSum{
    //Prefix sum is the cumulative sum of elements from the beginning of the array up to the current index. 
    public static int[] prefixSum(int arr[]){
        int n = arr.length;
        int []sum = new int[n];
        sum[0] = arr[0];
        for(int i=1;i<=n-1;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5};
        arr =  prefixSum(arr);
        for(int num: arr){
            System.out.println(num);
        }
    }
}