package Constructors;

public class Para {
	
	String name;
	int id ;
	
	Para(String Cons,int idno){
		name = Cons;
		id = idno;
	}
	
	void Constructor() {
		System.out.println(name+" parameterized"+" "+id+15);
	}

	public static void main(String[] args) {
		Para p = new Para("one", 1);
		p.Constructor();
		
		Para p1 = new Para("two", 2);
		p1.Constructor();

	}

}
