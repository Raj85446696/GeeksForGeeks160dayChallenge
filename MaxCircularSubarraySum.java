public class MaxCircularSubarraySum {
    public static int maxCircularSum(int[] arr) {
        int total = arr[0], currMax = arr[0], maxSum = arr[0];
        int currMin = arr[0], minSum = arr[0];
        int i = 1;

        while (i < arr.length) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);

            total += arr[i];
            i++;
        }

        // If all numbers are negative, max circular would wrongly be 0
        return (maxSum < 0) ? maxSum : Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {
        int[] arr = {8, -1, 3, 4};
        System.out.println("Max Circular Subarray Sum: " + maxCircularSum(arr));
    }
}
