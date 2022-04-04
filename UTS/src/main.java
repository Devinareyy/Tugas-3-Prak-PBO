
import java.util.*;  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inter
 */
public class main {
    public static void main(String[] args) {
        int pilih, ulang=1;
        double proto=0, creativity=0, programming=0, coding=0, debugging=0, innovation=0, decision=0, communication=0, design=0;
        
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        System.out.println("+------------------------------+");
        System.out.println("| Pelamaran Lowongan Pekerjaan |");
        System.out.println("+------------------------------+");
        System.out.println("Terdapat 3 posisi yang kosong:");
        System.out.println("    1. Programmer");
        System.out.println("    2. Designer");
        System.out.println("    3. Manager");
        System.out.print("Pilih pekerjaan yang dilamar : ");
        System.out.print("\n");
        pilih = s.nextInt();
        
        System.out.println("=== FORMULIR PELAMAR ===");
        System.out.print("Nama Lengkap : ");
        String nama = s.next();
        System.out.println("\n");
        
        System.out.println("--- Penilaian ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        System.out.println("\n");
        
        switch (pilih) {
            case 1:            
                System.out.print("Nilai Programming Knowledge: ");
                programming = s.nextDouble();
                if(programming<0 || programming>100){
                    programming = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Clean Coding: ");
                coding = s.nextDouble();
                if(coding<0 || coding>100){
                    coding = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Debugging: ");
                debugging = s.nextDouble();
                if(debugging<0 || debugging>100){
                    programming = s.nextDouble();
                }
                System.out.print("\n\n");
                break;
            case 2:
                System.out.print("Nilai Design Portfolio: ");
                design = s.nextDouble();
                System.out.print("\n\n");
                System.out.print("Nilai Prototyping: ");
                proto = s.nextDouble();
                System.out.print("\n\n");
                System.out.print("Nilai Creativity: ");
                creativity = s.nextDouble();
                System.out.print("\n\n");
                break;
            case 3:
                System.out.print("Nilai Innovation: ");
                innovation = s.nextDouble();
                System.out.print("\n\n");
                System.out.print("Nilai Decision Making: ");
                decision = s.nextDouble();
                System.out.print("\n\n");
                System.out.print("Nilai Communication: ");
                communication = s.nextDouble();
                System.out.print("\n\n");
                break;
            default:
                System.out.print("Input Error!\n");
                break;
        }
        while (ulang!=3){
            System.out.print("\n");
            System.out.print("+++ MENU +++\n");
            System.out.print("\t1. Tampilkan Hasil\n");
            System.out.print("\t2. Ubah Nilai Pelamar\n");
            System.out.print("\t3. Keluar\n");
            System.out.print("Pilih: ");
            ulang = s.nextInt();
            switch(ulang){
                case 1:
                    switch(pilih){
                        case 1:
                            Programmer pro = new Programmer();
                            pro.bobotProgrammer(programming, coding, debugging, nama);
                            break;
                        case 2:
                            Designer des = new Designer();
                            des.bobotDesigner(design, proto, creativity, nama);
                            break;
                        case 3:
                            Manager man = new Manager();
                            man.bobotManager(innovation, decision, communication, nama);
                            break;
                        default:
                            System.out.print("Input Error!\n");
                            break;
                    }
                    break;
                case 2:  
                    System.out.print("*** Edit Nilai***\n");
                    switch(pilih){
                        case 1:
                            System.out.print("Nilai Programming Knowledge: ");
                            programming = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Clean Coding: ");
                            coding = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Debugging: ");
                            debugging = s.nextDouble();
                            System.out.print("\n\n");
                            Programmer pro = new Programmer();
                            pro.bobotProgrammer(programming, coding, debugging, nama);
                            break;
                        case 2:
                            System.out.print("Nilai Design Portfolio: ");
                            design = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Prototyping: ");
                            proto = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Creativity: ");
                            creativity = s.nextDouble();
                            System.out.print("\n\n");       
                            Designer des = new Designer();
                            des.bobotDesigner(design, proto, creativity, nama);
                            break;
                        case 3:
                            System.out.print("Nilai Innovation: ");
                            innovation = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Decision Making: ");
                            decision = s.nextDouble();
                            System.out.print("\n\n");
                            System.out.print("Nilai Communication: ");
                            communication = s.nextDouble();
                            System.out.print("\n\n");
                            Manager man = new Manager();
                            man.bobotManager(innovation, decision, communication, nama);
                            break;
                        default:
                            System.out.print("Input Error!\n");
                            break;
                    }
                default:
                    System.out.print("Input Error!\n");
                    break;
            }
        }
    }
}
    
