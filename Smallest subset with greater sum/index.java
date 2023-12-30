
class Solution { 
    int minSubset(int[] arr,int n) { 
        long totalsum = 0;
        long currsum = 0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            totalsum+=arr[i];
        }
        Arrays.sort(arr);
        
        for(int i=n-1;i>=0;i--)
        {
            currsum+=arr[i];
            totalsum-=arr[i];
            count++;
            
            if(currsum>totalsum)
            {
                return count;
            }
        }
        return count;
    }
}
