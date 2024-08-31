class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0) return false;
        
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int i=0,j=m;

        while(i <= n && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(matrix[i][j] < target) {
                i++;
            }
            else {
                j--;
            };
        }

        return false;
    }
}