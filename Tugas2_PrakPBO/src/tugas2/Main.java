/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
interface MenghitungBidang{
    double PHI = 3.14;
    public void CariLuas(double r);
}

interface MenghitungRuang{
    double PHI = 3.14;
    public void CariVolume(double r, double t);
}

class Bidang {
    double p, l, r;
    void cariKeliling(double p, double l) {
        System.out.println("Keliling Persegi Panjang adalah = " + (2 * (p + l)));
    }
    void cariKeliling(double r) {
        System.out.println("Keliling Lingkaran adalah = " + (2 * 3.14 * r));
    }    
}

class Ruang {
    double p, l, r, t;
    void cariLuasPermukaan(double p, double l, double t) {
        System.out.println("Luas Permukaan Balok adalah = " + (2 * (p * l + p * t + l * t)));
    }
    void cariLuasPermukaan(double r, double t) {
        System.out.println("Luas Permukaan Tabung adalah = " + (2 * 3.14 * r * (r + t)));
    }
}

class PersegiPanjang extends Bidang{
    public void CariLuas(double p, double l) {
        System.out.println("Luas Persegi Panjang adalah = " + (p * l));
    }
}

class Lingkaran extends Bidang implements MenghitungBidang{
    @Override
    public void CariLuas(double r) {
        System.out.println("Luas Lingkaran adalah = " + (PHI * r * r));
    }
}

class Balok extends Ruang{
    public void CariVolume(double p, double l, double t){
        System.out.println("Volume Balok adalah = " + (p * l * t));
    }
}

class Tabung extends Ruang implements MenghitungRuang{
    @Override
    public void CariVolume(double r, double t){
        System.out.println("Volume Tabung adalah = " + (PHI * r * r * t));
    }
}

class Tugas2 {
    public static void main(String args[]) {
        double a, b, c, p, l, t, r;
        int ulang = 1, pilih;
        Scanner s = new Scanner(System.in);
        PersegiPanjang per = new PersegiPanjang();
        Lingkaran lin = new Lingkaran();
        Balok bal = new Balok();
        Tabung tab = new Tabung();
        
        while (ulang==1 && ulang!=0) {
            System.out.print("===============\n");
            System.out.print("  Menu Utama\n");
            System.out.print("===============\n");
            System.out.print("1. Hitung Balok\n");
            System.out.print("2. Hitung Tabung\n");
            System.out.print("0. Exit\n");
            System.out.print("Pilih: ");
            pilih = s.nextInt();

            switch (pilih) {
                case 1:            
                    System.out.print("Input Panjang: ");
                    p = s.nextDouble();
                    System.out.print("Input Lebar: ");
                    l = s.nextDouble();
                    System.out.print("Input Tinggi: ");
                    t = s.nextDouble();
                    per.CariLuas(p, l);
                    per.cariKeliling(p, l);
                    bal.CariVolume(p, l, t);
                    bal.cariLuasPermukaan(p, l, t);
                    break;
                case 2:
                    System.out.print("Input Tinggi: ");
                    t = s.nextDouble();
                    System.out.print("Input Jari - jari: ");
                    r = s.nextDouble();
                    lin.CariLuas(r);
                    lin.cariKeliling(r);
                    tab.CariVolume(r, t);
                    tab.cariLuasPermukaan(r, t);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Input Error!\n");
                    break;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
            ulang = s.nextInt();
        }
    }
}
