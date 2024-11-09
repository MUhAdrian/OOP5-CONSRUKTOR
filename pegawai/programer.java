public class programer extends pegawai {
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return this.bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println();
    }
    public void cetakInfo(String nama) {
    super.cetakInfo(); // Ini akan memanggil cetakInfo() dari pegawai
    System.out.println(nama);
}
    public programer(String nama,double gajipokok,double bonus){
        super(nama,gajipokok);
        this.bonus = bonus;
    }

    public void cetakBonus(){
        System.out.println("bonus :" + bonus);
    }
}
