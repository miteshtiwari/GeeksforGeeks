
// Time limit exceed
class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        for(int i:arr){
            if(memo.containsKey(i)){
                memo.put(i,memo.get(i)+1);
            }
            else{
                memo.put(i,1);
            }
        }
        int repeating=0;
        int mising=0;
        for(int i=0;i<=n;i++){
            if(!memo.containsKey(i)){
                mising = i;
            }
             if(memo.containsKey(i)){
                if(memo.get(i)>1){
                repeating = i;
            }
            }
        }
       
        int [] ans = new int [2];
        ans[0]=repeating;
        ans[1]=mising;
        return ans;
    }
}

//---------------------------------------
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ar[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            ar[arr[i]]++;
        }
        
        int mis=-1;
        int rep=-1;
        
        for(int i=1;i<ar.length;i++){
            if(ar[i]==2){
                rep=i;
            }
            if(ar[i]==0){
                mis=i;
            }
        }
        
        int result[]={rep,mis};
        return result;
        
    }
}
