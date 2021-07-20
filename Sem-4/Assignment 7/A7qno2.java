public class A7qno2 {
	public static Node findFirstGreaterThanK(Node tree,Integer k){
		Node subtree=tree,firstSoFar=null;
		while (subtree!=null) {
			if (subtree.data>k) {
				firstSoFar = subtree;
				subtree = subtree.left ;
			}
			else 
			  subtree = subtree.right ;
		}
		return firstSoFar;
	}
	public static void main(String args[]) {
		Node.insert(50);
		Node.insert(30);
		Node.insert(20);
		Node.insert(40);
		Node.insert(70);
		Node.insert(60);
		Node.insert(80);
		System.out.println(A7qno2.findFirstGreaterThanK(Node.root,45));
	}
}
