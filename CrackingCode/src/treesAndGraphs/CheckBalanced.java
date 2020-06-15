package treesAndGraphs;

public class CheckBalanced {

	public boolean checkBalanced(Node n) {
		return dfs(n,0,0,true);
	}
	
	private boolean dfs(Node n, int left,int right, boolean b) {
		
		if(n==null) {
			if(Math.abs(left-right)>=2)
				b=false;
			
			return b;
		}
		b=dfs(n.left, left+1, right, b);
		b=dfs(n.right,left,right+1,b);
		
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n= Node.inialize();
		CheckBalanced c = new CheckBalanced();
c.checkBalanced(n);	
	}

}
