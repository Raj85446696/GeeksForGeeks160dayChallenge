class ReverseVowel {

    public String reverseString(String s) {
        int left = 0;
        int right = s.length() - 1;
        String vowel = "AEIOUaeiou";
        char[] chars = s.toCharArray();

        while (left < right) {
            while (left < right && !isVowel(chars[left], vowel)) {
                left++;
            }
            while (left < right && !isVowel(chars[right], vowel)) {
                right--;
            }

            swap(chars, left, right);
            left++;
            right--;
        }

        return new String(chars);
    }

    private boolean isVowel(char c, String vowel) {
        return vowel.indexOf(c) != -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        ReverseVowel r = new ReverseVowel();
        System.out.println(r.reverseString("LEETCODE"));  // Output: "LEOTCEDE"
    }
}
