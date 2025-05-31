package revision;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		String z = "Today's Date is March 7 and Day is Friday";
		StringBuilder z1 = new StringBuilder(z);
		z1.reverse();
		System.out.println(z1);
		System.out.println(z);
		
		String z2 = "";
		for(int i=z.length()-1;i<=0;i--) {
			z2 += z.charAt(i);
		}
		System.out.println(z2);
		
		String z3 [] = {"String","Int","Long","Float","Double","Boolean","Char","Byte","Short"};
		System.out.println(z3[5]);
		System.out.println(z3[7]);
		
		System.out.println(Arrays.toString(z3));
		
		System.out.println(z3[z3.length-1]);
		
		String z4 [] = z.split(" ");
		for(String z5:z4) {
			System.out.println(z5);
		}

	}

}
