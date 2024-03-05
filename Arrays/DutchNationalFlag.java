public class DutchNationalFlag {
    //Dutch National Flag algorithm, also known as 3-way partitioning, is used to sort an array of 0s, 1s, and 2s
    public static void sort012(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 1, 2, 0, 1};
        System.out.println("Original array:");
        printArray(arr);
        sort012(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
