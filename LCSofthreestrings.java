class LCSOFTHREESTRING{
    public int lcsofthreeString(String s1,String s2 , String s3){
        return helper(s1, s2, s3, s1.length(), s2.length(), s3.length());
    }

    private static int max(int x  , int y , int z){
        return Math.max(x,Math.max(y, z));
    }


    public static int helper(String s1 , String s2 ,String s3 , int n1 , int n2 , int n3){
        if(n1==0||n2==0||n3==0){
            return 0 ; 
        }
        if(s1.charAt(n1-1)==s2.charAt(n2-1) && s2.charAt(n2-1)==s3.charAt(n3-1)){
            return 1+helper(s1, s2, s3, n1-1, n2-1, n3-1);
        }else{
            return max(helper(s1, s2, s3, n1-1, n2, n3),helper(s1, s2, s3, n1, n2-1, n3),helper(s1, s2, s3, n1, n2-1, n3));
        }
        
    }
    public static void main(String[] args) {
        LCSOFTHREESTRING l = new LCSOFTHREESTRING(); 
        String s1  = "geeks";
        String s2 = "geeksfor";
        String s3 = "geeksforgeeks";

        System.out.println(l.lcsofthreeString(s1, s2, s3));
    }
}