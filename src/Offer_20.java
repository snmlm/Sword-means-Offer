import java.util.Stack;
/**
 * 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * @author xxxxx
 *
 * 思路：
 * 难点在时间复杂度为O(1)上，那么就是min函数直接拿到最小。
 * 另外就是pop操作，假设最小在栈顶，那么pop之后，第二最小值就会变成最小值。
 * 所以应该有个排序之后的集合，跟push和pop同步进行。
 * 
 */
public class Offer_20 {
    
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> min = new Stack<>();
	Stack<Integer> temp = new Stack<>();
	int top = -1;
	
    public void push(int node) {
    	top = node;
    	stack.push(node);
    	if(min.isEmpty()){
    		min.push(node);
    	}else{
    		while(!min.isEmpty()){
        		int top = min.pop();
        		if(top>node){
        			min.push(top);
        			min.push(node);
        			break;
        		}else{
        			if(min.isEmpty()){
        				min.push(node);
        				min.push(top);
        				break;
        			}else{
        				temp.push(top);
        			}
        		}
        	}
        	while(!temp.isEmpty()){
        		min.push(temp.pop());
        	}
    	}
    }
    
    public void pop() {
        int temp = stack.pop();
        top = stack.pop();
        stack.push(top);
        min.remove( min.indexOf(temp));
    }
    
    public int top() {
    	return top;
    }
    
    public int min() {
    	int result = min.pop();
    	min.push(result);
		return result;
    }
    
    public static void main(String[] args) {
		Offer_20 aa = new Offer_20();
		aa.push(3);
		aa.push(5);
		aa.push(1);
		aa.push(2);
		aa.push(0);
		//aa.pop();
		System.out.println(aa.min());

	}
}
