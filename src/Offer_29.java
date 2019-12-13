import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ��С��K����
 * ����n���������ҳ�������С��K������
 * ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * @author xxxxx
 *
 * ˼·��
 * ����topN����
 * ��������Ȼ�������
 * Ҳ���Էֶδ���
 * �������öѴ���
 * �����������ܲ���ȫ���ݱ���������ֻ����������Ч�ʡ�
 * Ͷ��һ�£�����PriorityQueue�Զ�����Ĺ��ܡ�
 */
public class Offer_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        
        for (int i = 0; i < input.length; i++) {
            if(maxHeap.size()<k){
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek() > input[i]){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
      
        for (Integer integer : maxHeap) {
            result.add(integer); 
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Offer_29 aOffer_29 = new Offer_29();
        int[] aa = {4,5,1,6,2,7,3,8};
        aOffer_29.GetLeastNumbers_Solution(aa,4);
        
    }
}
