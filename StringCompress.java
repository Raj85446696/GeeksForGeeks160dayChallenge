class Solution {
    public int compress(char[] chars) {
        int read = 0 ; 
        int write = 0 ; 
        while(read<chars.length){
            int count = 0 ; 
            char currchar = chars[read]; 
            while(read<chars.length && currchar == chars[read]){
                read++; 
                count++; 
            }
            chars[write++] = currchar ; 

            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[write++] = c ; 
                }
            }
        }
        return write ; 
    }
    public static void main(String[] args) {
        Solution s = new Solution(); 
        char[] chars = {'a','a','b','c','d'}; 
        System.out.println(s.compress(chars));
    }
}