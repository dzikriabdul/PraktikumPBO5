
package tugas4;

import java.util.Scanner;

public class Sales {
    
    double penjualan, komisi, uangJasa, totalPendapatan;
    Scanner input = new Scanner(System.in);
    
    void Komisi(){
        System.out.print("Masukan total pendapatan hari ini: ");
        penjualan= input.nextDouble();
        
        if(penjualan==2000000){
            uangJasa = 100000;
            komisi=0.10 * penjualan;
        }else if(penjualan>2000000 && penjualan <= 5000000){
            uangJasa = 200000;
            komisi=0.15 * penjualan;
        }else if(penjualan>5000000){
            uangJasa = 300000;
            komisi=0.20 * penjualan;
        }
        
        totalPendapatan = penjualan + uangJasa + komisi;
        System.out.println("Total penjualan Rp. "+penjualan);
        System.out.println("Uang jasa Rp. "+ uangJasa);
        System.out.println("Uang komisi Rp. "+komisi);
        System.out.println("Total Pendapatan Rp. "+totalPendapatan);
    }
}
