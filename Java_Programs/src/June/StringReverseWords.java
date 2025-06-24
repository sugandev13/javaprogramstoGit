package June;

public class StringReverseWords {

	public static void main(String[] args) {
		
		String s = "RCB won the IPL Trophy 2025";
		String s1 [] = s.split(" ");
		StringBuilder s2 = new StringBuilder();
		
		for(int i = s1.length-1;i>=0;i--) {
			s2.append(s1[i]);
			
			 if(i !=0) {
				s2.append(" ");
			}
		}
		
		System.out.println(s2.toString());
	}

}
