/**
 * ��ת�������С����
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author xxxxx
 *
 * ˼·
 * ���ַ���ʱ�临�Ӷ�O��logn��
 * ������O��n��
 * ��û���ظ����ʱ�򣬿����ö��ַ����С�
 * ������С��ѯ��Χ���������Ƚϴ��ʱ�򣬿��Կ��Ƕ��̣߳����зֶμ�����
 */
public class Offer_06 {
	public int minNumberInRotateArray(int [] array) {
		return min(array,0,array.length);
    }
	
	public int min(int [] array,int leftIndex,int length){
		if(length == 0){
			return 0;
		}
		if(length==1){
			return array[leftIndex];
		}
		if(length==2){
			return array[leftIndex]>array[leftIndex+1]?array[leftIndex+1]:array[leftIndex];
		}
		int midIndex;
		boolean flag = length % 2 > 0 ;//ż��
		if(flag){
			midIndex = length / 2 + leftIndex;
		}else{
			midIndex = length / 2 + leftIndex - 1;
		}
		if(array[midIndex] < array[midIndex-1]){
			return array[midIndex];
		}
		if(array[midIndex] > array[midIndex+1]){
			return array[midIndex+1];
		}
		int left;
		int right;
		if(flag){
			length = length / 2;
			left = min(array,midIndex - length,length);
			right = min(array,midIndex + 1,length);
		}else{
			length = length / 2;
			left = min(array,midIndex - length + 1,length - 1);
			right = min(array,midIndex + 1,length);
		}
		if(left == 0 && right == 0)
			return 0;
		if(left != 0 && right != 0)
			return left>right?right:left;
		return 0;
		
	}
	
	public static void main(String[] args) {
		Offer_06 offer_06 = new Offer_06();
		int[] array = {3,4,5,6,7,8,1,2};
		System.out.println(offer_06.minNumberInRotateArray(array));
	}
	
	public void put(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.println("!");
	}
}
