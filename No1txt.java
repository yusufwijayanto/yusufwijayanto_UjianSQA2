import java.util.Scanner;

public class No1txt {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
	}

	private static void cetakFibonacci(int batas) {
		// TODO Auto-generated method stub
		int past = 0;
		int current = 1;
		 int fibonacci = 1;
		do {
		           System.out.print(current + " ");
		            fibonacci = past + current;
		            past = current;
		            current = fibonacci;
		} while (current <= batas);
}
}