package tugas4;

public class Main {
    public static void main(String[] args) {
        
        //1. Ganjil Genap mod
        Ganjil_Genap gg = new Ganjil_Genap();
        gg.cek_jilnap();
        System.out.println();
        System.out.println("");
        
        //2. Hari
        Hari h = new Hari();
        h.cekHari();
        System.out.println();
        System.out.println("");
        
        //3. Gaji bersih
        Gaji gb = new Gaji();
        gb.gaji();
        System.out.println();
        System.out.println("");
        
        //4. Kabisat
        Kabisat k = new Kabisat();
        k.kabisat();
        System.out.println();
        System.out.println("");
        
        //5. Sales
        Sales s = new Sales();
        s.Komisi();
        System.out.println();
        System.out.println("");
        
        //6. kasir (if else)
        Kasir ka = new Kasir();
        ka.kasir();
        System.out.println();
        System.out.println("");
        
        //7. hitung luas (switch Case)
        HitungLuas hl = new HitungLuas();
        hl.Menu();
        
    }
}
