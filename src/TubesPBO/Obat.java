/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Obat extends Base {
    private int id_obat;
    private int penyakit;
    private String nama_obat;
    private String satuan;
    private int jumlah;

    public Obat(int id_obat, int penyakit, String nama_obat, String satuan, int jumlah, Date created_at, Date updated_at, Date deleted_at) {
        super(created_at, updated_at, deleted_at);
        this.id_obat = id_obat;
        this.penyakit = penyakit;
        this.nama_obat = nama_obat;
        this.satuan = satuan;
        this.jumlah = jumlah;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public int getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(int penyakit) {
        this.penyakit = penyakit;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
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
    
    

    @Override
    void addData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
