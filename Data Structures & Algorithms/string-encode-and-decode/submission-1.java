class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();
        for(String s:strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();

        

    }

    public List<String> decode(String str) {

        List<String> dec=new ArrayList();

        int i=0,j=0;

        while(j<str.length()) {
            while(str.charAt(j)!='#') {
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            i=j+1;
        
            dec.add(str.substring(i,i+len));
            i+=len;
            j=i+1;
            
        }

        return dec;


        

    }
}
