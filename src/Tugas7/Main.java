package Tugas7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("=============");
        Satu mobil = new Satu();
        mobil.merk = "Civic Turbo";
        mobil.tahun = 2020;
        mobil.info();

        System.out.println("=============");
        Dua pp = new Dua();
        System.out.println("Keliling = " + pp.keliling(10, 5));

        System.out.println("=============");
        Tiga ht = new Tiga();
        System.out.println("Hasil = " + ht.hitung(8, 14));

        System.out.println("=============");
        Empat sumpah = new Empat();
        sumpah.lanjut1();
        sumpah.lanjut2();
        sumpah.lanjut3();

        System.out.println("=============");
        Lima r = new Lima();
        r.turun(5);

        System.out.println("=============");
        Dosen dosen = new Dosen("Pak Tarmin");
        Mahasiswa mhs = new Mahasiswa("M Dzikri AM");
        Staff staf = new Staff("Bu Diny");

        dosen.info();
        mhs.info();
        staf.info();

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();

        System.out.print("Masukkan NPM : ");
        String npm = in.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = in.nextLine();

        Tujuh dm = new Tujuh(nama, npm, kelas);
        dm.tampil();
    }
}
