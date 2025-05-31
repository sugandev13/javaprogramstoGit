package Constructors;

public class Default_Constructors {
	
	// constructor is a special method that is used to initialize objects. It is callled automatically when an object is created.
	// has the same name as the class
	
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		Default_Constructors a = new Default_Constructors();
		a.display();
	}

}
