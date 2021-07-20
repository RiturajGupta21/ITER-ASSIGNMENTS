public class A7qno1 {
	public static boolean isBinaryTreeBST(Node tree){
		return areKeysInRange(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean areKeysInRange(Node tree, Integer lower, Integer upper) {
		if (tree == null)
			return true ;
		else if (Integer.compare(tree.data,lower)<0||Integer.compare(tree.data,upper)>0)
			return false;
		return areKeysInRange(tree.left,lower,tree.data)&& areKeysInRange(tree.right,tree.data,upper);
	}
	public static void main(String args[]) {
		Node.insert(50);
		Node.insert(30);
		Node.insert(20);
		Node.insert(40);
		Node.insert(70);
		Node.insert(60);
		Node.insert(80);
	  	System.out.println(A7qno1.isBinaryTreeBST(Node.root));
	}
}