package Tugas7;

public class Lima{
    public void turun(int n) {
        if (n == 0) return;
        System.out.println("Angka : " + n);
        turun(n - 1);
    }
}
