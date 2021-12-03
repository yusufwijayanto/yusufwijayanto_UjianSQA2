import java.util.Scanner;

public class No2txt {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan merk kendaraan = ");
		String merk = in.nextLine();
		System.out.println("Masukkan tipe kendaraan = ");
		String tipe = in.nextLine();
		System.out.println("Masukkan tahun pembuatan = ");
		int tahun = in.nextInt();
		int pajak = hitungPajak (tahun);
		System.out.println("Pajak tahunan untuk "+merk+" "+tipe+" tahun "+tahun+ " adalah Rp. "+pajak);
		}
		static int hitungPajak(int produksi) {
		int pajak;
		if (produksi>2020) {
		return pajak = 4000000;
		}else if (produksi>2010) {
		return pajak = 2000000;
		}else if(produksi>2000){
		return pajak = 1000000;
		}else if(produksi>1990) {
		return pajak = 750000;
		}else if(produksi>1980) {
		return pajak = 500000;
		}else {
		return pajak = 250000;
		}
		}
}