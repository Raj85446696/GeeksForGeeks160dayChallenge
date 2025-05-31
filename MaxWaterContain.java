public class MaxWaterContain {

    public int max_water_contain(int[] height){
        int max = 0 ; 
        int left = 0 ; 
        int right = height.length-1 ; 
        while(left<right){
            int width = right-left ; 
            int area = Math.min(height[left],height[right])*width;
            max = Math.max(max,area);
            if(height[left]<=height[right]){
                left++ ; 
            }else{
                right-- ; 
            }
        }return max ; 
    }
    public static void main(String[] args) {
        MaxWaterContain w = new MaxWaterContain(); 
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(w.max_water_contain(height));
    }
}
