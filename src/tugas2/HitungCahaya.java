package tugas2;

public class HitungCahaya {
     double jarakbulan = 384400;
    double jarakmatahari = 152.1 * 1000000;
    double kecepatancahaya = 300000;
    
    double BumiKeBulan (){
        double waktu = jarakbulan/kecepatancahaya;
        return waktu;
    }
    double BumiKeMatahari (){
        double waktu = jarakmatahari/kecepatancahaya;
        return waktu;
    }
}
