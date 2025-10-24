package Tugas3;
import java.util.Scanner;

public class HitungGaji {

    Scanner input = new Scanner(System.in);
    double p1, p2, p3, p4, total, pajak, bersih;

    public HitungGaji() {
    }

    public void hitunggaji() {
        System.out.println("\n=== Slip Gaji Pegawai ===");
        System.out.print("Gaji Pokok           : ");
        p1 = input.nextDouble();
        System.out.print("Tunjangan Jabatan    : ");
        p2 = input.nextDouble();
        System.out.print("Tunjangan Istri      : ");
        p3 = input.nextDouble();
        System.out.print("Tunjangan Anak       : ");
        p4 = input.nextDouble();
    }

    public void totalGaji() {
        total = p1 + p2 + p3 + p4;
        System.out.println("Total Gaji : " + total);
    }

    public void pajakGaji() {
        pajak = total * 0.10;
        System.out.println("Pajak (10%): " + pajak);
    }

    public void gajiBersih() {
        bersih = total - pajak;
        System.out.println("Gaji Bersih: " + bersih);
    }
}
