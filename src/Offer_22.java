import java.util.ArrayList;

/**
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author xxxxx
 * 
 * 思路：
 * 难点在于“同层节点从左至右打印”。中间的同层怎么合并。
 * 想要获取下层集合，那么就要知道上层集合。
 */
public class Offer_22 {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root==null){
			return list;
		}
		ArrayList<TreeNode> up = new ArrayList<>();
		up.add(root);
		while(!up.isEmpty()){
			TreeNode temp = up.remove(0);
			if(temp.left!=null){
				up.add(temp.left);
			}
			if(temp.right!=null){
				up.add(temp.right);
			}
			list.add(temp.val);
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		Offer_22 aa = new Offer_22();
		TreeNode a1 = aa.new TreeNode(1);
		TreeNode a2 = aa.new TreeNode(2);
		TreeNode a3 = aa.new TreeNode(3);
		TreeNode a4 = aa.new TreeNode(4);
		TreeNode a5 = aa.new TreeNode(5);
		TreeNode a6 = aa.new TreeNode(6);
		TreeNode a7 = aa.new TreeNode(7);
		TreeNode a8 = aa.new TreeNode(8);
		TreeNode a9 = aa.new TreeNode(9);
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;
		a4.left = a8;
		a4.right = a9;
		aa.PrintFromTopToBottom(a1);
	}
}
