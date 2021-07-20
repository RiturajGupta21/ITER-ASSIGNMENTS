import java.util.*;
public class A7qno3 {
	public static List<Integer> findKLargestlnBST(Node tree, int k){
		List<Integer> kLargestElements=new ArrayList <>();
		findKLargestlnBSTHelper(tree,k,kLargestElements);
		return kLargestElements;
	}
	public static void findKLargestlnBSTHelper(Node tree,int k,List<Integer> kLargestElements) {
		if (tree!=null&&kLargestElements.size()<k){
			findKLargestlnBSTHelper(tree.right,k, kLargestElements);
			if (kLargestElements.size()<k) {
				kLargestElements.add(tree.data);
				findKLargestlnBSTHelper(tree.left , k, kLargestElements);
			}
		}
	}
	public static void main(String args[]) {
		Node.insert(50);
		Node.insert(30);
		Node.insert(20);
		Node.insert(40);
		Node.insert(70);
		Node.insert(60);
		Node.insert(80);
		System.out.println(A7qno3.findKLargestlnBST(Node.root,4));
	}
}
