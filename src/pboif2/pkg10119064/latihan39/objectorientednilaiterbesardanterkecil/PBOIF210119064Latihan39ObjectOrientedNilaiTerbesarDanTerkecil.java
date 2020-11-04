/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan39.objectorientednilaiterbesardanterkecil;

import data.Nilai;
import data.Petugas;
import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk mencari nilai terbesar
 * dan nilai terkecil
 */
public class PBOIF210119064Latihan39ObjectOrientedNilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek nilai
        Nilai n = new Nilai();
        
        //inisialisasi objek petugas
        Petugas p = new Petugas();
        
        //input
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        p.setNama(keyboard.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n.setBanyakMhs(keyboard.nextInt());
        
        for (int i = 0; i < n.getBanyakMhs(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+ (i+1) + " = ");
            n.setNilai(keyboard.nextInt());
        }
        
        //output
        n.tampilHasil();
        System.out.println("\nPetugas : " + p.getNama());
    }
    
}
