import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int total_items = m * n;
        int count = 0;

        int startingrow = 0;
        int endingcol = n - 1;
        int endingrow = m - 1;
        int startingcol = 0;

        while (count < total_items) {
            for (int i = startingcol; i <= endingcol && count < total_items; i++) {
                ans.add(arr[startingrow][i]);
                count++;
            }
            startingrow++;
            for (int i = startingrow; i <= endingrow && count < total_items; i++) {
                ans.add(arr[i][endingcol]);
                count++;
            }
            endingcol--;
            for (int i = endingcol; i >= startingcol && count < total_items; i--) {
                ans.add(arr[endingrow][i]);
                count++;
            }
            endingrow--;
            for (int i = endingrow; i >= startingrow && count < total_items; i--) {
                ans.add(arr[i][startingcol]);
                count++;
            }
            startingcol++;
        }

        return ans;
    }
}
