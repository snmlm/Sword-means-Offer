/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿��
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * @author xxxxx
 *
 * ˼·��
 * ǰ��˼��
 * �����������δǰ�Ƶ��±��ż����һ�������±꣬����ǰ�壬�м�������ơ�
 */
public class Offer_13 {
    public void reOrderArray(int [] array) {
    	int leftIndex = -1;
    	int rightIndex = -1;
    	boolean flag = true;
        for (int i = 0; i < array.length; i++) {
			if((array[i]&1)==1&& rightIndex<i){
				rightIndex = i;
			}
			if(flag&&(array[i]&1)==0&&leftIndex<i){
				leftIndex = i;
				flag=false;
			}
			if(leftIndex < rightIndex&&leftIndex!=-1){
				changeIndex(array,leftIndex,rightIndex);
				rightIndex = leftIndex;
				leftIndex++;
			}
		}
    }
    
    public void changeIndex(int[] array,int leftIndex,int rightIndex) {
    	int temp = array[rightIndex];
		for (int i = rightIndex; i > leftIndex; i--) {
			array[i]=array[i-1];
		}
		array[leftIndex] = temp;
	}
}
