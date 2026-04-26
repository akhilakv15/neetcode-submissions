class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        Set<Integer> set=new HashSet();
        for(int num:nums) {
            set.add(num);
        }
        int l=1;

        for(int i=0;i<nums.length;i++) {
            int num=nums[i];
            if(set.contains(num-1)) {
                continue;
            } else {
                int c=1;
                while(set.contains(num+1)) {
                    c++;
                    num=num+1;
                }
                l=Math.max(l,c);
            }
        }

        return l;
        
    }
}
