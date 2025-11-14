package tugas5;

public class Empat {
    public void empat(){
        int banyak_angka, ganjil=1,total=0;
        
        System.out.print("Masukan banyak angka: ");
        banyak_angka = In.SCANNER.nextInt();
        for(int i = 1; i <= banyak_angka; i++){
            System.out.print( ganjil+ " ");
            total+=ganjil;
            ganjil += 2;
        }
        System.out.println("\nTotal penjumlahan: "+total);
    }
}
