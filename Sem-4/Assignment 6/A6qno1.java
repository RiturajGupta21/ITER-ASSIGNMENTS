public class A6qno1 {
	BinaryTreeNode<Integer> root;
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root==null)
        	return true;
        if (Math.abs(maxDepth(root.left)-maxDepth(root.right))>1)
        	return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int maxDepth(BinaryTreeNode<Integer> root) {
        if(root==null)
        	return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    } 
	public static void main(String[] args) {
		A6qno1 tree = new A6qno1();
	    tree.root=new BinaryTreeNode<Integer>(1);
	    tree.root.left=new BinaryTreeNode<Integer>(2);
		tree.root.right=new BinaryTreeNode<Integer>(3);
		tree.root.left.right=new BinaryTreeNode<Integer>(4);
	    tree.root.right.left=new BinaryTreeNode<Integer>(5);
	    tree.root.left.right.left=new BinaryTreeNode<Integer>(6);
		tree.root.right.left.right=new BinaryTreeNode<Integer>(7);
		System.out.println(isBalanced(tree.root));
	}

}
