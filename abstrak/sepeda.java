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
public class sepeda extends kendaraan{
    private boolean isAuto;

    //override
    public void nyalakan() {
        int kecepatanSepeda = 0;
        System.out.println("Yuk kita gowes sepeda bersama ! ");
        System.out.println("sekarang kecepatan sepedamu adalah "+kecepatanSepeda+" km/jam");
    }

    //
    void jenis(){
        if (isAuto){
            System.out.println("Sepeda otomatis");
        }else {
            System.out.println("Sepeda kayuh");
        }
    }
}