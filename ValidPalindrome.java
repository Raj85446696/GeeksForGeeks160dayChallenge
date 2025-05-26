public class ValidPalindrome {
    public boolean validpalindrome(String name){
        String rname = "";
        for(int i = name.length()-1;i>=0;i--){
            rname+=name.charAt(i);
        }
    if(name.equals(rname)){
        return true ;
    }else{
        return false ;
    }
    }
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome(); 
        String name = "rar";
        System.out.println(v.validpalindrome(name));
    }
}
