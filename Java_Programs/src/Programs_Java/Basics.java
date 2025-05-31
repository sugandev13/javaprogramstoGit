package Programs_Java;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		
		String t = "Today is Tuesday and the Date is 04-03-2025";
		
		StringBuilder t1 = new StringBuilder(t);
		t1.reverse();
		System.out.println(t);
		System.out.println(t1);
		
		String t2 = "";
		for(int i = t.length()-1;i>=0;i--) {
			t2 += t.charAt(i);
		}
		System.out.println(t2);
		System.out.println(t);
		
		String t3 [] = t.split(" ");
		for(String t4 : t3) {
			System.out.println(t4);
		}
		
		String t4 [] = {"04","05","06","07","08","09","10","11"};
		
		System.out.println(t4[5]);
		System.out.println(t4[6]);
		
		System.out.println(Arrays.toString(t4));
		
		System.out.println(t4[t4.length-1]);
		
	}

}
