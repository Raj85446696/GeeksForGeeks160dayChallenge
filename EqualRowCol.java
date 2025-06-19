import java.util.*;

public class EqualRowCol {
    public static int equalPair(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        // Step 1: Convert rows to string and store frequency
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String rowStr = sb.toString();
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        // Step 2: Convert columns to string and check in map
        int count = 0;
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colStr = sb.toString();
            count += rowMap.getOrDefault(colStr, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };
        System.out.println(equalPair(grid));  // Output: 1
    }
}
    