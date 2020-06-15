package arraysAndStrings;

import java.util.Arrays;

public class URLify {
	
	/**
	 * Write a method to replace all spaces in a string with'%20'.
	 * You may assume that the string has sufficient spaces at the end to 
	 * hold the additional characters and that you 
	 * are given the "true" length of the string.
	 * 
	 */
	
	public char[] uRLify(char[] str, int len) {
		
		int j= str.length-1;
		for(int i =len-1;i>=0;i--) {
			if(str[i]!=' ') {
				str[j]=str[i];
				j--;
			}
			else {
				if(i+1!=str.length&&str[i+1]!=' ') {
					str[j--]='0';
					str[j--]='2';
					str[j--]='%';
					
				}
			}
		}
		
		return Arrays.copyOfRange(str, j+1, str.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URLify u = new URLify();
		char[] s = u.uRLify("Mr John Smith    ".toCharArray(), 13);
		System.out.println(s);
	}

}
