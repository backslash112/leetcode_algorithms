// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/solution/


import java.util.*;


public class bst_search {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);

		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3, node2, node4);

		TreeNode node7 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6, null, node7);

		root.setLeftNode(node3);
		root.setRightNode(node6);

		// System.out.println(findTarget(root, 28));

		System.out.println(bstToList(root));

	}

	// Check if a BST contians the target number.
 	static boolean isContains(TreeNode root, int k) {
 		if (root == null) {
 			return false;
 		}
 		if (root.val == k) {
 			return true;
 		} 
 		if (k < root.val) {
 			return isContains(root.left, k); 			
 		} else {
			return isContains(root.right, k);	
 		}
 	}

 	// Print all the elements from top to buttom.
 	static void getAllElements(TreeNode root) {
 		if (root == null) {
 			return;
 		}
 		if (root != null) {
 			System.out.println(root.val);
 		}
 		getAllElements(root.left);
 		getAllElements(root.right);
 	}

 	static boolean findTarget(TreeNode root, int k) {
 		if (root == null) {
 			return false;
 		} else {
 			return (isContains(root, k - root.val) || findTarget(root.left, k) || findTarget(root.right, k));
 		}
 	}

 	static List<Integer> bstToList(TreeNode root) {
 		List<Integer> result = new ArrayList<Integer>();
 		addAllElementsToList(root, result);
 		return result;
 	}

 	static void addAllElementsToList(TreeNode root, List<Integer> list) {
 		if (root == null) {
 			return;
 		}
 		list.add(root.val);
 		addAllElementsToList(root.left, list);
 		addAllElementsToList(root.right, list);
 	}
}


class TreeNode {

	public TreeNode left;
	public TreeNode right;
	public int val;

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.left = left;
		this.right = right;
		this.val = val;
	}

	public void setLeftNode(TreeNode node) {
		this.left = node;
	}

	public void setRightNode(TreeNode node) {
		this.right = node;
	}

	public int length() {
		return this.length(this);
	}

	public int length(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + this.length(node.left) + this.length(node.right);
	}
}