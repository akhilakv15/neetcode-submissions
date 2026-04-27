class Solution {
    public int lengthOfLongestSubstring(String s) {


        int l=0,r=0,lon=0;
        Set<Character> set=new HashSet();

        while(r<s.length()) {
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                lon=Math.max(lon,set.size());
                r++;
            }
            else {
                while(set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
        }

        return lon;


        
    }
}
