package Constructors;

public class Parameterized_Constructor {
	
	int amt;
	String name;
	
	Parameterized_Constructor(int amt1 , String mobile){
		amt = amt1;
		name = mobile;
	}
	
	public void constructor() {
		System.out.println("The Amount is "+amt+" "+"The Name is "+name);
	}
	

	public static void main(String[] args) {
		
		Parameterized_Constructor a = new Parameterized_Constructor(12000, "Redmi 12");
		a.constructor();
		
		Parameterized_Constructor b = new Parameterized_Constructor(14000, "Redmi 13");
		b.constructor();
		

	}

}
