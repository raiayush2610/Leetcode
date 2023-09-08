class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        List<Integer> al =new ArrayList<>();
      
       for(int n :nums1){
           set.add(n);
       }
       for(int n: nums2){
           if(set.contains(n)){
               al.add(n);
               set.remove(n);
           }
       }
        int  arr[]= new int[al.size()];
       for(int i=0;i<al.size();i++){
           arr[i]=al.get(i);
       }
       return arr;
    }
}