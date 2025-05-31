package March_2025;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=10, n1=0, n2=1;
		System.out.println("Fibonacci Series :"+n1+" "+n2);
		for(int i=2;i<n;i++) {
			int n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
