class Solution {
    static class Row implements Comparable<Row>{
        int val;
        int idx;
        public Row (int val ,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            return r2.val - this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {

        //length
        int res[] = new int [nums.length-k+1];
        int[] ans = new int[nums.length-k+1];
        
        //ArrayList<Integer> ans =new ArrayList<>();
        PriorityQueue<Row> pq= new PriorityQueue<>();
        //  1st window 
        
        for(int i=0; i<k;i++){
            pq.add(new Row(nums[i],i));
        }
         res[0] = pq.peek().val;
        
        for(int i=k; i<nums.length;i++){
            while(pq.size()>0&& pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Row(nums[i],i));
            res[i-k+1]=pq.peek().val;
            
        }
        
        for(int i=0 ;i<res.length;i++){
            ans[i]=res[i];
        }
        return ans;
        
    }
}