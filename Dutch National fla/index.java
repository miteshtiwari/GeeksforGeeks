class Solution
{
    public static void sort012(int arr[], int n)
    {
        
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] < 1) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > 1) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
    public static void swap(int []arr,int low,int high)
    {
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    
}
