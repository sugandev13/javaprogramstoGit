	package OOPSConcept;

class photos1{
	void ghibli() {
		System.out.println("Ghibli Art is trending now");
	}
	
	void made() {
		System.out.println("It is made by a Japanese Artist and his name Ghibli");
	}
}

class anime2 extends photos1{
	void anime1() {
		System.out.println("Anime is also similar to Ghibli");
	}
	
	void cartoon() {
		System.out.println("It is similar to Ghibli and Animations");
	}
}

class japan extends photos1{
	void make() {
		System.out.println("Japan and China are made more anime movies");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		japan j = new japan();
		j.make();
		j.made();
		j.ghibli();
		System.out.println(" ");
		
		anime2 a = new anime2();
		a.anime1();
		a.cartoon();
		a.made();
		a.ghibli();
		
		
		
		

	}

}
