class Solution {
    public boolean isPalindrome(String s) {

        int l=0,r=s.length()-1;
        while(l<r) {
            if(!isAlphaNum(s.charAt(l))) {
                l++;
                continue;
            }
            if(!isAlphaNum(s.charAt(r))) {
                r--;
                continue;
            }
            if(toLower(s.charAt(l))!=toLower(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;


        
    }

    public boolean isAlphaNum(char c) {
        if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9') return true;
        return false;
    }

    public char toLower(char c) {
        if(c>='A'&&c<='Z') {
            return (char)(c+('a'-'A'));
        }

        return c;
    }
}
