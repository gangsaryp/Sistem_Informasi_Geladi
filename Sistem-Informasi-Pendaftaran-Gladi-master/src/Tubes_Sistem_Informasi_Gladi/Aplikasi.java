/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * @author YangPentingHappy
 */
import java.util.*;
public class Aplikasi {
    private List<Kelompok> daftarKelompok;
    
    //kelompok

    public void addKelompok(Kelompok k){
        daftarKelompok.add(k);
    }

    public List<Kelompok> getDaftarKelompok() {
        return daftarKelompok;
    }
    
    public void MenuLokasi(){
        System.out.println("Pilihan : ");
    }

    public void mainMenu() {
        System.out.println("Pilih Kelompok atau Lokasi");
        System.out.println("1. Kelompok");
        System.out.println("2. Lokasi");
        System.out.println("0. Keluar");
    }
    
    public void MenuKelompok(){
        System.out.println("Pilihan : ");
        System.out.println("1. Tambah Kelompok");
        System.out.println("2. Tampil Kelompok");
        System.out.println("0. Keluar");
        
    }
    public void tambahKel(int i){
        switch(i){
            case 1:
                System.out.println("No Kelompok : ");
            break;
            case 2:
                System.out.println("NIM : ");
            break;
            case 3:
                System.out.println("Nama : ");
            break;
            case 4:
                System.out.println("Alamat : ");
            break;
            case 5:
                System.out.println("No Telp : ");
            break;
            case 6:
                System.out.println("Jurusan : ");
            break;
            default:
                System.out.println("Prodi : ");
            break;
        }
    }
    
    
    
            
}
