import java.util.*; 
public class DiffOfTwoArr {
    public static List<List< Integer>> finddifference(int[]num1,int[]num2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : num1) set1.add(n);
        for(int n : num2) set2.add(n);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int n : set1){
            if(!set2.contains(n)){
                l1.add(n);
            }
        }

        for(int n :set2){
            if(!set1.contains(n)){
                l2.add(n);
            }
        }
        return new ArrayList<>(Arrays.asList(l1,l2));

    }
    public static void main(String[] args) {
        int num1[] = {1,2,3,3};
        int num2[] = {1,1,2,2};
        System.out.println(finddifference(num1, num2));
    }

}
