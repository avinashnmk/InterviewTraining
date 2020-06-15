package treesAndGraphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RouteBetweenNodes {

	public boolean routeBetweenNodes(Node s,Node t) {
		
		Queue<Node> q= new LinkedList<Node>();
		
		Set<Node> visited = new HashSet<Node>();
		q.add(s);
		while(!q.isEmpty()) {
			Node curr=q.poll();
			if(curr.equals(t))
				return true;
			if(!visited.contains(curr)) {
				visited.add(curr);
				if(curr.children!=null)
				for(Node child:curr.children) {
					q.add(child);
				}
				
			}
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RouteBetweenNodes r = new RouteBetweenNodes();
		Node n= Node.initialize();
		
		System.out.println(r.routeBetweenNodes(n.children[0].children[1], n.children[2]));
	}

}
