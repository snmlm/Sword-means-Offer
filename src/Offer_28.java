import java.util.HashMap;

/**
 * �����г��ִ�������һ�������
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * @author xxxxx
 *
 * ˼·��
 * ��򵥾���ֱ�ӱ�����ʱ��ΪO(n)
 * ������ʽ���ǻ�������ʱ�䣬�����п��������������ȶ���
 */
public class Offer_28 {

    public int MoreThanHalfNum_Solution(int[] array) {
        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxNumber = array[0];
        int maxCount = 1;

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int count = map.get(array[i]);
                map.put(array[i], ++count);
                if(count>maxCount){
                    maxNumber = array[i];
                    maxCount = count;
                }
                if(maxCount>array.length/2){
                    return maxNumber;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Offer_28 aa = new Offer_28();
        int array[] = {1}; 
        System.out.println(aa.MoreThanHalfNum_Solution(array));
    }
}
