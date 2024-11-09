public class manager extends pegawai {
    private double tunjangan;


    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }

    public double getTunjangan(){
        return this.tunjangan;
    }

    
    
    public manager(String nama,double gajipokok,double tunjangan){
        super(nama,gajipokok);
        this.tunjangan = tunjangan;
    }
    
    
    public void cetakTunjangan(){
        System.out.println("tunjangan :" + tunjangan);
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }

    public static void main(String[] args) {
        manager m = new manager("anton beton",500000,3500000);
        m.cetakInfo();

    }
}
