import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;
        
        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // Step 2: If such an element is found, find the next larger element
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        
        // Step 3: Reverse the elements after index i
        reverse(arr, i + 1, n - 1);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 2]
    }
}
