package No3;

import java.util.Scanner;

public class No3Main {

		public static void main(String[] args) {	

		Scanner in = new Scanner (System.in);
		
		double kecepatan, waktu, jarak;
		
		System.out.print("Masukkan jarak (kilometer) = ");
		jarak = in.nextDouble();
		
		System.out.print("Masukkan waktu (jam) = ");
		waktu = in.nextDouble();
		
		kecepatan = jarak/waktu;
		
		System.out.println("Kecepatan rata-rata anda adalah "+ kecepatan + " km/jam");
		
		}
	}