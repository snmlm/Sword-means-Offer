
/**
 * ��̨��
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * @author xxxxx
 *
 */
public class Offer_8 {
    public int JumpFloor(int target) {
    	int a = 0;
    	int b = 1;
    	int c = 0;
    	if(target<0){
    		return -1;
    	}else{
    		for (int i = 1; i <= target; i++) {
				c = a + b;
				a = b;
				b = c;
			}
    		return c;
    	}
    }
}
