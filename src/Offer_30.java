
/**
 * ���������������
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 * ������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},
 * ����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 * @author xxxxx
 * 
 * ˼·��
 * �ѵ��ڲ��Ǵ�0��ʼ�ġ�Ҳ����˵�м�����Ҳ�㡣
 * ���޵Ļ���ȥ������ĸ�����ӣ�������ôȷ������֮�����������
 *
 */
public class Offer_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0)
            return 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i; j < array.length; j++) {
                temp+=array[j];
                if(max < temp)
                    max = temp;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Offer_30 aOffer_30 = new Offer_30();
        int[] aa = {1,-2,3,10,-4,7,2,-5};
        aOffer_30.FindGreatestSumOfSubArray(aa);
    }
}
