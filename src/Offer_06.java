/**
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author xxxxx
 *
 * 思路
 * 二分法，时间复杂度O（logn）
 * 遍历，O（n）
 * 在没有重复项的时候，可以用二分法进行。
 * 在于缩小查询范围。数量级比较大的时候，可以考虑多线程，进行分段检索。
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
		boolean flag = length % 2 > 0 ;//偶数
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
