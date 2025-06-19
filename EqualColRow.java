import java.util.*;

public class EqualColRow {
    public static int equalPair(int[][] grid) {
        Map<String, Integer> row = new HashMap<>();
        Map<String, Integer> col = new HashMap<>();

        // for row 
        for(int i = 0 ; i<grid.length;i++){
            StringBuilder s = new StringBuilder(); 
            for(int j = 0 ; j<grid.length ; j++){
                s.append(grid[i][j]+",");
            }
            String str = s.toString();
            row.put(str,row.getOrDefault(str, 0)+1);
        }

        //for col 
        for(int j = 0 ; j<grid.length;j++){
            StringBuilder s = new StringBuilder(); 
            for(int i = 0 ; i<grid.length ; i++){
                s.append(grid[i][j]+",");
            }
            String str = s.toString();
            col.put(str,col.getOrDefault(str, 0)+1);
        }

        int count = 0 ;
        int i = 0 ;  
        for(String key : row.keySet()){
            if(col.containsKey(key)){
                count+=row.get(key)*col.get(key);
            }
        }
        return count ; 

    }

    public static void main(String[] args) {
        int[][] grid = {
                { 3, 2, 1 },
                { 1, 7, 6 },
                { 2, 7, 7 }
        };
        System.out.println(equalPair(grid));
    }
}
