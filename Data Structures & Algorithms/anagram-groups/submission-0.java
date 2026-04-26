class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {

            char[] c = s.toCharArray();
            Arrays.sort(c);

            String ana = new String(c);

            map.putIfAbsent(ana, new ArrayList<>());
            map.get(ana).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
