class Solution {
    public List<String> buildArray(int[] target, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : target){
            hs.add(i);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=target[target.length-1];i++){
            if(hs.contains(i)){
                ans.add("Push");
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}