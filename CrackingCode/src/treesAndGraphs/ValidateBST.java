package treesAndGraphs;

public class ValidateBST {
	boolean ans=true;
	public boolean validateBST(Node n) {
		if(n==null)
			return ans;
		
		ans=validateBST(n.left);
		if(n.left!=null)
			ans=ans&n.left.name<=n.name;
		if(n.right!=null)
				ans&=n.right.name>=n.name;
	
		ans=validateBST(n.right);
		return ans;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n= new Node(2);
		n.left=new Node(1);
		n.right=new Node(3);
		ValidateBST v= new ValidateBST();
		
		System.out.println(v.validateBST(n));
		
	}

}
