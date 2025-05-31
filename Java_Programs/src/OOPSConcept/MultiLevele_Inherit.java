package OOPSConcept;

class photos{
	void art() {
		System.out.println("Art");
	}
	
	void drawing() {
		System.out.println("drawing");
	}
}

class animations extends photos{
	void ghibli(){
		System.out.println("Ghibli is a Japanese Artist");
	}
}

class anime extends animations{
	void animeArt() {
		System.out.println("Anime is one of the art , it makes photos like animations");
	}
	
	void cartoon() {
		System.out.println("Cartoon");
	}
}


public class MultiLevele_Inherit {

	public static void main(String[] args) {
		
		anime a = new anime();
		a.art();
		a.drawing();
		a.ghibli();
		a.animeArt();
		a.cartoon();
		

	}

}
