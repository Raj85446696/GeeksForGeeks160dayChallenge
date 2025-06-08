public class SearchElement{
    public static void Search_Element(int[] arr , int size , int target){
        int left = 0 ; 
        int right = size-1 ; 
        while(left<=right){
            int mid = left +(right-left)/2 ; 
            if(arr[mid]==target){
                System.out.println("YES");
                return ; 
            }else if(arr[left]<target){
                left = mid+1 ; 
            }else{
                right= mid-1 ; 
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int[] arr = {4,7,6,3,1};
        Search_Element(arr, 5, 9);
    }
}