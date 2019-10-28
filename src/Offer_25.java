/**
 * ��������ĸ���
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * @author xxxxx
 * 
 * ˼·��
 * �˽������ɵ�����randomָ����������е�ĳ���ڵ㡣
 * ����븴�ӵĻ�����������ͼ�Ͳ��ý��ˣ�����û�������
 * ��ʼ�����鷳�ˣ�������ͱȽϼ��ˣ���������random��ָ�����⡣
 * a�ڵ㸴��Ϊa1�����뵽a֮��
 * �ٴα�����random�ڵ㣬ָ��random.next��
 * ɾ��ԭ�ڵ㡣
 * �������ӵģ�ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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
