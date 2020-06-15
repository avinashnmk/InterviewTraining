package arraysAndStrings;

public class PalindromePermutation {
/**
 *  Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the smae forwrod and backwards.
 *  A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictonary words
 *  You can ignore casing and non-letter characters.
 *  
 * @param args
 */
	
	public boolean palindromePermutation(String str) {
		boolean ans=false;
		
		str=str.toLowerCase();
		boolean[] b = new boolean;
		for(char c: str.toCharArray()) {
			
		}
	
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromePermutation p= new PalindromePermutation();
		System.out.println(p.palindromePermutation("Tact COa"));
				
	}

}
