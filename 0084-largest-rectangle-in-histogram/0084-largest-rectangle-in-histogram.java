class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea= 0;
        int len= heights.length;
        int nsr[]= new int [heights.length];
        int nsl[]= new int [heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=len;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<len;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<len;i++){
            int h=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea = h* width;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;

    }
}