import java.util.* ; 
class DuplicateNumber{
    // Time complexity of algo is O(n^2)
    public boolean duplicateNumber(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    return true ; 
                }
            }
        }return false ; 
    }

    // Time complexity is O(n)
    public static boolean duplicatenumber(int[] arr){
        Map <Integer,Integer> map = new HashMap<>(); 
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)>1){
                return true ; 
            }
        }return false ; 
    }

    // Best Approch O(n)
    public static boolean duplicate_number(int[] arr){
        Set<Integer> set = new HashSet<>() ; 
        for(int a : arr){
            if(!set.add(a)){
                return true ; 
            }
        }return false ; 
    }
    public static void main(String[] args) {
        DuplicateNumber d = new DuplicateNumber();
        int [] arr = {1,2,3,4,3}; 
        System.out.println(d.duplicateNumber(arr));
        System.out.println(duplicatenumber(arr));
        System.out.println(duplicate_number(arr));

    }
}