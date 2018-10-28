/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan42.tabungan;

import java.util.Scanner;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk menghitung saldo tabungan
 */
public class PBO210117061Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan tabungan awal : " ) ;
        Tabungan tbg = new Tabungan(scn.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scn.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tbg.ambilUang(jumlah));
    }
    
}
