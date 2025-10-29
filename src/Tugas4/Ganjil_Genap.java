package tugas4;

import java.util.Scanner;

public class Ganjil_Genap {
    
    int a;
    
    Scanner in = new Scanner(System.in);
    
    public void cek_jilnap(){
        System.out.print("Masukan angka untuk di cek: ");
        a= in.nextInt();
        if(a % 2 == 0 ){
            System.out.print(+ a +" bilangan genap");
        }else{
            System.out.print(+ a +" bilangan ganjil");
        }
    }
}
