package bitManipulation;

public class Conversion {
/**
 * Write a function to determine the number of bits you would need to flip to convert integer A to integer B
 * 
 * 29 or 11101 to 12 or 01111
 * 2
 * 
 * 
 * 
 * @param args
 */
	
	public int conversion(int A , int B){
		int ans=0;
		
		ans = A^B;
		
		int result=0;
		
		while(ans!=0) {
			if((ans&1)==1)
				result++;
			ans>>=1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conversion a= new Conversion();
		
		System.out.print(a.conversion(33, 15));
	}

}
