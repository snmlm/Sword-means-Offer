/**
 * ��̬��̨��
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author xxxxx
 *
 * ˼·��
 * ����˼�룬���һ������������
 * ��n=1ʱ��һ������1�������һ������1������ôf��1��=f��1-1��=1��
 * ��n=2ʱ��һ������1��2�������һ������1������ôf��2��=f��2-1����
 *                   ����һ������2������ôf��2��=f��2-2����
 *                   f��2��=f��2-1��+f��2-2����
 * ��n=3ʱ��һ������1��2��3�������һ������1������ôf��3��=f��3-1����
 * 					           ����һ������2������ôf��3��=f��3-2����
 * 					           ����һ������2������ôf��3��=f��3-3����
 * ��n=nʱ��һ������1��2��3.....n-2��n-1��n,
 * ��ôf��n��=f��n-1��+f��n-2��+f��n-3��.......+f��n-��n-2����+f��n-��n-1����+f��n-n����
 * ��Ϊf��n��=f��0��+f��1��+f��2��+......+f��n-2��+f��n-1����
 * f��n-1��=f��0��+f��1��+f��2��+......+f��n-2����
 * ��ôf��n��=f��n-1��+f��n-1��=2*f��n-1����
 * 
 * 1,2,4,8,16.....
 */
public class Offer_09 {
    public int JumpFloorII(int target) {
    	int a = 1;
    	if(target==0){
    		return -1;
    	}else if(target==1){
    		return 1;
    	}else{
    		for (int i = 2; i <= target; i++) {
				a = a<<1;
			}
    		return a;
    	}
    }
}