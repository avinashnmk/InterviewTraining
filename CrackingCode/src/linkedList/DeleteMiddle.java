package linkedList;

public class DeleteMiddle {
	
	public Node deleteMiddle(Node head) {
		Node fast=head.next;
		Node slow= head;
		
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n=Node.initialize();
		DeleteMiddle d= new DeleteMiddle();
		Node.print(n);
		n=d.deleteMiddle(n);
		Node.print(n);
	}

}
