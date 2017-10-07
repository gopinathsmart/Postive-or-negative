import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n > 0) {
			System.out.println("positive");
		} else if (n == 0) {
			System.out.println("neither positive nor negative");
		} else {
			System.out.println("negative");
		}
	}

}
