public class spiralMatrix {
    public void spiralmatrix(int[][] arr){
        int n = arr.length ; 
        int top = 0 , bottom = n-1 ; 
        int left = 0 , right = n-1 ; 
        int num = 1; 
        while(top<=bottom && left<=right){
            // left to right 
            for(int i = left ; i <=right ; i++){
                arr[top][i] = num++ ; 
            }
            top++; 

            // top to bottom 
            for(int i = top ; i<=bottom ; i++ ){
                arr[i][right] = num++ ; 
            }
            right-- ; 

            //Right to Left 
            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    arr[bottom][i] = num++ ;
                }
                bottom--; 
            }

            //Bottom to top
            if(left<=right){
                for(int i = bottom ; i>=top; i--){
                    arr[i][left] = num++ ; 
                }left++ ; 
            }

            for(int[] row : arr){
                for(int val : row){
                    System.out.printf("%3d",val);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        spiralMatrix s = new spiralMatrix(); 
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        s.spiralmatrix(arr);
    }
}
