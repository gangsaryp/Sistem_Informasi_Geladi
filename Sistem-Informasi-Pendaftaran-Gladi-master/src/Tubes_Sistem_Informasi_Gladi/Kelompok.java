/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * Nama : Gangsar Yoga Pamungkas
 * NIM : 1301154096
 * KLS : IF 39 12
 */
import java.util.*;
public class Kelompok {
    
    private String NoKelompok;
    private Mahasiswa[] Daftar = new Mahasiswa[10];
    public Kelompok(String NoKelompok){
        this.NoKelompok = NoKelompok;
    }

    public String getNoKelompok() {
        return NoKelompok;
    }

    public void setNoKelompok(String NoKelompok) {
        this.NoKelompok = NoKelompok;
    }

    public Mahasiswa[] getDaftar() {
        return Daftar;
    }

    public void setDaftar(Mahasiswa[] Daftar) {
        this.Daftar = Daftar;
    }

    public static int getJmlMhs() {
        return jmlMhs;
    }

    public static void setJmlMhs(int jmlMhs) {
        Kelompok.jmlMhs = jmlMhs;
    }
    private static int jmlMhs = 0;
    public void AddMhs(Mahasiswa m){
        this.Daftar[jmlMhs]=m;
        this.jmlMhs++;
        
//        for(int i=0;i<jmlMhs;i++){
//            m.tambah();
//            
//        }
    }
    public void  ViewMhs(){
        int i;
        System.out.println("No Kelompok : "+this.NoKelompok);
        System.out.println("Daftar Mahasiswa : ");
        for(i=0;i<jmlMhs;i++){
            System.out.println(Daftar[i].getNim()+" "+Daftar[i].getNama()+" "+Daftar[i].getAlamat()+" "+Daftar[i].getNotelp()+" "+Daftar[i].getJurusan()+" "+Daftar[i].getProdi());
        }
    }
    
    
}