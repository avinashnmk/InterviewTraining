package arraysAndStrings;

public class CheckPermutation {
	
	/**
	 * Given two strings, write a method to decide if one is a permutation of other?
	 * @param args
	 */
	
	public boolean checkPermutation(String A, String B) {
		boolean ans=false;
		
		if(A.length()!=B.length())
			return ans;
		int[] a = new int[256];
		for(int i =0; i<A.length();i++) {
			a[A.charAt(i)]+=1;
			a[B.charAt(i)]-=1;
		}
		for(int b:a) {
			if(b!=0)
				return ans;
		}
		ans=true;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPermutation c= new CheckPermutation();
		System.out.println(c.checkPermutation("Avi", "vai"));
	}

}
