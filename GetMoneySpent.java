class Solution3{
    static int getMoneySpent(int[] keyboards, int[] drives, int b) { 
        int max = -1 ; 
        for(int i = 0 ; i<keyboards.length;i++){
            for(int j = 0 ; j<drives.length;j++){
                int sum = keyboards[i]+drives[i];
                if(sum<=b && sum >max){
                    max  = sum ; 
                }
            }
        }return max ;
    }
    public static void main(String[] args) {
        Solution3 s = new Solution3(); 
        int [] keyboards = {40,50,60};
        int [] drives = {5,8,12} ; 
        System.out.println(getMoneySpent(keyboards, drives, 60));
    }
}