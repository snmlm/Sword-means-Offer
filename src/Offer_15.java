
/**
 * ��ת����
 * ����һ��������ת��������������ı�ͷ��
 * @author xxxxx
 * 
 * ˼·��
 * ����������ת�򼴿ɡ�
 */
public class Offer_15 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public ListNode ReverseList(ListNode head) {
    	ListNode temp = null;
    	ListNode newHead = null;
    	if(head==null){
    		return null;
    	}
    	if(head.next == null){
    		return head;
    	}
    	do {
    		temp = head;
    		head = head.next;
    		temp.next = newHead;
    		newHead = temp;
		} while (head!=null);
		return newHead;
    }
}
