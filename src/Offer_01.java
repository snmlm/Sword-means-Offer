/**
 * ��ά�����еĲ���
 * ��Ŀ��
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
 * ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ��������
 * ����������һ����ά�����һ�������ж��������Ƿ��и�������
 * @author xxxxx
 *
 * ˼·�������½ǿ�ʼ�����ұ��x++�������ϱ�С��y--��
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 */
public class Offer_01 {
	public boolean Find(int target, int[][] array) {
		boolean isExist = false;
		// ����
		int lenghtY = array.length;
		for (int i = 0; i < array[0].length;) {
			if (lenghtY - 1 < 0 || i >= array[0].length) {
				return false;
			}
			if (array[lenghtY - 1][i] > target) {
				lenghtY--;
			} else if (array[lenghtY - 1][i] < target) {
				i++;
			} else if (array[lenghtY - 1][i] == target) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
}
