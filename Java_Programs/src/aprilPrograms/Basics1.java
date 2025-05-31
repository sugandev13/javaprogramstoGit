package aprilPrograms;

import java.util.Arrays;

public class Basics1 {

	public static void main(String[] args) {
		
		String t = "Good Bad Ugly movie is released world wide today";
		
		StringBuilder t1 = new StringBuilder(t);
		t1.reverse();
		System.out.println(t1);
		System.out.println(t);
		
		String t2 = "";
		for(int i=t.length()-1;i>=0;i--) {
			t2 += t.charAt(i);
		}
		System.out.println(t2);
		System.out.println(t);
		System.out.println(" ");
		
		String t3 [] = t.split(" ");
		for (String t4 : t3) {
			System.out.println(t4);
		}
		
		System.out.println(" ");
		String t4 [] = {"Good","Bad","Ugly","Ajith","GV","Aadik"};
		System.out.println(t4[3]);
		System.out.println(t4[4]);
		
		System.out.println(Arrays.toString(t4));
		
		System.out.println(t4[t4.length-1]);

	}

}
