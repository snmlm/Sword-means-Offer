import java.awt.List;

/**
 * �ϲ��������������
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * @author xxxxx
 * 
 * ˼·��
 * ������������������ֱ�ӱȽ���ֵ���ϲ����µ������ɣ�ע��ʣ�������
 */
public class Offer_16 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode newList = new ListNode(0);
    	ListNode tempList = newList;
    	ListNode temp = null;
    	if(list1==null&&list2==null)
    		return null;
    	if(list1==null)
    		return list2;
    	if(list2==null)
    		return list1;
    	while(true){
    		if(list1.val <= list2.val){
    			temp = list1;
    			list1 = list1.next;
    		}else{
    			temp = list2;
    			list2 = list2.next;
    		}
    		newList.next = temp;
    		newList = newList.next;
    		if(list1==null){
    			newList.next = list2;
    			break;
    		}
    		if(list2==null){
    			newList.next = list1;
    			break;
    		}
    	}
		return tempList.next;
    }
    
    public static void main(String[] args) {
		Offer_16 aa = new Offer_16();
		ListNode a1 = aa.new ListNode(1);
		ListNode a2 = aa.new ListNode(2);
		ListNode a3 = aa.new ListNode(3);
		ListNode a4 = aa.new ListNode(4);
		ListNode a5 = aa.new ListNode(5);
		ListNode a6 = aa.new ListNode(6);
		a1.next = a3;
		a3.next = a5;
		a2.next = a4;
		a4.next = a6;
		aa.Merge(a1, a2);
	}
}
