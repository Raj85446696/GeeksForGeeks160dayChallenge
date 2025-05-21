
import java.util.*;

public class TopIFreq {

    public int[] topFreqNumber(int[] arr, int k) {
        // hashMap  TimeComplexity = O(nlogk) , SpaceComplexity = O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // heap 
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;

    }

    public static void main(String[] args) {
        TopIFreq t = new TopIFreq();
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 4, 3, 3, 3};
        System.out.println(Arrays.toString(t.topFreqNumber(arr, 2)));
    }
}
