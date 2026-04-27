class Solution {
    public int maxArea(int[] heights) {

        int i=0,j=heights.length-1,max=0;

        while(i<j) {

            int h=Math.min(heights[i],heights[j]);
            int w=j-i;
            max=Math.max(max,w*h);

            if(heights[i]<heights[j]) {
                i++;
            }
            else {
                j--;
            }

        }

        return max;
        
    }
}
