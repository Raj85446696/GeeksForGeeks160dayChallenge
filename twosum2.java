import java.util.* ; 
public class twosum2 {
    public ArrayList<Integer> twosum_problem(int [] arr,int tar){
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int i = 0 ; i<arr.length; i++){`
            int comp = tar-arr[i]  ; 
            if(map.containsKey(comp)){
                return  new ArrayList<>(Arrays.asList(map.get(comp),i));
            }
            map.put(arr[i], i);
        }return new ArrayList<>(Arrays.asList(-1,-1));
    }
    public static void main(String[] args) {
        twosum2 t = new twosum2(); 
        int [] arr = {2,7,11,15};
        System.out.println(t.twosum_problem(arr, 9));

    }
}
