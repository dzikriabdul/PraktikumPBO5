package Tugas3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //no 1 slip gaji
        HitungGaji pc = new HitungGaji();
        pc.hitunggaji();
        pc.totalGaji();
        pc.pajakGaji();
        pc.gajiBersih();
      
        //tugas no 2 data input stream dan output stream
        DataInputDanOutput testIOS = new DataInputDanOutput();
        testIOS.IOstream();
         
        //tugas no 3 perbedaan scnanner dan buffer reader 
        ScannerN_bufferReader test_input1 = new ScannerN_bufferReader();
        test_input1.contoh_scanner();
        
        ScannerN_bufferReader test_input2 = new ScannerN_bufferReader();
        test_input2.contoh_buffered();
        
        //no 4 
        sentripetal sp = new sentripetal();
        sp.sentripetal();
        
        
        //no 5 bu sisca
        Buah b = new Buah();
        b.buah();
        
        //no 6 selisih waktu
        Selisih_waktu sw = new Selisih_waktu();
        sw.hitungSW();
        
        //no 6 percetakan
        percetakan fc = new percetakan();
        fc.waktu();
    }
}