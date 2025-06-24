package aprilPrograms;

public class ReverseString {


	public static void main(String[] args) {

		String s = "This is the reverse string";
		String[] words = s.split(" ");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);

			if (i != 0) {
				reversed.append(" ");
			}
		}

		System.out.println(reversed.toString());
	}

}
