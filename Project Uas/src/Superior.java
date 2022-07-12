public class Superior extends kamar {
    
    public Superior(String kode) {
        this.kode = kode;
        this.namaKamar = "Superior";
        this.harga = 600000;
        this.kapasitas=4;
    }

    public Superior() {
    }
    public void tampilsuperior() 
    {
        System.out.println(kode + "\t\t" + namaKamar + "\t" +harga+ "\t"+kapasitas);
    }
}
