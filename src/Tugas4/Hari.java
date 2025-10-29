package tugas4;

import java.util.Scanner;

public class Hari {
    
    public void cekHari(){
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan angka hari: ");
        int hari = input.nextInt();
        
        switch(hari){ 
            case 1 -> System.out.println("Hari ini senin");
            case 2 -> System.out.println("Hari ini selasa");
            case 3 -> System.out.println("Hari ini rabu");
            case 4 -> System.out.println("Hari ini kamis");
            case 5 -> System.out.println("Hari ini jumat");
            case 6 -> System.out.println("Hari ini sabtu");
            case 7 -> System.out.println("Hari ini minggu");
            default -> System.out.println("invalid");
            }
    }
}
