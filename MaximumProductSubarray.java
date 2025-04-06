public class MaximumProductSubarray {
    int maxProduct(int[] nums){
        if (nums.length == 0) return 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                // Swap maxSoFar and minSoFar if current is negative
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
    public static void main(String[] args) {
        MaximumProductSubarray m = new MaximumProductSubarray(); 
        int [] nums = {-2, 6, -3, -10, 0, 2};
        System.out.println(m.maxProduct(nums));
    }
}
