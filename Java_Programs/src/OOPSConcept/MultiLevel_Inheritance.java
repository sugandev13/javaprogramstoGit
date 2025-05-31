package OOPSConcept;

// Multilevel inheritance inherits a class from another class

class animal {
	void eat() {
		System.out.println("Eating....");
	}
}

class dog extends animal {
	void sound() {
		System.out.println("Barking....");
	}
}

class babydog extends dog{
	void weep() {
		System.out.println("Weeping...");
	}
	
	void name() {
		System.out.println("Name");
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		babydog z = new babydog();
		z.weep();
		z.name();
		z.eat();
		z.sound();

	}

}
