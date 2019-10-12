/**
 * 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author xxxxx
 *
 * 思路：
 * 用另一个字符串去存储，思路简单，但消耗内存
 * 用同一个字符串做处理，都需要先获取空格的个数，两种方式，但耗时间，做两次循环
 *  从前向后移动字符串，空格后的字符每次都要移动，消耗时间比第二种更多
 *  从后向前移动字符串，字符只移动一次
 * 这里只给从后向前的方式
 */
public class Offer_2 {
	public String replaceSpace(StringBuffer str) {
		int spaceNum = 0;// 字符串中空格的个数
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexOld = str.length() - 1;// 原长度下，最有一个字符的下标
		// 重设StringBuffer长度，不然会有空指针，空格换%20，多空格的2倍长度
		str.setLength(str.length() + spaceNum * 2);
		int indexNew = str.length() - 1;// 新长度下，最有一个字符的下标
		// 当indexNew和indexOld相等时，说明前面就没有空格了，即可退出
		while (indexNew != indexOld) {
			if (str.charAt(indexOld) == ' ') {
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');

			} else {
				str.setCharAt(indexNew--, str.charAt(indexOld));
			}
			indexOld--;
		}
		return str.toString();
	}
}
