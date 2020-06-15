package bitManipulation;

public class BinaryToString {
/**
 * Given a real number between 0 and 1 that is passed in a double,
 * print the binary representations.
 * if the number cannot be represented accurately in binary with at most 32 characters print error
 */
	
	public String binaryToString(double a) {
		
		StringBuilder ans = new StringBuilder();
		
		while(a>0) {
			
			double r = a*2;
			if(r>=1) {
				ans.append(1);
				a=r-1;
				
			}
			else {
				ans.append(0);
				a=r;
			}
			if(ans.length()>32)
				return "ERROR";
			
			
		}
		
		System.out.println(ans);
		
		
		return ans.toString();
		
	}
public static void main(String[] args) {
		
		BinaryToString b = new BinaryToString();
		System.out.println(b.binaryToString(.01));
		
	}
	
}
