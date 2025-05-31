package mayMonth;

import java.util.Arrays;

public class May08 {

	public static void main(String[] args) {
		// String Reverse 1st Method
		String e = "Today is a Most Memorable Day in My Life";
		StringBuilder e1 = new StringBuilder(e);
		e1.reverse();
		System.out.println(e1);
		System.out.println(e);

		// String Reverse 2nd Method
		String e2 = "";
		for(int i=e.length()-1;i>=0;i--) {
			e2+= e.charAt(i);
		}
		System.out.println(e2);
		System.out.println(" ");

		// String Split
		String e3 [] = e.split(" ");
		for (String e4 : e3) {
			System.out.println(e4);
		}

		// String Array
		System.out.println(" ");
		String e5 [] = {"Jan","Feb","Mar","Apr","May","Jun","July"};
		System.out.println(e5[5]);
		System.out.println(e5[6]);

		// Call All The String Arrays
		System.out.println(Arrays.toString(e5));

		// Call LastOne
		System.out.println(e5[e5.length-1]);

		// String length
		int e6 = e.length();
		System.out.println(e6);
		
		// String Contains
		System.out.println(e.contains("Memorable"));
		
		if(e.contains("Most")) {
			System.out.println("It Contains That Word");
		}else {
			System.out.println("It's not Contained that word");
		}
	}

}
