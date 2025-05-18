import java.util.* ; 
public class TwoSum {
    // This is brute Force O(n^2)
    public ArrayList<ArrayList<Integer>> twoSum(int[] arr,int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i ; j<arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    result.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        if (result.isEmpty()) {
        result.add(new ArrayList<>(Arrays.asList(-1, -1))); // optional, or just return empty list
    }
    return result ; 
    }


    public 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        TwoSum t = new TwoSum(); 
        System.out.println(t.twoSum(arr, 6));
    }
}
