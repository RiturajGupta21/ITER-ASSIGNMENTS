import java.util.*;
public class A7qno4 {
	public static Node deleteNode(Node tree,int k){
	  if (tree==null)
	    return tree;
	  if (tree.data>k){
	    tree.left=deleteNode(tree.left, k);
	    return tree;
	  }
	  else if (tree.data< k){
	    tree.right=deleteNode(tree.right, k);
	    return tree;
	  }
	  if (tree.left==null){
	    Node temp=tree.right;
	    return temp;
    }
	  else if (tree.right==null){
	    Node temp=tree.left;
	    return temp;
    }
	  else{
	    Node succParent=tree;
	    Node succ=tree.right;
	    while (succ.left!=null){
	      succParent=succ;
	      succ=succ.left;
	    }
	    if (succParent!=tree)
	      succParent.left=succ.right;
	    else
	      succParent.right=succ.right;
	      tree.data= succ.data;	 
	      return tree;
	    }
	}
	public static void inorder(){
	  Node temp=Node.root;
	  Stack<Node> stack=new Stack<>();
	  while (temp!=null||!stack.isEmpty()){
	    if(temp!=null){
	      stack.add(temp);
	      temp=temp.left;
	    }
	    else {
	      temp=stack.pop();
	      System.out.print(temp.data+" ");
	      temp=temp.right;
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
		A7qno4.inorder();
		System.out.println();
		A7qno4.deleteNode(Node.root, 70);
		A7qno4.inorder();
	}
}
