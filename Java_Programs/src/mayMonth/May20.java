package mayMonth;

import java.util.Arrays;

public class May20 {

	public static void main(String[] args) {
		
		// String Reverse 1st Method
		String t = "Today's Date is May 20 and the Day is Tuesday.";
		StringBuilder t1 = new StringBuilder(t);
		t1.reverse();
		System.out.println(t1);
		System.out.println(t);
		System.out.println(" ");
		
		// String Reverse 2nd Method
		
		String t2 = "";
		for(int i = t.length()-1; i>=0; i--) {
			t2 += t.charAt(i);
		}
		System.out.println(t2);
		System.out.println(t);
		System.out.println(" ");
		
		// String Split
		String [] t3 = t.split(" ");
		for (String t4 : t3) {
			System.out.println(t4);
		}
		System.out.println(" ");
		
		// arrays
		String [] t4 = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		System.out.println(t4[5]);
		System.out.println(t4[7]);
		
		// call all the arrays
		System.out.println(Arrays.toString(t4));
		
		// call last array
		System.out.println(t4[t4.length-1]);
		
		// string length
		
		int sizeOfString = t.length();
		System.out.println("The Length of the String is = "+sizeOfString);
		
		// string contains 
		System.out.println(t.contains("May"));
		
		// string to uppercase
		System.out.println(t.toUpperCase());
		
		// string lowercase
		System.out.println(t.toLowerCase());

	}

}
