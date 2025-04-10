import java.util.*;

public class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int smallestMissing = 1 ; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestMissing) {
                smallestMissing++; 
            }
        }
        return smallestMissing;
    }

    public static void main(String[] args) {
        SmallestPositiveMissing s = new SmallestPositiveMissing();
        int arr[] = {-8, 0, -1, -4, -3};
        System.out.println("Smallest Number is :- "+s.missingNumber(arr));
    }
}
