package linkedList;

public class SumList {

	public Node sumList(Node N1, Node N2) {


		Node n1 = N1;
		Node n2 = N2;
		if (n1.next == null && n2.next == null)
			return null;
		while (n1 != null && n2 != null) {
			boolean carry = n1.data + n2.data > 9 ? true : false;
			n2.data = (n1.data + n2.data) % 10;

			if (carry) {
				n2.next = n2.next == null ? new Node(1) : n2.next;
				n2.next.data += 1;
			}
			n1 = n1.next;
			n2 = n2.next;
		}

		if (n1.next != null)
			n2.next = n1.next;
		else if (n2.data == 10) {
			while (n2 != null) {
				boolean carry = n2.data > 9 ? true : false;
				n2.data = n2.data % 10;
				if (carry) {
					n2.next = n2.next == null ? new Node(1) : n2.next;
					n2.next.data += 1;
				}
				n2 = n2.next;
			}
		}

		return N2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node N2 = Node.initialize();
		Node N1 = Node.initialize2();
		Node.print(N1);
		Node.print(N2);
		SumList s = new SumList();
		Node ans = s.sumList(N1, N2);
		Node.print(ans);

	}

}
