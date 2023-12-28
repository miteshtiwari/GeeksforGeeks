class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> memo = new HashMap<>();
        for(long curr:a1){
            if(memo.containsKey(curr)){
                memo.put(curr,memo.get(curr)+1);
            }
            else{
                memo.put(curr,1L);
            }
        }
        for(long curr:a2){
            if(memo.containsKey(curr)){
                memo.put(curr,memo.get(curr)-1);
            }
            if(!memo.containsKey(curr)){
                return "No";
            }
             if(memo.get(curr)==0){
                memo.remove(curr);
            }
        }
        // System.out.println(memo);
        return "Yes";
    }
}
