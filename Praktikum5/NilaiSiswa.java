package Praktikum5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NilaiSiswa {
	public static void main(String[] args) {
		Scanner jmlInput = new Scanner(System.in);
		System.out.println("Masukka Jumlah Data : ");

		int angka = jmlInput.nextInt();

		ArrayList<Siswa> students = new ArrayList<Siswa>();
		for (int i=1; i<=angka; i++) {
			Scanner nim = new Scanner(System.in);
			System.out.println("Masukkan NIM : ");
			String Nim = nim.nextLine();

			Scanner nama = new Scanner(System.in);
			System.out.println("Masukkan Nama : ");
			String Nama = nama.nextLine();

			Scanner nilaiteori = new Scanner(System.in);
			System.out.println("Masukkan Nilai Teori : ");
			int NilaiTeori = nilaiteori.nextInt();

			Scanner nilaipraktik = new Scanner(System.in);
			System.out.println("Masukkan Nilai praktik : ");
			int NilaiPraktik = nilaipraktik.nextInt();

			Siswa items = new Siswa(Nim, Nama, NilaiTeori, NilaiPraktik);
			student.add(items);
		}

		System.out.println("----------");
		System.out.printf("%10s %15s %10s %10s", "NIM", "Nama", "Nilai Teori", "Nilai Praktik");
		System.out.println();
		System.out.println("----------");
		for(Siswa student: students) {
			System.out.format("%10s %15s %10d %10d",
				student.getNim(), student.getNama(), student.getNilaiTeori(), student.getNilaiPraktik());
			System.out.println();
		}
		System.out.println("----------");
	}
}