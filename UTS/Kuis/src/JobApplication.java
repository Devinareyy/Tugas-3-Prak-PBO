/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import UTS.criteria.ProgrammerCriteria;
import UTS.criteria.ManagerCriteria;
import UTS.criteria.DesignerCriteria;
import java.util.*; 
/**
 *
 * @author inter
 */
public class JobApplication {

}

class Programmer implements ProgrammerCriteria{
    Scanner s = new Scanner(System.in);
    @Override
    public void bobotProgrammer(double programming, double coding , double debugging, String nama){
        double hasil = (60*programming/100 + 15*coding/100 + 25*debugging/100);
        System.out.print("Nilai Akhir : " + hasil + "\n");
        if(hasil>=85){
            System.out.print("KETERANGAN  : DITERIMA\n");
            System.out.print("\n");
            System.out.print("Selamat! " + nama + " mendapatkan pekerjaan sebagai Programmer.\n");
        }
        else {
            System.out.print("KETERANGAN  : COBA LAGI\n");
            System.out.print("\n");
            System.out.print("Mohon maaf, " + nama + " tidak mendapatkan pekerjaan sebagai Programmer.\n"); 
        }
    }
}

class Designer implements DesignerCriteria{
    Scanner s = new Scanner(System.in);
    @Override
    public void bobotDesigner(double design, double proto, double creativity, String nama){
        double hasil = (30*design/100 + 45*proto/100 + 25*creativity/100);
        System.out.print("Nilai Akhir : " + hasil + "\n");
        if(hasil>=85){
            System.out.print("KETERANGAN  : DITERIMA\n");
            System.out.print("\n");
            System.out.print("Selamat! " + nama + " mendapatkan pekerjaan sebagai Designer.\n");
        }
        else {
            System.out.print("KETERANGAN  : COBA LAGI\n");
            System.out.print("\n");
            System.out.print("Mohon maaf, " + nama + " tidak mendapatkan pekerjaan sebagai Designer.\n"); 
        }
    }
}

class Manager implements ManagerCriteria{
    Scanner s = new Scanner(System.in);
    @Override
    public void bobotManager(double innovation, double decision, double communication, String nama){
        double hasil = (40*innovation/100 + 30*decision/100 + 25*communication/100);
        System.out.print("Nilai Akhir : " + hasil + "\n");
        if(hasil>=85){
            System.out.print("KETERANGAN  : DITERIMA\n");
            System.out.print("\n");
            System.out.print("Selamat! " + nama + " mendapatkan pekerjaan sebagai Manager.\n");
        }
        else {
            System.out.print("KETERANGAN  : COBA LAGI\n");
            System.out.print("\n");
            System.out.print("Mohon maaf, " + nama + " tidak mendapatkan pekerjaan sebagai Manager.\n"); 
        }
    }
}
