class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr[] = new ArrayList[groupSizes.length + 1];
        boolean vis[] = new boolean[groupSizes.length];

        for(int i=0 ; i< arr.length ; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i =0 ; i< groupSizes.length ; i++){
            if(!vis[i]){
            if(arr[groupSizes[i]].size()!=groupSizes[i]){
                arr[groupSizes[i]].add(i);
                vis[i]= true;
            }else{
                List<Integer> temp = new ArrayList<>();
                
                for(int j = i ; j<groupSizes.length ; j++ ){
                    if(groupSizes[j] == groupSizes[i]  ){
                        temp.add(j);
                        vis[j] = true;
                        if(temp.size()== groupSizes[i]){
                            break;
                        }
                    }
                }
            
                ans.add(temp);
            }

            }
        }

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i].size()!=0){
                ans.add(arr[i]);
            }
        }
        return ans;

        
    }
}