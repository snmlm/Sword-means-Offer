/**
 * �����������ĺ����������
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No��
 * �������������������������ֶ�������ͬ��
 * @author xxxxx
 * 
 * ˼·��
 * �����������Ӹߵ��ͣ�����Ҷ����⣬���н������ҽ�㶼���ڡ�
 * ��ȫ�������������������ټ���Ҷ��㣬�������ҷ��ӽ�㡣
 * ƽ����������������������������������ĸ߶Ȳ�ľ���ֵ������1������������������Ҳ����ƽ������
 * �������������������߶����������н����������ӽ��󣬱��������ӽ��С��
 * ǰ�������� DLR
 * ���������� LDR
 * ���������� RLD
 * ֪��������֮�󣬾ͻᷢ�֣������������ĺ�����������һλ�Ǹ��ڵ㡣��ȥ���һλ��ʣ�µĽڵ���Էֳ������֡�
 * ͬ��������Ҳ��������������������ݹ鷽ʽ������ѭ����ʽ��
 */
public class Offer_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length==0){
    		return false;
    	}
		return Recursion(sequence,0,sequence.length-1);
    }
    
    public boolean Recursion(int [] sequence,int start,int root) {
    	if(start>=root){
    		return true;
    	}
    	int i = root;
    	while(i>start&&sequence[i-1]>sequence[root]){
    		i--;
    	}
    	for (int j = start; j < i-1; j++) {
			if(sequence[j]>sequence[root]){
				return false;
			}
		}
		return Recursion(sequence,start,i-1)&&Recursion(sequence,i,root-1);
	}
}
