import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * 思路：
 * 正常思路：利用递归，循环到最后，进行插入
 * C++ vector的特性，可以插入特定位置
 * java arraylist有Collections工具类，可以直接插入，然后反转
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
