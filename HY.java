import java.util.Arrays;

class HY {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArr[] = new int[nums1.length + nums2.length];
        int size = newArr.length;
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            newArr[index++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArr[index++] = nums2[i];
        }
        Arrays.sort(newArr); 
        if (size % 2 == 0) {
            // Even length -> average of two middle elements
            return (newArr[size / 2 - 1] + newArr[size / 2]) / 2.0;
        } else {
            // Odd length -> middle element
            return newArr[size / 2];
        }
    }

    public static void main(String[] args) {
        HY h = new HY();
        int[] num1 = { 1, 2 };
        int[] num2 = { 3, 4 };
        System.out.println(h.findMedianSortedArrays(num1, num2));

    }
}