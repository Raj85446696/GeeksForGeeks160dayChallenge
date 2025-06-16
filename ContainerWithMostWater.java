public class ContainerWithMostWater {
    public static int maxArea(int[] container){
        int left  = 0 ; 
        int right = container.length-1 ; 
        int maxarea = 0 ; 
        while(left<right){
            int h = Math.min(container[left],container[right]);
            maxarea = Math.max(maxarea,h*(right-left)); 

            if(container[left]<container[right]){
                left++ ; 
            }else{
                right--; 
            }
        }return maxarea; 
    }
    public static void main(String[] args) {
        int [] container = {1,8,6,2,5,4,8,3,7} ; 
        System.out.println(maxArea(container));
    }
}
