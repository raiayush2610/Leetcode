/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode temp= head;
        List<ListNode> parts = new ArrayList<>();
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int bs = size/k;
        int extra= size%k;
        temp=head;
        for(int i=0;i<k;i++){
            int ps= bs+(extra>0 ? 1:0);
                ListNode ph=null,pt=null;

                for(int j=0;j<ps;j++){
                    if(ph==null){
                        ph=pt=temp;
                    }else{
                        pt.next=temp;
                        pt=pt.next;
                    }
                    if(temp!=null){
                        temp=temp.next;
                    }
                }
                if(pt!=null){
                    pt.next=null;
                }
                parts.add(ph);
                extra=Math.max(extra-1,0);
  
        }
        return parts.toArray(new ListNode[0]);
        
    }
}