public class A6qno3 {
	BinaryTreeNode<Integer> root;
	public static int sumrootleaf(BinaryTreeNode<Integer> root,int sum) {
		if (root == null)
			return 0;
		sum=sum*2+root.data;
		if (root.left==null&&root.right==null)
			return sum;
		return sumrootleaf(root.left,sum)+sumrootleaf(root.right,sum);
	}
	public static void main(String[] args) {
		A6qno3 tree = new A6qno3();
	    tree.root=new BinaryTreeNode<Integer>(1);
	    tree.root.left=new BinaryTreeNode<Integer>(0);
		tree.root.right=new BinaryTreeNode<Integer>(1);
		tree.root.left.left=new BinaryTreeNode<Integer>(1);
		tree.root.left.right=new BinaryTreeNode<Integer>(0);
	    tree.root.right.left=new BinaryTreeNode<Integer>(1);
		tree.root.right.right=new BinaryTreeNode<Integer>(1);
		System.out.println(sumrootleaf(tree.root,0));
	}
}
