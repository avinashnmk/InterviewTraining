package treesAndGraphs;

/**
 * @author akandaswamy
 *
 */
public class Node {
	
	public int name;
	public Node left;
	public Node right;

	public Node(int n) {
		this.name=n;
		this.left=null;
		this.right=null;
	}
	
	public static Node inialize() {
		
		Node n = new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		
		n.right.right=new Node(7);
		n.right.right.left=new Node(8);
		
		
		
		return n;
	}
	
	
}
