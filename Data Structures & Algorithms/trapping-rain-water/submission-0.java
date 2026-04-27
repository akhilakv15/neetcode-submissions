class Solution {
    public int trap(int[] height) {

        int l=0,lmax=0,r=height.length-1,rmax=0,wtr=0;

        while(l<r) {
            if(height[l]<height[r]) {
                if(height[l]>lmax) {
                    lmax=height[l];
                } else {
                    wtr+=lmax-height[l];
                }
                l++;
            }
            else {
                if(height[r]>rmax) {
                    rmax=height[r];
                } else {
                    wtr+=rmax-height[r];
                }
                r--;
            }
        }

        return wtr;
        
    }
}
