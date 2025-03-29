class SecondLar {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1; // If there are less than 2 elements, return -1

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Previous largest becomes second largest
                largest = num;  // Update the largest element
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;  // Update second largest only if it's less than largest
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        SecondLar s = new SecondLar();
        int[] arr = {12, 35, 1, 10, 34, 1}; 
        System.out.println(s.getSecondLargest(arr)); // Output: 34
    }
}
