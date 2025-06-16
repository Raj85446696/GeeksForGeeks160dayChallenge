import java.util.* ; 

class MoveZero{
    public static int[] moveZero(int [] nums){
       int left = 0 ; 
       int right = 1 ; 
       while(right<nums.length){
        if(nums[left]==0 && nums[right]!=0){
            int temp = nums[left]; 
            nums[left] = nums[right]; 
            nums[right] = temp ; 
            left++; 
        }else if(nums[left]!=0){
            left++; 
        }
        right++; 
       }
       return nums ; 
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12}; 
        int[] num = moveZero(nums);
        for(int i =0 ; i<num.length ; i++){
            System.out.print(num[i]+" ");
        }
    }
}