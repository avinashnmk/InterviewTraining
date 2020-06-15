package treesAndGraphs;

public class MinimalTree {

	public Node minimalTree(int[] a) {
		
		int size=a.length;
		Node root= new Node(a[size/2]);
	
		root=createMinimalTree(a,root,0,size-1);
		return root;
		
		
	}
	private Node createMinimalTree(int[] a, Node curr, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i<0||j>=a.length||i>j)
			return null;
		int mid=(i+j)/2;
		curr=new Node(a[mid]);
		curr.left=createMinimalTree(a, curr.left, i, mid-1);
		curr.right= createMinimalTree(a, curr.left, mid+1, j);
		return curr;
		
	}
	public void main(String[] args) {
		
	}
	
}
