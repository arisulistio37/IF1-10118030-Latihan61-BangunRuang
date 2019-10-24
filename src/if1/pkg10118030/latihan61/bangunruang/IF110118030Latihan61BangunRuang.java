/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : program ini berisi tentang menghitung volume bangun
 *                     ruang
 */
public class IF110118030Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menghitung Bangun Ruang");
        System.out.println("");
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Bola Basket");
        System.out.println("Jari Jari Bola : 7");
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        System.out.println("");
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Tabung");
        System.out.println("Jari Jari Tabung : 10");
        System.out.println("Tinggi : 21");
        System.out.println("Hasil : V = "+Math.ceil(tabung.hitungVolume()));
        System.out.println("");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Kerucut");
        System.out.println("Jari Jari Kerucut : 14");
        System.out.println("Tinggi : 9");
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    } 
}
    
