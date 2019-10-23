/**
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author xxxxx
 *
 * 思路：
 * 两次循环或转倒叙在循环，时间上比较长，O(2n);
 * 利用进度差来实现，时间为O(n)。倒数第几个，两个进度就差几，当第一个进度到底，那么第二个进度就是倒数第几个。
 */

public class Offer_14 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null||k==0){
    		return null;
    	}
    	ListNode head1 = head;
    	ListNode head2 = head;
    	int i=1;
    	while (head1.next!=null&&k>i++) {
    		head1 = head1.next;
		}
    	if(k>i){
    		return null;
    	}
    	while(head1.next!=null){
    		head1 = head1.next;
    		head2 = head2.next;
    	}
    	
		return head2;
    }
}

