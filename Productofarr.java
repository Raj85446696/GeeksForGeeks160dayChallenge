
import java.util.Arrays;
public class Productofarr {
    public int[] productofArrExce(int[] arr){
        int k = arr.length ; 
        int[] newArr = new int[k] ; 
        Arrays.fill(newArr,1); 
        int pre =1 , post = 1 ; 
        for(int i = 0 ; i< k ; i++){
            newArr[i] = pre ; 
            pre = arr[i]*pre ; 
        }

        for(int i = k-1 ; i>=0 ; i--){
            newArr[i] =newArr[i]*post ;
            post = post*arr[i];  
        }
        return newArr ; 
    }
    public static void main(String[] args) {
        Productofarr a  = new Productofarr(); 
        int[] arr = {1,2,3,4,5} ;
        System.out.println(Arrays.toString(a.productofArrExce(arr)));
    }
}
