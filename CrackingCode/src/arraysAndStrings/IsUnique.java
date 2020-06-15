package arraysAndStrings;

public class IsUnique {

	/**
	 * implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures? 
	 * @param args
	 */
	
	public boolean isUnique(String input) {
		boolean ans=false;
		int[] c= new int[256];
		
		for(char a:input.toCharArray()) {
			c[a]+=1;
			if(c[a]==2)
				return ans;
		}
		ans=true;
		return ans;
	}
	
	public boolean isUnique2(String input) {
		boolean ans=false;
		int c=0;
		for(char a:input.toCharArray()) {
			int num=1;
			num<<=(a);
			if((c&num)!=0)
				return ans;
			c|=num;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsUnique i = new IsUnique();
		System.out.println(i.isUnique2("Helo  ?"));
	}

}
