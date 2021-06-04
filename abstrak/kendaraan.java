/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;
/**
 *
 * @author ASUS
 */
public abstract class kendaraan {

    private String merk;
    private String model;
    private int jumlahRoda;

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getJumlahRoda() {
        return jumlahRoda;
    }
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public abstract void nyalakan();
}
