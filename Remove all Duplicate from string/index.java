class Solution {
    String removeDuplicates(String str) {
       Set<Character> set = new HashSet<>();
       String ans = "";
       for(char ch:str.toCharArray())
       {
          if(!set.contains(ch)){
               set.add(ch);
               ans+=ch;
          }
       }
       return ans;
    }
}
