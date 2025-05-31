class CheckPalindrome{
    public boolean CheckPalindrome(String name){
        int left = 0 ; 
        int right = name.length()-1; 
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(name.charAt(left))){
                left++ ; 
            }
            while(left<right && !Character.isLetterOrDigit(name.charAt(right))){
                right-- ; 
            }

            if(name.charAt(left)==name.charAt(right)){
                return true ; 
            }
            return false ; 
        }
        left++ ; 
        right-- ; 
        return false ; 
    }
    public static void main(String[] args) {
        CheckPalindrome c = new CheckPalindrome(); 
        String name = "AS#:S;A";
        System.out.println(c.CheckPalindrome(name));
    }
}