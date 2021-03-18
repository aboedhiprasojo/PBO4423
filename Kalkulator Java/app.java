package Kalkulator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kalkulator Sederhana");
        appKalkulator();
    }

    public static void appKalkulator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Angka pertama : ");
        int numbA = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int numbB = scanner.nextInt();

        Kalkulator kalkulator = new Kalkulator(numbA, numbB);
        System.out.println(numbA + " + " + numbB + " = " + kalkulator.tambah());
        System.out.println(numbA + " - " + numbB + " = " + kalkulator.kurang());
        System.out.println(numbA + " / " + numbB + " = " + kalkulator.bagi());
        System.out.println(numbA + " x " + numbB + " = " + kalkulator.kali());
        System.out.println(numbA + " % " + numbB + " = " + kalkulator.modulus());
    }
}