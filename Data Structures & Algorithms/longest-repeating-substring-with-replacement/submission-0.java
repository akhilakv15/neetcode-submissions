class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxlen=0,maxf=0;

        int l=0;

        for(int r=0;r<s.length();r++) {
            freq[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(r)-'A']);
            if(r-l+1-maxf>k) {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);

        }
        return maxlen;
    }
}
