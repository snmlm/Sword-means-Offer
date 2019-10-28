/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author xxxxx
 * 
 * 思路：
 * 此解需理解成单链表，random指向的是链表中的某个节点。
 * 如果想复杂的话，环形链表，图就不好解了，我是没想出来。
 * 开始是想麻烦了，单链表就比较简单了，单点在于random的指向问题。
 * a节点复制为a1，插入到a之后。
 * 再次遍历，random节点，指向random.next。
 * 删除原节点。
 * 这个是最坑的（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 
 */
public class Offer_25 {
	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;
	    RandomListNode(int label) {
	        this.label = label;
	    }
	}

    public RandomListNode Clone(RandomListNode pHead){
    	if(pHead==null){
    		return null;
    	}
    	RandomListNode newPHead = pHead;
    	while(newPHead!=null){
    		RandomListNode newNode = new RandomListNode(newPHead.label);
    		RandomListNode temp  = newPHead.next;
    		newPHead.next = newNode;
    		newNode.next = temp;
    		newPHead = newNode.next;
    	}
    	newPHead = pHead;
    	while(newPHead!=null){
    		newPHead.next.random = newPHead.random==null?null:newPHead.random.next;
    		newPHead = newPHead.next.next;
    	}
    	newPHead = pHead;
    	RandomListNode result = pHead.next;
    	while(newPHead.next!=null){
    		RandomListNode cloneNode = newPHead.next;
    		newPHead.next = cloneNode.next;
    		newPHead = cloneNode;
    	}
		return result;
    }
    
    public static void main(String[] args) {
		Offer_25 aa = new Offer_25();
		RandomListNode a1 = aa.new RandomListNode(1);
		RandomListNode a2 = aa.new RandomListNode(2);
		RandomListNode a3 = aa.new RandomListNode(3);
		RandomListNode a4 = aa.new RandomListNode(4);
		RandomListNode a5 = aa.new RandomListNode(5);
		RandomListNode a6 = aa.new RandomListNode(6);
		RandomListNode a7 = aa.new RandomListNode(7);
		RandomListNode a8 = aa.new RandomListNode(8);
		RandomListNode a9 = aa.new RandomListNode(9);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a1.random = a3;
		a2.random = a5;
		a3.random = a1;
		aa.Clone(a1);
	}
}
