class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int i =0;
        int j=0;
        int currsum =0;
        int ans = 100001;
        while(j<n)
        {
            while(j<n && currsum<=x){
                currsum+=a[j];
                j++;
            }
            while(i<n && currsum>x){
                ans = Math.min(ans,j-i);
                currsum-=a[i];
                i++;
            }
        }
        if(ans==100001){
            return 0;
        }
        return ans;
    }
}

