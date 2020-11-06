/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan38.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan perhitungan lingkaran
 *                     dalam konsep berbasis objek
 */

import java.util.Scanner;

public class Tester {
    static Scanner sc = new Scanner(System.in);
    private static double diameterLingkaran;
    
    private static void validasi(String rad) {
        if(!rad.matches("^[0-9]*$")) {
            System.out.println("Nilai Diamater Tidak Sesuai!!");
            masukkanDiameter();
        } else {
            diameterLingkaran = Double.parseDouble(rad);
        }
    }
    
    private static void masukkanDiameter() {
        System.out.println("====Perhitung Lingkaran====");
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
        validasi(sc.next());
    }
    
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        masukkanDiameter();
        lingkaran.hitung(diameterLingkaran);
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}