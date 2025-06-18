public class LongestSubarrayAfterDelete1 {
    public static int longestSubarray(int[] nums){
        int left = 0 ; 
        int zerocount = 0 ; 
        int maxlen = 0 ; 
        for(int right = 0 ; right<nums.length ; right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>1){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }

            maxlen = Math.max(maxlen,right-left);
        }
        return maxlen ; 
    }
    public static void main(String[] args) {
        LongestSubarrayAfterDelete1 l = new LongestSubarrayAfterDelete1();
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));


    }
}
