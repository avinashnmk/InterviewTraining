package arraysAndStrings;

public class OneAway {

	
	public boolean oneAway(String one, String two) {
		boolean ans=false;
		
		one=one.toLowerCase();
		two=two.toLowerCase();
		if(one.equals(two))
			return true;
		if(insert(one,two))
			return true;
		if(remove(one,two))
			return true;
		if(replace(one,two))
			return true;
		
		return ans;
	}
	private boolean replace(String one, String two) {
		int[] alp=new int[26];
		for(char a:one.toCharArray()) {
			alp[a-'a']++;
		}
		for(char a:two.toCharArray()) {
			alp[a-'a']--;
		}
		int sum=0;
		boolean diff=false;
		for(int i:alp) {
			sum+=i;
			if(i==1)
				diff=true;
		}
		if(sum==0&&diff)
			return true;
		return false;
	}
	private boolean insert(String one, String two) {
		// TODO Auto-generated method stub
		int[] alp=new int[26];
		for(char a:one.toCharArray()) {
			alp[a-'a']++;
		}
		for(char a:two.toCharArray()) {
			alp[a-'a']--;
		}
		int sum=0;
		for(int i:alp)
			sum+=i;
		if(sum==1)
			return true;
		return false;
	}
	private boolean remove(String one, String two) {
		
		int[] alp=new int[26];
		for(char a:two.toCharArray()) {
			alp[a-'a']++;
		}
		for(char a:one.toCharArray()) {
			alp[a-'a']--;
		}
		int sum=0;
		for(int i:alp)
			sum+=i;
		if(sum==1)
			return true;
		
		
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OneAway o = new OneAway();
		String one="A";
		String two= "a";
		
		System.out.println(o.oneAway(one, two));
	}

}
