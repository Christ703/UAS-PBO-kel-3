public class pembayaran {
    private String kode;
    private int durasi,tambahan,penginapan;

    public pembayaran() {
    }

    public pembayaran(String kode, int durasi, int penginapan, int tambahan) {
        this.kode = kode;
        this.durasi = durasi;
        this.tambahan = tambahan;
        this.penginapan = penginapan;
        
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getDurasi() {
        return this.durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getTambahan() {
        return this.tambahan;
    }

    public void setTambahan(int tambahan) {
        this.tambahan = tambahan;
    }

    public int getPenginapan() {
        return this.penginapan;
    }

    public void setPenginapan(int penginapan) {
        this.penginapan = penginapan;
    }


}
