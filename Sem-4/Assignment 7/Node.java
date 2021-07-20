public class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
	}
	static Node root;
	public static void insert(int key){
		Node node=new Node(key);
		if(root==null) {
			root = node;
			return;
		}
		Node prev=null;
		Node temp=root;
		while (temp!=null){
			if(temp.data>key){
				prev=temp;
				temp=temp.left;
			}
			else if (temp.data<key){
				prev=temp;
				temp=temp.right;
			}
		}
		if(prev.data>key)
			prev.left=node;
		else
			prev.right=node;
	}
}