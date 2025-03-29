import java.util.Arrays;

public class MoveallZerotoEnd {
    void pushZerosToEnd(int[] arr) {
        int nonzero = 0 ; 
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[nonzero];
                arr[nonzero] = arr[i];
                arr[i] = temp ; 
                nonzero++; 
            }
        }
    }
    public static void main(String[] args) {
        MoveallZerotoEnd m = new MoveallZerotoEnd(); 
       int [] arr = {1, 2, 0, 4, 3, 0, 5, 0}; 
       m.pushZerosToEnd(arr);
       System.out.println(Arrays.toString(arr));
       
    }
}
