
public class Inorder {
	
	public void showTree(TreeNode tree) {
		if(tree != null) {
			showTree(tree.getLeft());
			show(tree);
			showTree(tree.getRight());
		}
	}
	public void show(TreeNode tree) {
		System.out.print(" " + tree.getKey());
	}

}
