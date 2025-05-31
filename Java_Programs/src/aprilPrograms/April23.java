package aprilPrograms;

import java.util.Arrays;

public class April23 {

	public static void main(String[] args) {
		
		String s = "Tomorrow is Sachin Tendulkar Birthday and he is 52 years old";
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		System.out.println(s);
		System.out.println(s1);
		
		String s2 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(" ");
		
		String [] s3 = s.split(" ");
		for (String s4 : s3) {
			
			System.out.println(s4);
		}
		
		System.out.println(" ");
		String [] s5 = {"sachin","sehwag","ganguly","dravid","yuvraj","dhoni","kaif"};
		System.out.println(s5[4]);
		System.out.println(s5[0]);
		System.out.println(Arrays.toString(s5));
		System.out.println(s5[s5.length-1]);

	}

}
