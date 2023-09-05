/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
     public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node cur = head;

        while (cur != null) {
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            Node copy = hashMap.get(cur);
            copy.next = hashMap.get(cur.next);
            copy.random = hashMap.get(cur.random);
            cur = cur.next;
        }

        return hashMap.get(head);    
     }
    // public Node copyRandomList(Node head) {
    //     Node curr =head;
    //     while (curr!= null){
    //         Node temp = curr.next;
    //         curr.next = new Node(curr.val);
    //         curr.next.next = temp;
    //         curr =temp;
    //     }
    //     curr=head;
    //     while(curr!= null){
    //             if(curr!=null){
    //                 curr.next.random= (curr.random!= null )?curr.random.next:null;
    //             }
    //             curr=curr.next.next;
    //     }
    //    Node org = head, copy=head.next;
    //    Node temp = copy;
    //    while (copy.next!=null ){
    //        org.next=org.next.next;
    //        copy.next = copy.next.next;
    //        org=org.next;
    //        copy=copy.next;
    //    } 
       
    //    return temp;
    // }
}