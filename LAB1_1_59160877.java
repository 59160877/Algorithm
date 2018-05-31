import java.util.Scanner;

public class LAB1_1_59160877 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		System.out.println("Plese enter number n :");
		long n = kb.nextLong();
		System.out.println("Plese enter number m :");
		long m = kb.nextLong();
		//isMultiple(n,m);
		System.out.println(isMultiple(n,m));
	}

	private static boolean isMultiple(long n, long m) {
		// TODO Auto-generated method stub
		if (n % m == 0) {
			return true;
		}else {
			return false;
		}
	}
}
