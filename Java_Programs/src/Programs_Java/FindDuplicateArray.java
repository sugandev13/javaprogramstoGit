package Programs_Java;

public class FindDuplicateArray {

	public static void main(String[] args) {
		
		int [] Rollno = {1,2,1,2,3,4,5};
		
		for(int i=0;i<Rollno.length-1;i++) {
			for(int j=i+1;j<Rollno.length;j++) {
				if(Rollno[i] == Rollno[j]) {
					System.out.println("Duplicate Element :"+Rollno[i]);
				}
			}
		}

	}

}
