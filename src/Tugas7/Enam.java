package Tugas7;

public class Enam {

    public String nama;
    public String status;

    public Enam(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    public void info() {
        System.out.println(nama + " - " + status);
    }
}

// Dosen
class Dosen extends Enam {
    public Dosen(String nama) {
        super(nama, "Dosen");
    }
}

// Mahasiswa
class Mahasiswa extends Enam {
    public Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

// Staff
class Staff extends Enam {
    public Staff(String nama) {
        super(nama, "Staff");
    }
}
