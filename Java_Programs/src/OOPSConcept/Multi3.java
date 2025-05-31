package OOPSConcept;

class laptop{
	void dell() {
		System.out.println("dell laptop");
	}
	
	void lenovo() {
		System.out.println("lenovo laptop");
	}
}

class tab extends laptop{
	void samsung() {
		System.out.println("samsung tab");
	}
	
	void mi() {
		System.out.println("mi tab");
	}
}

class mobile extends tab{
	void nothing() {
		System.out.println("nothing mobile");
	}
	
	void iphone() {
		System.out.println("iphone");
	}
}

public class Multi3 {

	public static void main(String[] args) {
		
		mobile m = new mobile();
		m.dell();
		m.lenovo();
		m.samsung();
		m.mi();
		m.nothing();
		m.iphone();
		

	}

}
