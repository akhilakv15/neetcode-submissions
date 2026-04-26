class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int n:nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        List<int[]> arr = new ArrayList<>();


        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }

        Collections.sort(arr, (a,b)-> b[0]-a[0]);

        int[] a=new int[k];

        for(int i=0;i<k;i++) {
            a[i]=arr.get(i)[1];
        }

        return a;
        
    }
}
