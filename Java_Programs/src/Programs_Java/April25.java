package Programs_Java;

import java.util.Arrays;

public class April25 {

	public static void main(String[] args) {
		
		// string reverse 1st method
		String a = "This is April Month and the Year is 2025";
		StringBuilder a1 = new StringBuilder(a);
		a1.reverse();
		System.out.println(a1);
		System.out.println(a);
		
		// string reverse 2nd method
		String a2 = "";
		for(int i=a.length()-1;i>=0;i--) {
			a2+=a.charAt(i);	
		}
		System.out.println(a2);
		
		// string split
		String a3 [] = a.split(" ");
		for(String a4:a3) {
			System.out.println(a4);
		}
		
		String a4 [] = {"Jan","Feb","Mar","Apr","May"};
		System.out.println(a4[3]);
		
		// call all the arrays
		System.out.println(Arrays.toString(a4));
		
		// call last array
		System.out.println(a4[a4.length-1]);
	}
	
}
