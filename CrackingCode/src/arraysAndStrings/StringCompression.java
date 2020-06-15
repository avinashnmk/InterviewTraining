package arraysAndStrings;

public class StringCompression {

	public String stringCompression(String str) {
		
		char[] ans=new char[str.length()];
		int j=0;

		try {
			for(int i=0;i<str.length();) {
				int count =1;
				ans[j++]=str.charAt(i++);
				while(i<str.length()&&str.charAt(i)==str.charAt(i-1)) {
					count++;
					i++;
				}
				String s= String.valueOf(count);
				for(char c:s.toCharArray())
				ans[j++]=c;	
			}
			
			return String.copyValueOf(ans);
			
		} catch (Exception e) {
			return str;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringCompression s= new StringCompression();
		System.out.println(s.stringCompression("abbbbbca"));
	}

}
