
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long prefixsum = 1;
        long suffixsum = 1;
        long ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            if(prefixsum==0){
                prefixsum=1;
            }
            if(suffixsum==0){
                suffixsum=1;
            }
            prefixsum = prefixsum*arr[i];
            suffixsum=suffixsum*arr[n-i-1];
            
            ans = Math.max(ans,Math.max(prefixsum,suffixsum));
        }
        return ans;
    }
}
