/**
 * 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author xxxxx
 * 
 * 思路：
 * 递归方式。
 * 在左右子树遍历的时候，要返回两个值，一个是左侧节点，一个是右侧节点。
 * 有4中情况
 * 情况1：      2
 *      1   3
 * 那么左侧节点就返回1，右侧节点就是3
 * 情况2：      2
 *      1   #
 * 那么左侧节点就返回1，右侧节点就是2
 * 情况3：      2
 *      #   3
 * 那么左侧节点就返回2，右侧节点就是3
 * 情况4：      2
 *      #   #
 * 那么左侧节点就返回2，右侧节点就是2。情况4是情况1的子树层，所以处理3中情况即可。
 * 遍历左子树的时候，用到返回的右侧节点。
 * 遍历右子树的时候，用到返回的左侧节点。
 * 之后遍历即可。
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
        //情况4
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            leftLast = pRootOfTree;
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        if(left!=null){
            leftLast.right = pRootOfTree;
            pRootOfTree.left = leftLast;
        }
        //情况2
        leftLast = pRootOfTree.right!=null?pRootOfTree.right:pRootOfTree;
        TreeNode right = Convert(pRootOfTree.right);
        if(right!=null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        //情况3
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
