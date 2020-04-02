/**
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author xxxxx
 *
 * 思路：
 * 前插思想
 * 标记奇数最新未前移的下标和偶数第一个数的下标，奇数前插，中间数组后移。
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
