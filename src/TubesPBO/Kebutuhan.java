package TubesPBO;

import java.util.Date;

public class Kebutuhan extends Base {
    private int id_kebutuhan;
    private int keluarga;
    private String nama_barang;
    private String satuan;
    private int jumlah;
    private boolean adalah_pokok;

    public Kebutuhan(int id_kebutuhan, int keluarga, String nama_barang, String satuan, int jumlah, boolean adalah_pokok, Date created_at, Date updated_at, Date deleted_at) {
        super(created_at, updated_at, deleted_at);
        this.id_kebutuhan = id_kebutuhan;
        this.keluarga = keluarga;
        this.nama_barang = nama_barang;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.adalah_pokok = adalah_pokok;
    }
    
    

    @Override
    void addData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public int getId_kebutuhan() {
        return id_kebutuhan;
    }

    public void setId_kebutuhan(int id_kebutuhan) {
        this.id_kebutuhan = id_kebutuhan;
    }

    public int getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(int keluarga) {
        this.keluarga = keluarga;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isAdalah_pokok() {
        return adalah_pokok;
    }

    public void setAdalah_pokok(boolean adalah_pokok) {
        this.adalah_pokok = adalah_pokok;
    }
}
