package revision;

public class Febi {

	public static void main(String[] args) {
		
		int z=15, z1=5, z2=10;
		
		for(int i=5;i<z;i++) {
			int z3 = z1+z2;
			System.out.println(z3);
			z1=z2;
			z2=z3;
		}

	}

}
