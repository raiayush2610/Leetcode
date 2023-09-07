class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
            Set<Integer> keyset =map.keySet();
            for(Integer key: map.keySet()){
                if(map.get(key)>nums.length/3){
                    al.add(key);
                }
            }
        
        return al;
    }
}