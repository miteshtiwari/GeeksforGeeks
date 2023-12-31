class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long ovsum = arr[0];
        long csum = arr[0];
        for(int i=1;i<n;i++)
        {
            csum =Math.max(csum+arr[i],arr[i]);
            ovsum = Math.max(ovsum,csum);
        }
        return ovsum;
        
    }
    
}

