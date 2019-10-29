/**
 * ������������˫������
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * @author xxxxx
 * 
 * ˼·��
 * �ݹ鷽ʽ��
 * ����������������ʱ��Ҫ��������ֵ��һ�������ڵ㣬һ�����Ҳ�ڵ㡣
 * ��4�����
 * ���1��      2
 *      1   3
 * ��ô���ڵ�ͷ���1���Ҳ�ڵ����3
 * ���2��      2
 *      1   #
 * ��ô���ڵ�ͷ���1���Ҳ�ڵ����2
 * ���3��      2
 *      #   3
 * ��ô���ڵ�ͷ���2���Ҳ�ڵ����3
 * ���4��      2
 *      #   #
 * ��ô���ڵ�ͷ���2���Ҳ�ڵ����2�����4�����1�������㣬���Դ���3��������ɡ�
 * ������������ʱ���õ����ص��Ҳ�ڵ㡣
 * ������������ʱ���õ����ص����ڵ㡣
 * ֮��������ɡ�
 */
public class Offer_26 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	private TreeNode leftLast = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        //���4
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            leftLast = pRootOfTree;
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        if(left!=null){
            leftLast.right = pRootOfTree;
            pRootOfTree.left = leftLast;
        }
        //���2
        leftLast = pRootOfTree.right!=null?pRootOfTree.right:pRootOfTree;
        TreeNode right = Convert(pRootOfTree.right);
        if(right!=null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        //���3
        return left!=null?left:pRootOfTree;
    }
    
    
    public static void main(String[] args) {
        Offer_26 aa = new Offer_26();
        TreeNode a1 = aa.new TreeNode(4);
        TreeNode a2 = aa.new TreeNode(6);
        TreeNode a3 = aa.new TreeNode(8);
        TreeNode a4 = aa.new TreeNode(10);
        TreeNode a5 = aa.new TreeNode(12);
        TreeNode a6 = aa.new TreeNode(14);
        TreeNode a7 = aa.new TreeNode(16);
        a4.left = a2;
        a4.right = a6;
        a2.left  = a1;
        a2.right = a3;
        a6.left  = a5;
        a6.right = a7;
        aa.Convert(a4);
    }
}
