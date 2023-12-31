class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long ans_index = -1;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid<=x){
                ans_index = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (int)ans_index;
    }
}
