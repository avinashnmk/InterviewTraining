package bitManipulation;

public class BitToWin {
	
	/**
	 * You have an integer and can flip exactly one bit from a 0 or 1. 
	 * Write code to find the length of the longest sequence of 1s you could create
	 * 
	 * Input 1775 11011101111
	 * Output 8
	 */
	public int bitToWin(int a) {
		
		int ans=0;
		int count=0;
		int prevCount=0;
		while(a!=0) {
			if((a&1)==1) {
				count++;
			}
			if((a&1)==0) {
				if((a&2)==0) {
					prevCount=0;
				}
				else
					prevCount=count;
				count=0;
			}
			a>>=1;
			ans=Math.max(ans, count+prevCount+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitToWin b= new BitToWin();
		System.out.println(b.bitToWin(1775));
	}

}
