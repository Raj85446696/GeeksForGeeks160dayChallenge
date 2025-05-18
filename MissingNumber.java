import java.util.*;
public class MissingNumber {
    public static int missingnumber(int[] arr){
        Arrays.sort(arr);
        int num = 0 ; 
        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                continue ; 
            }else{
                num = arr[i]+1 ; 
            }
        }return num ;
    }
    public static void main(String[] args) {
        int[] arr = {6,4,2,3,5,7,0,1,8};
        System.out.println(missingnumber(arr));
    }
}
