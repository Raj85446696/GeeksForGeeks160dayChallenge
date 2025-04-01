import java.util.* ; 
class Solution{
    public List<Integer> findMajority(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int n = nums.length/3 ; 
        List<Integer> newArr = new ArrayList<>(); 
        for(int elm : nums){
            map.put(elm, map.getOrDefault(elm, 0)+1);
        }
        for(int elm :map.keySet()){
        if(map.get(elm)>n){
            newArr.add(elm);
        }
        }
        return newArr; 
     }
    public static void main(String[] args) {
        Solution s = new Solution(); 
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6}; 
        System.out.println(s.findMajority(arr));
    }
}