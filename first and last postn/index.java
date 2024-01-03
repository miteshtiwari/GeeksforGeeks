class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        int firstoccurence = solve1(nums,target);
        int lastoccurence = solve2(nums,target);
        ans[0]= firstoccurence;
        ans[1]= lastoccurence;
        return ans;
    }
    private int solve1(int[]nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    private int solve2(int[]nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
