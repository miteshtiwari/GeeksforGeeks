class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        System.out.print(pq);
        return pq.peek();
    } 
}
