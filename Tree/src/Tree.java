import java.util.Scanner;

class TreeNode{
	int data;
	TreeNode left, right, adjLeft, adjRight;
	
	public TreeNode(int value) {
		data = value;
		left = right = adjLeft = adjRight = null;
	}
} 
public class Tree {
	TreeNode root;

	public static void main(String[] args) {
		int treeHeight;
		System.out.println("Specify the height of the tree:");
		Scanner s = new Scanner(System.in);
		treeHeight = s.nextInt();
		if(treeHeight == 0) {		
			System.out.println("Invalid height");
		}else {
			generateTree(treeHeight);
		}		
	}
	
	static void generateTree(int height) {
		int temp = 1;
		Tree tree = new Tree();
		if(height == 1) {
			tree.root=new TreeNode(1);
			return;
		}
		if(!(temp>height)) {
			
		}
	}
	void adjNodes(TreeNode p) {
		if(p==null) {
			return;
		}
		
	}
	
}
