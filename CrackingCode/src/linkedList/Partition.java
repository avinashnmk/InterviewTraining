package linkedList;

public class Partition {

	public Node partition(Node head, int x) {
		Node ans=new Node(-1);
		
		Node ansRunner=ans;
		Node dummyHead=new Node(-1);
		
		dummyHead.next=head;
		Node headRunner=dummyHead;
		while(headRunner.next!=null) {

			if(headRunner.next.data<x) {
				ansRunner.next=new Node(headRunner.next.data);
				ansRunner=ansRunner.next;
				headRunner.next=headRunner.next.next;
				
			}
			else
				headRunner=headRunner.next;
		}
		ansRunner.next=dummyHead.next;
		
		return ans.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n=Node.initialize();
		Partition p= new Partition();
		Node.print(n);
		n=p.partition(n, 0);
		Node.print(n);
	}

}
