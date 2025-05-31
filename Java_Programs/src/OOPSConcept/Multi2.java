package OOPSConcept;

class ghilli{
	void village() {
		System.out.println("Ghilli");
	}
	void town() {
		System.out.println("No Ghilli");
	}
}

class cricket extends ghilli{
	void g1() {
		System.out.println("It's from Ghilli");
	}
	
	void place() {
		System.out.println("England");
	}
}

class baseball extends cricket{
	void base() {
		System.out.println("Similar to cricket");
	}
}


public class Multi2 {

	public static void main(String[] args) {
		
		baseball b = new baseball();
		b.village();
		b.town();
		b.g1();
		b.place();
		b.base();
		
		}

}
