package bitManipulation;

public class insertion {
	/**
	 * Given two 32-bit numbers, N and m and two bit positions i and j. 
	 * Write a method to insert M into N such that M start at a bit j and ends at bit i. 
	 * YOu can assume that the bits j through i have enough space to fit all of M. 
	 * That is, if M=10011, you can assume that there are at least 5 bits between j and i.
	 *  YOu would not, for example, have j=3 and i=2 because M could not fully fit between bit 3 and bit 2
	 */
	
	
	public int insert(int N, int M, int i, int j) {
		/**
		 * 1. Clear the bits j though i in N
		 * 2. Shift M so that it lines up with bits j though i
		 * 3. Merge N and M
		 */
		
		if(i>j ||  i<0 || j>=32) return 0;

		
		int left=j<31?(~0<<j+1): 0;
		int right =1<<i-1;
		int mask =left|right;
	
		return (N&mask)|M<<i;
		
	}
	public static void main(String[] args) {
		
		insertion i = new insertion();
		System.out.println(
		i.insert(1024, 19, 2, 6));
		
	}
}
