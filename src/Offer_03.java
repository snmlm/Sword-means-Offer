import java.util.ArrayList;

/**
 * ��β��ͷ��ӡ����
 * ����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
 *
 * ˼·��
 * ����˼·�����õݹ飬ѭ������󣬽��в���
 * C++ vector�����ԣ����Բ����ض�λ��
 * java arraylist��Collections�����࣬����ֱ�Ӳ��룬Ȼ��ת
 */
public class Offer_03 {
	public class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}
	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null) {
			if (listNode.next != null) {
				list = printListFromTailToHead(listNode.next);
			}
			list.add(listNode.val);
		}
		return list;
	}
}
