public class pegawai{
    
private String nama;
private double gajipopok;
 
public void setNama(String nama){
    this.nama = nama;
}

public void setGajipokok(double gajipopok){
    this.gajipopok = gajipopok;
}

    public double getGajipopok() {
        return this.gajipopok;
    }

    public String getNama() {
        return this.nama;
    }

public pegawai(String nama,double gajipopok){
    this.nama = nama;
    this.gajipopok = gajipopok;
}

public void cetakInfo(){
    System.out.println("Nama Pegawai : " + nama);
    System.out.println("Gaji Pokok : " + gajipopok);
}

public static void main(String[] args) {
    pegawai pegawai1 = new pegawai("Riko",600_000 );
    pegawai pegawai2 = new pegawai("Dina",500_000);
    pegawai pegawai3 = new pegawai("Andi Herlambang",0);

    pegawai1.cetakInfo();
    pegawai2.cetakInfo();
    pegawai3.cetakInfo();
}
}

