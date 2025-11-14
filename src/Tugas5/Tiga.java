package tugas5;

public class Tiga {
   public void lima(){
        int baris, angka=1;
        
        System.out.print("Masukan banyak baris: ");
        baris = In.SCANNER.nextInt();
        for(int i=1;i<=baris;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(angka +" ");
                angka++;
            }
            System.out.println();
        }    
   }
}
