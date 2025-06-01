import java.util.*;
class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();
        
        // Flatten mat1 into freq1
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                freq1.put(mat1[i][j], freq1.getOrDefault(mat1[i][j], 0) + 1);
            }
        }
        
        // Flatten mat2 into freq2
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                freq2.put(mat2[i][j], freq2.getOrDefault(mat2[i][j], 0) + 1);
            }
        }
        
        int count = 0;
        
        // Count pairs
        for (int a : freq1.keySet()) {
            int b = x - a;
            if (freq2.containsKey(b)) {
                count += freq1.get(a) * freq2.get(b);
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Solution s = new Solution(); 
        int[][]mat1 = {{1 ,5 ,6},{8 ,10 ,11},{15 ,16 ,18}} ; 
        int[][]mat2 = {{2, 4, 7},{9, 10, 12},{13 ,16 ,20}} ; 
        System.out.println(s.countPairs(mat1, mat2, 21));

    }
}
