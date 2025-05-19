import java.util.* ; 
public class SmallerThanCurr {
    public ArrayList<Integer> smallerNumber(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < arr[i]) {
                count++;
            }
        }
        result.add(count);
    }
    return result;
}

    public static void main(String[] args) {
        SmallerThanCurr s = new SmallerThanCurr(); 
        int[] arr = {8,1,2,2,3};
        System.out.println(s.smallerNumber(arr));
    }
}
