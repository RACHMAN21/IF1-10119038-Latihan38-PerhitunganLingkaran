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
 * Deskripsi Program : program ini berisi class Lingkaran
 */

import java.util.Locale;

public class Lingkaran {
    Locale locale = Locale.forLanguageTag("id");
    private final double PHI = Math.PI;
    private double luas, r, rad, k;
    
    private double hitungLuas() {
        return PHI * Math.pow(r, 2);
    }
    
    private double hitungKeliling() {
        return 2 * PHI * r;
    }
    
    private double hitungJariJari() {
        return rad / 2;
    }
    
    private void tampil(double luas, double r, double k) {
        System.out.println("====Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+r+" cm");
        System.out.printf(locale, "Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf(locale, "Keliling Lingkaran  = %.2f cm%n", k);
    }
    
    public void hitung(double diameterLingkaran) {
       rad = diameterLingkaran;
       r = hitungJariJari();
       luas = hitungLuas();
       k = hitungKeliling();
       tampil(luas,r,k);
    }
}