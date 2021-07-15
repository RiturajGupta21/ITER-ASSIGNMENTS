import java.util.*;
public class A6qno5 {
	BinaryTreeNode<Character> root;
	public static List <Character> inOrder(BinaryTreeNode<Character> root) {
		Deque <BinaryTreeNode<Character>>s=new LinkedList <>() ;
		BinaryTreeNode<Character> head=root;
		List <Character> result = new ArrayList <>() ;
		while (!s.isEmpty()||head!=null) {
			if (head != null) {
				s.addFirst(head) ;
				head=head.left ;
			}
			else {
				head =s.removeFirst();
				result.add(head.data) ;
				head=head.right;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		A6qno5 tree = new A6qno5();
	    tree.root=new BinaryTreeNode<Character>('P');
	    tree.root.left=new BinaryTreeNode<Character>('Q');
		tree.root.right=new BinaryTreeNode<Character>('R');
		tree.root.left.right=new BinaryTreeNode<Character>('T');
		tree.root.left.left=new BinaryTreeNode<Character>('S');
	    tree.root.left.right.left=new BinaryTreeNode<Character>('W');
		tree.root.right.left=new BinaryTreeNode<Character>('U');
		tree.root.right.right=new BinaryTreeNode<Character>('V');
		tree.root.right.left.right=new BinaryTreeNode<Character>('X');
		System.out.println(inOrder(tree.root));
	}

}
