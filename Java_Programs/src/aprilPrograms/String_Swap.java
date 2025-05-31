package aprilPrograms;

public class String_Swap {

	public static void main(String[] args) {


		String a = "10";
		String b = "20";
		
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		String c=b;
		b=a;
		a=c;
		
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
