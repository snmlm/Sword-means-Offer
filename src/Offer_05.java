import java.util.Stack;

/**
 * 用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 * @author xxxxx
 *
 * 栈：后进先出（LIFO-last in first out）
 * 队列：现进先出（FIFO-first in first out）
 * 思路：
 * stack1为入口，stack2为出口。
 * push的时候，只压入stack1。
 * pop的时候，stack2没有数据，就从stack1中数据导入，stack1弹出，stack2压入。
 * pop的时候，stack2有数据的时候，直接弹出。
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
