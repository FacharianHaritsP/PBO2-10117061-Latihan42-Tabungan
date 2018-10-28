/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan42.tabungan;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung saldo tabungan
 */
public class Tabungan {
 private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
 
    
    public int ambilUang(int jumlah){
    
    
    return saldo - jumlah;
    }
    
}
