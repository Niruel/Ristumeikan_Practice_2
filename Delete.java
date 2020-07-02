/**
 * 2020/07/02
 * Exercise in Binary search tree deletion
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
public class Delete {
	TreeNode tree;
	TestData testData;
	

	public static void main(String[] args) {
		new Delete();
	}

	public Delete() {
		testData = new TestData();
		tree = testData.getTree();
		testData.showTree(tree);
		System.out.println();
		tree = deleteKey(tree, 32);
		testData.showTree(tree);
		System.out.println();
	}

	public TreeNode deleteKey(TreeNode tree, int key) {
		System.out.print(key + " >>");
		testData.showTree(tree);
		System.out.println();

		if(tree != null) {
			//complete this part
			if(key<tree.getKey()) {
				tree.setLeft(deleteKey(tree.getLeft(),key));
			}
			else if(key>tree.getKey()) {
				tree.setRight(deleteKey(tree.getRight(),key));
			} else {
				if(tree.getLeft()==null) {
					tree= tree.getRight();
				}
				else if(tree.getRight()==null) {
					tree = tree.getLeft();
				}
				else {
					tree.setKey(minValue(tree.getRight()));
				}
			}

			
		}
		return tree;
	}

		public int minValue(TreeNode tree) {
			int minV = tree.getKey();

			while (tree.getLeft() != null) {
				minV = tree.getLeft().getKey();
				tree = tree.getLeft();
			}
			return minV;
		}

	}
