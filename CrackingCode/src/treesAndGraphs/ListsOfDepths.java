package treesAndGraphs;

import java.util.ArrayList;
import java.util.List;

public class ListsOfDepths {
	
	public List<List<Integer>> listsOfDepths(Node n){
		List<List<Integer>> lists= new ArrayList<List<Integer>>();
		
		dfs(lists,n,0);
		return lists;
	}

	private void dfs(List<List<Integer>> lists, Node n, int d) {
		
		if(n==null)
			return;
		if(lists.size()==d) {
			lists.add(d, new ArrayList<Integer>());
			
		}
		
		lists.get(d).add(n.name);
		dfs(lists,n.left,d+1);
		dfs(lists,n.right,d+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = Node.inialize();
		ListsOfDepths l = new ListsOfDepths();
		List<List<Integer>> lists=l.listsOfDepths(n);

		for(List<Integer> list: lists) {
			for(int i: list) {
				System.out.print(i);
			}
			System.out.println("----newline----");
		}
	}

}
