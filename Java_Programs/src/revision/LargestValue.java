package revision;

public class LargestValue {

	public static void main(String[] args) {
		
		int [] high = {12,45,78,96,93};
		int  max = high[0];
		
		for(int i = 0 ; i<high.length;i++) {
			if(high[i]>max) {
				max = high[i];
			}
		}
			System.out.println(max);
	}

}
