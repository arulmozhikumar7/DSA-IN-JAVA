public class KadaneAlgorithm {
    //Kadane’s Algorithm is a dynamic programming algorithm used to find the maximum subarray sum in an array of numbers.
    public static int[] maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{start, end, maxSum};
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, -2, 5, 7, -3, 1};
        int[] result = maxSubArraySum(nums);
        int start = result[0];
        int end = result[1];
        int maxSum = result[2];
        System.out.println("Maximum sum of subarray: " + maxSum);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
    }
}
