class GfG
{
	public static int palinArray(int[] a, int n){
	    for(int curr:a){
	        if(!isPalindrome(curr)){
	            return 0;
	        }
	    }
	    return 1;
	}
	private static boolean isPalindrome(int val)
	{
	    int curr=val;
	    int reverse =0;
	    while(val != 0)
	    {
	        int remainder = val % 10;  
            reverse = reverse * 10 + remainder;
            val = val/10;   
	    } 
	    if(curr!=reverse){
	        return false;
	    }
	    return true;
	}
}
