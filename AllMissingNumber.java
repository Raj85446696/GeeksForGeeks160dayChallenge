public class AllMissingNumber {
    public void allMissNum(int []arr){
        for(int i = 1 ; i<=arr.length-1 ; i++){
            boolean found = true ; 
            for(int j = 0 ; j<arr.length ; j++){
                if(arr[j]==i){
                    found= true ; 
                    break ; 
                }
            }
            if(!found){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        AllMissingNumber a = new AllMissingNumber(); 
        int[] arr = {1,2,4,5,7,8};
        a.allMissNum(arr);
    }
}
