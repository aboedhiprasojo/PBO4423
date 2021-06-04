/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
package abstrak.kendaraan;

public class Sepeda {

    private boolean isAuto;
    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }
    public void jenis() {
        System.out.println(isAuto == true ? "Sepeda Otomatis" : "Sepeda Kayuh");
    }
}
