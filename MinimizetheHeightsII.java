import java.util.* ; 
class Another {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length; 
        int result = arr[n-1]-arr[0];
        for(int i = 0 ; i<n-1 ;i++){
            int max = Math.max(arr[n-1]-k,arr[i]+k);
            int min = Math.min(arr[0]+k,arr[i+1]-k);
            if(min<0){
                continue;
            }
            result = Math.min(result,max-min);
        }return result ; 

    }
    public static void main(String[] args) {
        Another s = new Another(); 
        int []arr = {1, 5, 8, 10} ; 
        System.out.println("Min Height Diff is : "+s.getMinDiff(arr, 2));


    }
}
