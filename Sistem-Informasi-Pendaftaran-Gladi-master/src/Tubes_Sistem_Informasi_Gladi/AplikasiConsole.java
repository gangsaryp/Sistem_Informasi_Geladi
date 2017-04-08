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

public class AplikasiConsole {

    public void menuUtama() {
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        Aplikasi app = new Aplikasi();

        int pil = -1;
        boolean keluar = false;

        app.mainMenu();

        pil = input.nextInt();
        switch (pil) {
            case 0:
                keluar = true;
                System.out.println("Exit Program");
                break;
            case 1:// Menu Kelompok
                app.MenuKelompok();
                boolean pilih = false;

                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 0:
                        System.out.println("Yakin mau keluar ??? ");
                        System.out.println("Pilihan (Y/N): ");
                        String yorn = inp.nextLine();
                        if (inp.equals("Y") || inp.equals("y")) {
                            pilih = true;
                        } else {
                            yorn = inp.nextLine();
                        }
                        break;
                    case 1:
                        int a = input.nextInt();
                        int n = 0;

                        app.tambahKel(n);
                        switch (a) {
                            case 0:

                                break;
                            case 1:

                                System.out.println("Tambah Kelompok:");
                                app.tambahKel(1);
                                String NoKelompok = inp.nextLine();
                                app.tambahKel(2);
                                int nim = inp.nextInt();
                                app.tambahKel(3);
                                String nama = inp.nextLine();
                                app.tambahKel(4);
                                String alamat = inp.nextLine();
                                app.tambahKel(5);
                                int notelp = inp.nextInt();
                                app.tambahKel(6);
                                String jurusan = inp.nextLine();
                                app.tambahKel(7);
                                String prodi = inp.nextLine();

                        }
                        break;
                    case 2:
                        System.out.println(app.getDaftarKelompok());
                        break;
                }

        }
    }
}
