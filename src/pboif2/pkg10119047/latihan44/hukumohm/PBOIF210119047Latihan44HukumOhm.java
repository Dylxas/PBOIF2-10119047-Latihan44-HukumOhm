/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan44.hukumohm;

import data.Baterai;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM HUKUM OHM
 */

public class PBOIF210119047Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        
        Baterai baterai2 =  new Baterai(3, 12);
        
        //output
        System.out.println("Kuat Arus : " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan  : " + baterai2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai2.hitungtegangan() + " volt");
    }
    
}
