/**
 * �����е�����k�����
 * ����һ����������������е�����k����㡣
 * @author xxxxx
 *
 * ˼·��
 * ����ѭ����ת������ѭ����ʱ���ϱȽϳ���O(2n);
 * ���ý��Ȳ���ʵ�֣�ʱ��ΪO(n)�������ڼ������������ȾͲ������һ�����ȵ��ף���ô�ڶ������Ⱦ��ǵ����ڼ�����
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

