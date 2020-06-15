package linkedList;

/**
 * @author akandaswamy
 *
 */
public class Node {
	Node next=null;
	int data;
	public Node(int d) {
		this.data=d;
	}
	public static Node initialize() {
		Node n= new Node(7);
		n.next=new Node(8);
		n.next.next=new Node(7);
		n.next.next.next=new Node(9);
		n.next.next.next.next=new Node(7);
		n.next.next.next.next.next=new Node(3);
		n.next.next.next.next.next.next=new Node(2);
		n.next.next.next.next.next.next.next=new Node(2);
		return n;
	}
	public static Node initialize2() {
		Node n= new Node(7);
		n.next=new Node(8);
		n.next.next=new Node(7);
		n.next.next.next=new Node(9);
		n.next.next.next.next=new Node(7);
		n.next.next.next.next.next=initialize();
		return n;
	}
	
	public static void print(Node n) {
	while(n!=null) {
		System.out.print(n.data+" ->");
		n=n.next;
	}
	System.out.println("null");
	}

}
