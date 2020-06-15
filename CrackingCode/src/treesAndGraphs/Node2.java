package treesAndGraphs;

/**
 * @author akandaswamy
 *
 */
public class Node2 {
	
	public String name;
	public Node2[] children;

	public Node2(String n) {
		this.name=n;
		this.children=null;
	}
	
	public static Node2 initialize() {
		Node2 n = new Node2("One");
		n.children= new Node2[]{new Node2("Two"), new Node2("Three"), new Node2("Four")};
		
		n.children[0].children=new Node2[]{new Node2("Five"), new Node2("Six")};
		n.children[1].children=new Node2[]{new Node2("seven"), n.children[2]};
		n.children[2].children=new Node2[]{n};
		
		return n;
		/**
		 * one->two -> three->Four
		 * two->5->6
		 * three->7->4
		 * 4->1
		 */
	}
}
