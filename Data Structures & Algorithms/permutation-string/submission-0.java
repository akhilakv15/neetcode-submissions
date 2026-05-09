class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int w = s1.length();
        int i=0,j=0;
        int[] map=new int[26];
        if(w>s2.length()) return false;
        for(int l=0;l<s1.length();l++) {
            map[s1.charAt(l)-'a']++;
        }
        int c=w;

        while(j<s2.length()) {

            if(map[s2.charAt(j)-'a']>0) {
                c--;
            }
            map[s2.charAt(j)-'a']--;
            j++;

            if(j-i>w) {
                if(map[s2.charAt(i)-'a']>=0) {
                c++;
            }
            map[s2.charAt(i) - 'a']++;
                i++;

            }
            if(c==0) return true;
           
        }

        return false;
        
    }
}
