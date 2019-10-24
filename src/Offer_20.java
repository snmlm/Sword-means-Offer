import java.util.Stack;
/**
 * ����min������ջ
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 * @author xxxxx
 *
 * ˼·��
 * �ѵ���ʱ�临�Ӷ�ΪO(1)�ϣ���ô����min����ֱ���õ���С��
 * �������pop������������С��ջ������ôpop֮�󣬵ڶ���Сֵ�ͻ�����Сֵ��
 * ����Ӧ���и�����֮��ļ��ϣ���push��popͬ�����С�
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
