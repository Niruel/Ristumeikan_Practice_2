/*
 * 2020/06/09
 * Exercise 11 in creating a inorder binary tree 
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * */
public class Exercise11 {
	TestDataEX11 testData;
	TreeNode tree;
	public static void main(String args[] ) {
		Exercise11 ex11 = new Exercise11();
		ex11.execution();
	}
	public void execution() {
		testData = new TestDataEX11();
		tree =  testData.getData();
		inorder(tree);
		
	}
	public void inorder(TreeNode tree) {
		//complete this part
		if(tree == null) {
			return;
		}
		else {
			if(tree.left != null) {
				inorder(tree.left);
			}
			visitTree(tree);
			if(tree.right!= null) {
				inorder(tree.right);
			}
			
		}
		
	}
	public void visitTree(TreeNode tree) {
		System.out.print(" " + tree.data);
	}
}
