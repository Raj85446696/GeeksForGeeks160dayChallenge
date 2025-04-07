public class kadanesAlgoritm {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max_sum = arr[0]; 
        int current_sum = arr[0]; 
        for(int i = 1 ; i<arr.length ; i++){
            current_sum = Math.max(arr[i],current_sum+arr[i]);
            max_sum = Math.max(max_sum,current_sum);
        }return max_sum ; 
    } 
    public static void main(String[] args) {
        kadanesAlgoritm s = new kadanesAlgoritm(); 
        int [] arr = {1,2,4,5};
        System.out.println(s.maxSubarraySum(arr));
    }
}