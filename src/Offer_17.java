/**
 * 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author xxxxx
 * 
 * 思路：
 * 难点在于树的整体怎么判断，左右子树的遍历也要去比较。
 * 
 */
public class Offer_17 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	if(root1 == null || root2==null){
    		return false;
    	}
    	if(compareTree(root1,root2))
    		return true;
    	if(root1.left!=null){
    		return HasSubtree(root1.left,root2);
    	}
    	if(root1.right!=null){
    		return HasSubtree(root1.right,root2);
    	}
		return false;
    }
    public boolean compareTree(TreeNode root1,TreeNode root2) {
    	if(root1.val == root2.val){
    		if(root2.left!=null){
    			if(root1.left!= null){
    				if(!compareTree(root1.left,root2.left)){
    					return false;
    				}
    			}else{
    				return false;
    			}
    		}
    		if(root2.right!=null){
    			if(root1.right!= null){
    				if(!compareTree(root1.right,root2.right)){
    					return false;
    				}
    			}else{
    				return false;
    			}
    		}
    		return true;
    	}
		return false;
	}
    
    public static void main(String[] args) {
		Offer_17 aa = new Offer_17();
		TreeNode a1 = aa.new TreeNode(1);
		TreeNode a2 = aa.new TreeNode(2);
		TreeNode a3 = aa.new TreeNode(3);
		TreeNode a4 = aa.new TreeNode(4);
		TreeNode a5 = aa.new TreeNode(5);
		TreeNode a6 = aa.new TreeNode(6);
		TreeNode a7 = aa.new TreeNode(7);
		TreeNode a8 = aa.new TreeNode(8);
		TreeNode a9 = aa.new TreeNode(9);
		TreeNode a10 = aa.new TreeNode(10);
		TreeNode a11 = aa.new TreeNode(11);
		TreeNode b1 = aa.new TreeNode(2);
		TreeNode b2 = aa.new TreeNode(4);
		TreeNode b3 = aa.new TreeNode(3);
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;
		a4.left = a8;
		b1.left = b2;
		//b1.right = b3;
		System.out.println(aa.HasSubtree(a1, b1));
	}
}
