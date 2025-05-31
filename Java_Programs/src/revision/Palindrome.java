package revision;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "MalayalaM";
		String s1 = new StringBuilder(s).reverse().toString();
		System.out.println(s.equals(s1));

	}

}
