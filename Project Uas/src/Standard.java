public class Standard extends kamar {
    public Standard(String kode) {
        this.kode = kode;
        this.namaKamar = "Standard";
        this.harga = 300000;
        this.kapasitas=2;
    }

    public void tampilstandard() {
        System.out.println(kode + "\t\t" + namaKamar + "\t" +harga+ "\t"+kapasitas);
    }
}
