package OOPSConcept;

class cinema{
	void tamil() {
		System.out.println("MGR & Sivaji");
	}
	
	void music() {
		System.out.println("MSV & RM");
	}
	void name2() {
		System.out.println("Kollywood");
	}
}

class cinema1 extends cinema{
	void telugu() {
		System.out.println("NTR and RR");
	}
	void name() {
		System.out.println("Tollywood");
	}
}

class cinema2 extends cinema{
	void malayalam() {
		System.out.println("MM & ML");
	}
	void name1() {
		System.out.println("Mollywood");
	}
}


public class Hier2 {

	public static void main(String[] args) {
		
		System.out.println("Cinema");
		cinema c = new cinema();
		c.tamil();
		c.music();
		c.name2();
		System.out.println(" ");
		
		System.out.println("cinema1");
		cinema1 c1 = new cinema1();
		c1.telugu();
		c1.name();
		c1.tamil();
		c1.music();
		c1.name2();
		System.out.println(" ");
		
		System.out.println("cinema2");
		cinema2 c2 = new cinema2();
		c2.malayalam();
		c2.name1();
		c2.tamil();
		c2.music();
		c2.name2();
		System.out.println(" ");
	}

}
