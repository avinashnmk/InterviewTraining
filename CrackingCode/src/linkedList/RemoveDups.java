package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
	
	public Node removeDups(Node head) {
		
		Set<Integer> set = new HashSet<Integer>();
		Node node = head;
		set.add(node.data);
		while(node.next!=null) {
			if(set.contains(node.next.data))
				node.next=node.next.next;
			else {
				set.add(node.next.data);
				node=node.next;
				
			}
		}
		
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n= new Node(7);
		n.next=new Node(8);
		n.next.next=new Node(7);
		n.next.next.next=new Node(9);
		n.next.next.next.next=new Node(7);

		RemoveDups r = new RemoveDups();
		n=r.removeDups(n);
		
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}

}
