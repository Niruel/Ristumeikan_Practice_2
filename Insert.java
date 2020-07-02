/**
 * 2020/06/30
 * Exercise in Binary search tree insertion
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
public class Insert {

	TreeNode tree;
	TestData testData;
	
	
	public static void main(String[] args) {
		new Insert();
	}
	
	public Insert() {
		testData = new TestData();
		tree = testData.getTree();
		testData.showTree(tree);
		System.out.println();
		tree = insertKey(tree,68);
		testData.showTree(tree);
		System.out.println();
	}
	public TreeNode insertKey(TreeNode tree, int key) {
		System.out.print(key + " >>");
		testData.showTree(tree);
		System.out.println();
		
		//Complete this part
		if(tree == null) {
			tree = new TreeNode(key,null, null);
			
		}
		else {
			if(key<tree.getKey()) {
				tree.setLeft(insertKey(tree.getLeft(),key));
			}
			else {
				tree.setRight(insertKey(tree.getRight(),key));
			}
		}
		return tree;
	}
}
