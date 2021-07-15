public class A6qno2 {
	BinaryTreeNode<Integer> root;
	public static boolean isSymmetric (BinaryTreeNode <Integer> root) {
		return root==null||checkSymmetric (root.left,root.right);
	}
	public static boolean checkSymmetric(BinaryTreeNode<Integer> lefsubttree,BinaryTreeNode<Integer> rightsubtree) {
		if (lefsubttree==null&&rightsubtree==null) 
			return true ;
		else if (lefsubttree!=null && rightsubtree!=null) {
			return lefsubttree.data==rightsubtree.data 
					&&checkSymmetric(lefsubttree.left,rightsubtree.right)
					&&checkSymmetric (lefsubttree.right,rightsubtree.left);
		}
		return false;
	}
	public static void main(String[] args) {
		A6qno2 tree = new A6qno2();
	    tree.root=new BinaryTreeNode<Integer>(1);
	    tree.root.left=new BinaryTreeNode<Integer>(2);
		tree.root.right=new BinaryTreeNode<Integer>(2);
		System.out.println(isSymmetric(tree.root));
	}
}
