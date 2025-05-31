package Programs_Java;

public class LargestArray {

	public static void main(String[] args) {

		int [] lar = {21,02,85,22,23};
		int max = lar[0];

		for(int i=1;i<lar.length;i++) {
			if(lar[i]>max) {
				max = lar[i];
			}
		}
		System.out.println(max);

	}

}
