import java.util.ArrayList;
/**
 * �������к�Ϊĳһֵ��·��
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * @author xxxxx
 * 
 * ˼·��
 * �ݹ������
 */
public class Offer_24 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
	private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	if(root == null){
    		return listAll;
    	}
    	list.add(root.val);
    	target -= root.val;
    	if(target == 0 && root.left == null && root.right == null){
    		listAll.add(new ArrayList<Integer>(list));
    	}
    	FindPath(root.left,target);
    	FindPath(root.right,target);
    	list.remove(list.size()-1);
    	return listAll;
    }
    
}
