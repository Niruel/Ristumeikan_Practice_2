/*
  * 2020/06/09
 * Exercise 10 in creating a postorder binary tree 
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * */
public class Exercise10 {
	TestDataEX11 testData;
	TreeNode tree;
	
	public static void main(String args[] ) {
		Exercise10 ex10 = new Exercise10();
		ex10.execution();
	}
	public void execution() {
		testData = new TestDataEX11();
		tree =  testData.getData();
		postorder(tree);
		
	}
	public void postorder(TreeNode tree) {
		//complete this part
		if(tree == null) {
			return;
		}
		else {

			postorder(tree.left);
			postorder(tree.right);
			visitTree(tree);
		}
	}
	public void visitTree(TreeNode tree) {
		System.out.print(" " + tree.data);
	}
}
