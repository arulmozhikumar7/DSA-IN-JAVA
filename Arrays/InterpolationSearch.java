public class InterpolationSearch {
    public static void main (String[] args) {
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18;
        int result = interpolationSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    private static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low<=high && x >= arr[low] && x <= arr[high]) {
           
          int pos = low + (((high - low) * (x - arr[low])) / (arr[high] - arr[low]));

          if (arr[pos] == x) {
              return pos;
          }

          if (arr[pos] < x) {
              low = pos + 1;
          } else {
              high = pos - 1;
          }
        }

        return -1;
    }
}