import java.util.Stack;

/**
 * ������ջʵ�ֶ���
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������
 * �����е�Ԫ��Ϊint���͡�
 * @author xxxxx
 *
 * ջ������ȳ���LIFO-last in first out��
 * ���У��ֽ��ȳ���FIFO-first in first out��
 * ˼·��
 * stack1Ϊ��ڣ�stack2Ϊ���ڡ�
 * push��ʱ��ֻѹ��stack1��
 * pop��ʱ��stack2û�����ݣ��ʹ�stack1�����ݵ��룬stack1������stack2ѹ�롣
 * pop��ʱ��stack2�����ݵ�ʱ��ֱ�ӵ�����
 */
public class Offer_05 {
	//push
    Stack<Integer> stack1 = new Stack<Integer>();
    //pop
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()&&!stack1.empty()){
			while(!stack1.empty()){
	    		stack2.push(stack1.pop());
	    	}
		}
		return stack2.pop();
    }
}
