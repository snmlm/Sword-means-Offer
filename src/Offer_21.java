import java.util.ArrayList;
/**
 * ��������
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * @author xxxxx
 *
 * ˼·��
 * ������������pushA����ѹ�룬ջ���ȶ�popA��ֵ��
 * ��Ⱦ͵���ջ���������Ƚ�popA����һ��ֵ��
 * ����Ⱦͼ���ѹ�롣
 * �������ж�ջ�Ƿ�Ϊ�գ����˾ͱ�ʾpopA��pushA��һ���������У���Ϊ�վͲ��ǡ�
 * ����û�и�ջ�����ݽṹ������arrayList�ģ���Ҫģ��ջ�����ӡ�
 * ����������add(index,value),ֱ�Ӱ�list����ջȥ����
 * Ҳ��������������飬ϸ�ڵط���Ҫ������ʱ�̻�ȡ���鳤�ȼ��ɡ�
 */
public class Offer_21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	ArrayList<Integer> arrayList = new ArrayList<>();
    	for (int i = 0,j=0; i < popA.length;) {
			arrayList.add(0,pushA[i++]);
			while(j < popA.length && arrayList.get(0)==popA[j]){
				arrayList.remove(0);
				j++;
			}
		}
		return arrayList.isEmpty();
    }
}
