package linkedList;

public class ReturnKthToLast {

	public int returnKthToLast(Node head, int k) {
		
		Node fast=head;
		Node slow=head;
		int count=0;
		while(fast!=null&& count<k) {	
			count++;
			fast=fast.next;
		}
		
		while(fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		
		
		return slow.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node 
			n=	Node.initialize();
		ReturnKthToLast r = new ReturnKthToLast();
		System.out.println(r.returnKthToLast(n, 3));
		Node.print(n);

	}

}
