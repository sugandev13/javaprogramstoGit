package aprilPrograms;

public class StringContains {

	public static void main(String[] args) {
		
		String c = "Java is a programming language";
		
		if(c.contains("programming")) {
			System.out.println("It contains");
		}else {
			System.out.println("it's not contained");
		}
		
		if(c.contains("language")) {
			System.out.println("It's also contained");
		}else {
			System.out.println("It's not contained that values");
		}

	}

}
