class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{
	    long[] a1 = new long[n];
	    long[] b1 = new long[n];
	    long[] ans = new long[n];
	    
	    
	    a1[0]=1;
	    long product = 1;
	    for(int i=1;i<n;i++){
	        a1[i]=nums[i-1]*product;
	        product = a1[i];
	    }
	    b1[n-1]=1;
	    long product2= 1;
	    for(int i=n-2;i>=0;i--){
	        b1[i]=nums[i+1]*product2;
	        product2 = b1[i];
	    }
	    for(int i=0;i<n;i++){
	        ans[i]=a1[i]*b1[i];
	    }
	    
	   // for(int i=0;i<n;i++){
	   //     System.out.print(b1[i]+" ");
	   // }
	    return ans;
	} 
} 


//----------------------------------------
Second way
  



//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{
	    long arr[] = new long[n];
	    if(nums.length==1)
	    {
	        return new long[]{1};
	    }
	    for(int i=0;i<n;i++)
	    {
	        long product = 1;
	        for(int j=0;j<n;j++)
	        {
	            if(i==j){
	                continue;
	            }
	            product = product * nums[j];
	            arr[i] = product; 
	            
	        }
	    }
	    return arr;
	} 
} 
