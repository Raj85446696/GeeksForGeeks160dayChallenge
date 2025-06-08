public class MaximumEle {
    public static int maximumElement(int[]arr){
        int max = arr[0] ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }return max ; 
    }
    public static void main(String[] args) {
        int[] arr = {4,7,6,3,1};
        System.out.println(maximumElement(arr));

    }
}
