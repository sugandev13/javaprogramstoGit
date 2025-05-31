package Programs_Java;

import java.util.HashSet;

public class DuplicateArrayHashSet {

	public static void main(String[] args) {

		int [] num = {1,2,3,4,5,3,4};

		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for(int num1 : num) {
			if(!seen.add(num1)) {  // If adding fails, it's a duplicate
				duplicates.add(num1);			
			}
		}


		// print the duplicate elements
		for(int dup : duplicates) {
			System.out.println("Duplicate Elements ="+dup);
		}

	}
}
