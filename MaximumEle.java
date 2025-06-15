public class MaximumEle {
    // using linear search 
    public static int maximumElement(int[]arr){
        int max = arr[0] ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }return max ; 
    }

    // using binary search 
    public static int maximum_Element(int[] arr){
        int max = arr[0];
        int left = 0 ; 
        int right = arr.length-1 ; 
        while(left<=right){
            int mid = left+(right-left)/2 ; 
            max = Math.max(max,arr[mid]);
            if(arr[left]<=arr[mid]){
                max  = Math.max(max,arr[mid]);
                left = mid+1 ; 
            }else{
                right = mid -1 ; 
            }
        }return max ; 
    }
    public static void main(String[] args) {
        int[] arr = {4,7,6,3,1};
        System.out.println(maximumElement(arr));
        System.out.println(maximum_Element(arr));

    }
}
