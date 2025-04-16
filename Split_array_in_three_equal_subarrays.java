import java.util.List;

import java.util.*;

public class Split_array_in_three_equal_subarrays {
    public List<Integer> findSplit(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int totalSum = 0;
        
        // Step 1: Find total sum
        for (int num : arr) {
            totalSum += num;
        }
        
        // Step 2: Check if totalSum is divisible by 3
        if (totalSum % 3 != 0) {
            return result; // empty list if not divisible
        }
        
        int target = totalSum / 3;
        int sum = 0;
        int count = 0;
        
        // Step 3: Find indices
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == target && count == 0) {
                result.add(i); // end of first part
                count++;
                sum = 0; // reset for next part
            } else if (sum == target && count == 1) {
                result.add(i); // end of second part
                break;
            }
        }
        
        // Step 4: Return result only if we found 2 valid indices
        return result.size() == 2 ? result : new ArrayList<>();
    }

    public static void main(String[] args) {
        Split_array_in_three_equal_subarrays s = new Split_array_in_three_equal_subarrays();
        int[] arr = {1, 3, 4, 0, 4};
        List<Integer> result = s.findSplit(arr);
        System.out.println(result); // Output: [1, 3]
    }
}

