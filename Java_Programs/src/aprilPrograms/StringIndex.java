package aprilPrograms;

public class StringIndex {

	public static void main(String[] args) {
		
		String i = "Java Program is used to develop an application";
		
		int i2 = i.indexOf("used");
		
		System.out.println(i2);
		
		// find the length
		int l = i.length();
		System.out.println(l);
		// string replace
		System.out.println(i.replace("application", "SoftwareApp"));
		
		// string substring
		System.out.println(i.substring(15,40));
		
		// String contains
		System.out.println(i.contains("develop"));

	}

}
