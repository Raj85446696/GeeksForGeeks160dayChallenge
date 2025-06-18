class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int leftsum = 0;
        int rightsum = 0;

        while (left <= right) {
            if (leftsum <= rightsum) {
                leftsum += nums[left];
                left++;
            } else {
                rightsum += nums[right];
                right--;
            }
        }

        if (leftsum == rightsum) {
            return left;  // or left - 1 based on interpretation
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = pivotIndex(nums);
        System.out.println("Pivot Index: " + result);
    }
}
