/**
 * �滻�ո�
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author xxxxx
 *
 * ˼·��
 * ����һ���ַ���ȥ�洢��˼·�򵥣��������ڴ�
 * ��ͬһ���ַ�������������Ҫ�Ȼ�ȡ�ո�ĸ��������ַ�ʽ������ʱ�䣬������ѭ��
 *  ��ǰ����ƶ��ַ������ո����ַ�ÿ�ζ�Ҫ�ƶ�������ʱ��ȵڶ��ָ���
 *  �Ӻ���ǰ�ƶ��ַ������ַ�ֻ�ƶ�һ��
 * ����ֻ���Ӻ���ǰ�ķ�ʽ
 */
public class Offer_2 {
	public String replaceSpace(StringBuffer str) {
		int spaceNum = 0;// �ַ����пո�ĸ���
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexOld = str.length() - 1;// ԭ�����£�����һ���ַ����±�
		// ����StringBuffer���ȣ���Ȼ���п�ָ�룬�ո�%20����ո��2������
		str.setLength(str.length() + spaceNum * 2);
		int indexNew = str.length() - 1;// �³����£�����һ���ַ����±�
		// ��indexNew��indexOld���ʱ��˵��ǰ���û�пո��ˣ������˳�
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
