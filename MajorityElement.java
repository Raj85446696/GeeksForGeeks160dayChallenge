import java.util.HashMap;
import java.util.Map;

class MajorityElement{
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>() ; 
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/2){
                return num ; 
            }
        }
        return -1 ; 
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3} ; 
        System.out.println(majorityElement(nums));
    }
}