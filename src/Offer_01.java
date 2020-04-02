/**
 * 二维数组中的查找
 * 题目：
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序，
 * 请完成一个函数，
 * 输入这样的一个二维数组和一个整数判断数组中是否含有该整数。
 * @author xxxxx
 *
 * 思路：从左下角开始，向右变大（x++），向上变小（y--）
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 */
public class Offer_01 {
	public boolean Find(int target, int[][] array) {
		boolean isExist = false;
		// 纵向
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
