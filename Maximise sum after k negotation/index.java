class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
       int negative_count = 0;
       long sum =0;
       for(long i:a){
           if(i<0){
               negative_count++;
           }
       }
       for(int i=0;i<negative_count;i++){
           a[i]=Math.abs(a[i]);
           k--;
           if(k==0){
               break;
           }
       }
       Arrays.sort(a);
       if(k!=0 && k%2!=0){
           a[0]=-1*a[0];
       }
       for(long i:a){
           sum+=i;
       }
    
       return sum;
       
    }
}
