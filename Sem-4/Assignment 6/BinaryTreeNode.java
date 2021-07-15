class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode <T> left,right;
	public BinaryTreeNode(T data){
		this.data=data;
		left=right=null;
	}
}