import java.util.ArrayList;

/**
 * ˳ʱ���ӡ����
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author xxxxx
 * 
 * ˼·��
 * ��ȷ���߽磬�����￪ʼת�䡣
 * ������ѭ����ѭ���ķ�ʽ��ֱ��·����һ��ѭ���ڣ��ĸ������ĸ�ѭ����
 * Ҳ�����õ�ѭ���ķ�ʽ����Ҫ�ж����ĸ������ϡ�
 */
public class Offer_19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> result = new ArrayList<>();
    	int width = matrix.length;
    	int Length = matrix[0].length;
    	int up = 0;
    	int down = width-1;
    	int left = 0;
    	int right = Length-1;
    	int i=0;
    	int j=0;
    	int count = 1;
    	while(true){
    		switch (count%4) {
			case 1:
				if(j>right){
					j--;
					i++;
					up++;
					count++;
				}else{
					result.add(matrix[i][j++]);
				}
				break;
			case 2:
				if(i>down){
					right--;
					count++;
					i--;
					j--;
				}else{
					result.add(matrix[i++][j]);
				}
				break;
			case 3:
				if(j<left){
					down--;
					count++;
					j++;
					i--;
				}else{
					result.add(matrix[i][j--]);
				}
				break;
			case 0:
				if(i<up){
					left++;
					count++;
					i++;
					j++;
				}else{
					result.add(matrix[i--][j]);
				}
				break;
			}
    		
    		if(up>down||left>right){
    			break;
    		}
    	}
		return result;
    }
    
    public static void main(String[] args) {
		Offer_19 aa = new Offer_19();
		int[][] a = {{1,2,3,4},{5,6,7,8}};
		ArrayList<Integer> arrayList = aa.printMatrix(a);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
