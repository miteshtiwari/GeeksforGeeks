class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int start=0;
        int end = array.length-1;
        int i=0;
        while(i<=end){
            if(array[i]<a){
                swap(array,i,start);
                start++;
                i++;
            }
            else if(array[i]>b){
                swap(array,i,end);
                end--;
            }
            else{
                i++;
            }
        }
    }
    public void swap(int[]nums,int i,int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
