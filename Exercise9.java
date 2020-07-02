/*
 * 2020/06/09
 * Exercise 9 in creating a preorder binary tree 
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 */
public class Exercise9 {
	TestDataEX11 testData;
	TreeNode tree;
	
	public static void main(String args[]) {
		Exercise9 ex9 = new Exercise9();
		ex9.execution();
	}
	public void execution() {
		testData = new TestDataEX11();
		tree =  testData.getData();
		preorder(tree);
	}
	
	public void preorder(TreeNode tree) {
		//complete this part
		if(tree == null) {
			return;
		}
		else {

			
			visitTree(tree);
			preorder(tree.left);
			preorder(tree.right);
		}
		
	}
	public void visitTree(TreeNode tree) {
		System.out.print(" " + tree.data);
	}
}
