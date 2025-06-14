public class Question1 {
    // Method to find the GCD string of two given strings
    public String gcdOfString(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Question1 q = new Question1();

        // Example 1
        String str1 = "ABCDEF";
        String str2 = "ABC";
        System.out.println("GCD of \"" + str1 + "\" and \"" + str2 + "\": " + q.gcdOfString(str1, str2));

        // Example 2
        str1 = "ABCABC";
        str2 = "ABC";
        System.out.println("GCD of \"" + str1 + "\" and \"" + str2 + "\": " + q.gcdOfString(str1, str2));

        // Example 3
        str1 = "LEET";
        str2 = "CODE";
        System.out.println("GCD of \"" + str1 + "\" and \"" + str2 + "\": " + q.gcdOfString(str1, str2));
    }
}
