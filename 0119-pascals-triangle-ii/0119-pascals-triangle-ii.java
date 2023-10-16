class Solution {
    public List<Integer> getRow(int ri) {
        List<List<Integer>> pt =new  ArrayList<>();
        
        for(int i=0;i<=ri;i++){
            List<Integer> cu = new ArrayList<>();
            cu.add(1);
             
             if(i>0){
                 List <Integer> pr = pt.get(i-1);

                 for(int j=1;j<pr.size();j++){
                     int sum= pr.get(j)+ pr.get(j-1);
                     cu.add(sum);
                 }
                 cu.add(1);
             }
             pt.add(cu);
        }
        return pt.get(ri);

    }
}