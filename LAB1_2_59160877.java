import java.util.Scanner;

public class LAB1_2_59160877 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		isSum(n);

		System.out.println(isSum(n));
	}

	private static int isSum(int n) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int i = 1;i<= n;i++) {
			
			sum += i;
		}
		return sum;
	}
}
