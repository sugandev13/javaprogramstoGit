package Constructors;

public class Default {
	
	String name;
	int id;
	
	void display() {
		System.out.println(name+" "+id);
	}

	public static void main(String[] args) {
		
		Default d = new Default();
		d.display();
		

	}

}
