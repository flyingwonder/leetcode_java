package lc019;

import java.util.Arrays;


public class lc019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		ListNode head = new ListNode(1);
		
		System.out.println(s.removeNthFromEnd(head, 1).val);
	}

}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p = head;
        ListNode result = head;
        
        for (int i=0; i < n; i++) {
            p = p.next;
        }
        
        while(p != null){
            p = p.next;
            head = head.next;
        }
        
        if (n == 1){
            head.next = null;
        }else{
            head.next = head.next.next;
        }
        return result;
    }
}
