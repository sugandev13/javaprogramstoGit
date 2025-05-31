package Programs_Java;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		int num [] = {1,2,3,4,5,6};
		
		int temp;
		
		for(int i=0;i<num.length/2;i++) {
			
			temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
		}
		
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+"");
		}

	}

}
