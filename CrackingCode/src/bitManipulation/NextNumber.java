package bitManipulation;

public class NextNumber {
/**
 * Given a positive integer, print the next smallest and the next largest number that have the same number
 * if 1 bits in their binary representation 
 * @param args
 * @throws Exception 
 */
	
	public int[] nextNumber(int number) throws Exception {
		int mask = number ^ (~0);
		if (mask==0) {
			throw new Exception("Number has all 1s");
		}
		
		int bigger=0,smaller=0;
		if(number ==0)
			throw new Exception("Number has all 0s");
		int temp = number;
		int i=0;
		int highestZero=0;
		while (temp!=0) {
			if((temp^1)==0 ) {
				highestZero=i;

			}
			i++;
			temp>>>=1;
		}
		if()
		
	return new int[] {smaller,bigger};	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
