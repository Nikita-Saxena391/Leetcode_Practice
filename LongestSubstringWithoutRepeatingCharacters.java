class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int maxLen=0;
        for(int r=0;r<s.length();r++){
if(set.contains(s.charAt(r))){
    while(l<r&&set.contains(s.charAt(r))){
        set.remove(s.charAt(l));
        l++;
    }
}
maxLen=Math.max(r-l+1,maxLen);
set.add(s.charAt(r));
        }
        return maxLen;
    }
}
