package March_2025;

public class Reverse_A_String {

	public static void main(String[] args) {
		
		String a = "Java Selenium Automation";
		StringBuilder a1 = new StringBuilder(a);
		a1.reverse();
		System.out.println(a1);
		System.out.println(a);
		
		String a2="";
		for(int i=a.length()-1;i>=0;i--) {
			a2+=a.charAt(i);
		}
		System.out.println(a2);
		System.out.println(a);
	}

}
