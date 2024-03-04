public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int i, j, temp;
        int n = arr.length;
        boolean swapped;
        for(i = 0; i < n - 1; i++){
            swapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6, 7};
        bubbleSort(arr);
        for(int num : arr){
            System.out.println(num);
        }
        // Sample Output : 5 6 7 11 12 13        
    }
}