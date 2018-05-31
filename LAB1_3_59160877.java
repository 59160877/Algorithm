import java.util.Scanner;

public class LAB1_3_59160877 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		int n = kb.nextInt();
		
		if(n>2) {
			int a =intput(n);
			 System.out.println(a);
		}

		
	}

	private static int intput(int n) {
		// TODO Auto-generated method stub		
		int count =0;
		for (int i = 0;i<=n;i++) {
			 n=n/2;
			 count++;
			 if(n<2) {
				
			 }
		}
		return count++;
	}

}
