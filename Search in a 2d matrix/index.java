class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_idx = solve(matrix,target);
        if(row_idx!=-1)
            return searchvalue(matrix,row_idx,target);
        return false;
    }
    private boolean searchvalue(int[][]matrix,int row_idx,int target)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[row_idx][i]==target){
                return true;
            }
        }
        return false;
    }
    private int solve(int[][]matrix,int target)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = -1;
        for(int currentrow=0;currentrow<matrix.length;currentrow++){
            if(matrix[currentrow][0]<=target && matrix[currentrow][n-1] >=target){
                ans = currentrow;
            }
        }
        return ans;
    }
}
