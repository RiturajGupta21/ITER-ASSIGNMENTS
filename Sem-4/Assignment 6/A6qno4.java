public class A6qno4 {
	BinaryTreeNode<Integer> root;
	public static boolean sumrootleaf(BinaryTreeNode<Integer> root,int sum,int targetedsum) {
		if (root==null)
			return false;
		sum+=root.data;
		if (root.left==null&& root.right==null)
			return sum==targetedsum;
		return sumrootleaf(root.left,sum,targetedsum)
		|| sumrootleaf(root.right,sum,targetedsum);
	}
	public static void main(String[] args) {
		A6qno4 tree = new A6qno4();
	    tree.root=new BinaryTreeNode<Integer>(1);
	    tree.root.left=new BinaryTreeNode<Integer>(2);
		tree.root.right=new BinaryTreeNode<Integer>(3);
		tree.root.left.left=new BinaryTreeNode<Integer>(4);
		tree.root.left.right=new BinaryTreeNode<Integer>(5);
	    tree.root.right.left=new BinaryTreeNode<Integer>(6);
		tree.root.right.right=new BinaryTreeNode<Integer>(7);
		System.out.println(sumrootleaf(tree.root,0,10));
	}

}
