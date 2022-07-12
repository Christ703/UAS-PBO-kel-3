public class status {
    private String metode,status,durasi,keterangan,kode,kodek;
    private kamar kamar;

    public status() {
    }

    public status(String kode, String metode,String keterangan, String kodek, String status, String durasi) {
        this.metode = metode;
        this.status = status;
        this.durasi = durasi;
        this.kodek=kodek;
        this.keterangan = keterangan;
        this.kode = kode;
    }


    public String getMetode() {
        return this.metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDurasi() {
        return this.durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKodek() {
        return this.kodek;
    }

    public void setKodek(String kodek) {
        this.kodek = kodek;
    }

    public kamar getKamar() {
        return this.kamar;
    }

    public void setKamar(kamar kamar) {
        this.kamar = kamar;
    }
   
    public void tampilkanstatus() {
        System.out.println("Kode Pembayaran        : " + kode);
        System.out.println("Metode Pembayaran        : " + metode);
        System.out.println("Jenis Kamar     :  "+kamar.class);
        System.out.println("Kode Kamar     :  "+kamar.getKode());
        System.out.println("Status : " + status);
        System.out.println("Durasi     : " + durasi);
    }    

}
