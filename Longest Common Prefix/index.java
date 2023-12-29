class Solution{
    String longestCommonPrefix(String arr[], int n){
        String a = arr[0];
        String b = arr[1];
        int i=0;
        int j=0;
        String res = "";
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j)){
                res+=a.charAt(i);
            }
            else{
                break;
            }
            i++;
            j++;
        }
        if(res.length()==0){
            return "-1";
        }
        return res;
    }
}
