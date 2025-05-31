package OOPSConcept;

// Hierarchical Inheritance means multiple child classes inherit from a single parent.

class parent{
	void guardian() {
		System.out.println("Parents....");
	}
	void name() {
		System.out.println("Name!!!!");
	}
}

class child1 extends parent{
	void name1() {
		System.out.println("Child 1");
	}
	void school() {
		System.out.println("SCP");
	}
}

class child2 extends parent{
	void age() {
		System.out.println("09");
	}
	void school1() {
		System.out.println("SCP 1");
	}
}

public class HierArchical {

	public static void main(String[] args) {
		
		System.out.println("Child 1");
		
		child1 c1 =new child1();
		c1.name();
		c1.school();
		c1.guardian();
		c1.name();
		
		
		System.out.println("Child 2");
		child2 c2 = new child2();
		c2.age();
		c2.school1();
		c2.guardian();
		c2.name();

	}

}
