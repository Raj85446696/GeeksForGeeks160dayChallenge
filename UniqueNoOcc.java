import java.util.* ; 
public class UniqueNoOcc {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int n : arr){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }

        Set<Integer> set1 = new HashSet<>(map1.values());
        return map1.size()==set1.size();

    }
    public static void main(String[] args) {
        UniqueNoOcc u = new UniqueNoOcc(); 
        int []arr = {1,2,2,1,1,3};
        System.out.println(u.uniqueOccurrences(arr));
    }
}
