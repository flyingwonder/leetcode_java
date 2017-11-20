package lc023;


public class lc023 {
	Solution s = new Solution();
	
	int[] nums = {1,0,0,0,4,-1};
	System.out.println(s.mergeKLists(null));
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode l2 = null;
        for(int i = 0;i<lists.length;i++){
            ListNode l1 = lists[i];
            l2 = mergeTwoLists(l1,l2);
        }
        return l2;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(-1);
        ListNode result = l;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l.next = l1;
                l1 = l1.next;
            }else{
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        l.next = (l1 == null)?l2:l1;
        return result.next;
    }
}



