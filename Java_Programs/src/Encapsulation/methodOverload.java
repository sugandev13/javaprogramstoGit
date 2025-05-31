package Encapsulation;

//  METHOD OVERLOAD
//  Method overloading is a concept in Java where multiple methods in the same class 
//  share the same name but have different parameter lists (i.e., different number, types, or order of parameters).

class calculator{
	int add (int a , int b) {
		return a*b;
	}
	
	String add (String a, String b) {
		return a+b;
	}
	
	double add (double a,double b) {
		return a+b;
	}
}

public class methodOverload {

	public static void main(String[] args) {
		
		calculator c = new calculator();
		System.out.println(c.add(20, 3));
		System.out.println(c.add("Thurs", "Day"));
		System.out.println(c.add(2.3, 2.3));
		
	}

}
