import java.util.*;

public class ReverseArr {
    public void reverseArray(int arr[]) {
        // code here
        int left = 0 ;
        int right = arr.length-1 ; 
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]  = temp ; 
            left++ ; 
            right-- ; 
        }
    }
    public static void main(String[] args) {
        ReverseArr r = new ReverseArr(); 
        int [] arr = {1, 4, 3, 2, 6, 5};
        r.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
