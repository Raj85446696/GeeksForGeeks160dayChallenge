import  java.util.* ; 
public class SudokuValidator {

    public boolean isValidSudoku(char[][] board) {
        // Use sets to track seen digits for rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                if (val == '.') continue;

                // Check row
                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                // Check column
                if (cols[c].contains(val)) return false;
                cols[c].add(val);

                // Check 3x3 box
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex].contains(val)) return false;
                boxes[boxIndex].add(val);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SudokuValidator s = new SudokuValidator();

        // Sample 9x9 Sudoku board (valid one)
        char[][] matrix = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(s.isValidSudoku(matrix)); // Output: true
    }
}
