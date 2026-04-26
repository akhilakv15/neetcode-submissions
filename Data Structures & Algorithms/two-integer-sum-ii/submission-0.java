class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0,r=numbers.length-1;

        while(l<r) {
            if(numbers[l]+numbers[r]==target) {
                return new int[]{l+1,r+1};
            }
            if(target<numbers[l]+numbers[r]) {
                r--;
            }
            else if(target>numbers[l]+numbers[r]) {
                l++;
            }
            
        }


        return new int[]{-1,-1};
    }
}
