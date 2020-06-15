package linkedList;

public class Intersection {
	
	public Node intersection(Node n1,Node n2) {
		if (n1==null ||n2==null)
			return null;
		Node n1Runner=n1;
		Node n2Runner=n2;
		
		while(n1Runner!=null&&n2Runner!=null) {
			n1Runner=n1Runner.next;
			n2Runner=n2Runner.next;
		}
		if(n1Runner==null) {
			Node temp=n2;
			while (n2Runner!=null) {
				temp=temp.next;
				n2Runner=n2Runner.next;
			}
			n2Runner=temp;
			n1Runner=n1;
		}
		else if(n2Runner==null) {
			Node temp=n1;
			while (n1Runner!=null) {
				temp=temp.next;
				n1Runner=n1Runner.next;
			}
			n1Runner=temp;
			n2Runner=n2;
		}
		while(n1Runner!=null&&n2Runner!=null) {
			if(n1Runner==n2Runner)
				return n1Runner;
			n1Runner=n1Runner.next;
			n2Runner=n2Runner.next;
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n2= Node.initialize2();
		
		Node n1= Node.initialize(); 
		n1.next.next.next.next=		n2.next.next.next.next.next.next.next.next;
		Node.print(n1);
		Node.print(n2);
		Intersection i= new Intersection();
		
		Node ans =i.intersection(n1, n2);
		Node.print(ans);
	}

}
