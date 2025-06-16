public class isSubsequence {
    public static boolean is_Subsequence(String s , String t){
        int i = 0 ; 
        int j = 0 ; 
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==s.charAt(j)){
                i++ ; 
         }j++ ; 
        }
        if(i==s.length()){
            return true ; 
        }else{
            return false ; 
        }
    }
    public static void main(String[] args) {
        String s = "abc"; 
        String t = "ahbgdc"; 
        System.out.println(is_Subsequence(s, t));
    }
}
