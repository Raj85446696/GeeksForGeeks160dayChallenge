import java.util.*;

public class LongestConsec {
    public int longestConsecutiveSeq(int[] arr) {
        int counter = 1;
        Arrays.sort(arr);
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] + 1 == arr[i + 1]) {
                    counter++;
                }
            }
            return counter;
        }

    }

    public static void main(String[] args) {
        LongestConsec l = new LongestConsec();
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(l.longestConsecutiveSeq(arr));
    }
}
