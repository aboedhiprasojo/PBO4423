/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    int alas, tinggi;
    public Segitiga(int sisi, int alas, int tinggi) {
        super(sisi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void draw() {

    }

    public int getJumlahSisi() {
        return this.getJumlahSisi();
    }

    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public double getKeliling() {
        return 0;
    }
}
