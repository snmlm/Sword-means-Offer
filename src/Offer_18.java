/**
 * 二叉树的镜像
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树 
 *  	    8
 *  	   /  \
 *  	  6   10
 *  	 / \  / \
 *  	5  7 9  11
 *  	镜像二叉树
 *  	    8
 *  	   /  \
 *  	  10   6
 *  	 / \  / \
 *  	11 9 7  5
 * @author xxxxx
 * 
 * 思路：
 * 直接置换，递归。简单的不可思议。。。。
 * 
 */
public class Offer_18 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
    public void Mirror(TreeNode root) {
        if(root!=null){
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
}
