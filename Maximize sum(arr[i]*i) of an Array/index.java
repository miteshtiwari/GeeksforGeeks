class Solution{
    
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        long mod = 1000000007;
        long product = (0)%mod;
        for(int i=0;i<n;i++)
        {
            product = (product +(long) i * arr[i])%mod;
        }
        return (int)product;
    }   
}

