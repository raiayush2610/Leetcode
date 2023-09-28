class Solution {
    public int trap(int[] height) {
        int l =height.length;

        int leftMax[] = new int[l];
        
        leftMax[0]=height[0];
        // left maximax
        for(int i =1;i<l;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[] =new int [l];

        rightMax[l-1]=height[l-1];
       // right max
        for(int i =l-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater =0;
        for(int i = 0;i<l;i++){
            int waterL = Math.min(leftMax[i],rightMax[i])-height[i];
            trappedWater+= waterL;
        }
        return trappedWater;
        
    }
}