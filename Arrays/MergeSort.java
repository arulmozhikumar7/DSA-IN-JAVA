public class MergeSort {
    public static void merge(int arr[], int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l; 
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int arr[], int l, int r){
        if(l < r){
            int mid = l + (r - l) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6, 7};
        int arr_size = arr.length;
        mergesort(arr, 0, arr_size - 1);
        for(int num : arr){
            System.out.println(num);
        }
        // Sample Output : 5 6 7 11 12 13
    }
}
