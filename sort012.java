public class sort012 {
    public int[] Sort012(int[] arr){ 
        // Dutch national Flag Algoritms 
        int low = 0 ; 
        int mid = 0 ; 
        int high = arr.length-1 ; 
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp ; 
                low++; 
                mid++ ; 
            }else if(arr[mid]==1){
                mid++; 
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp ; 
                high--; 
            }
        } return arr ; 
    }
    public static void main(String[] args) {
        sort012 s = new sort012(); 
        int [] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int [] newarr = s.Sort012(arr);
        for(int i = 0 ; i<newarr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
