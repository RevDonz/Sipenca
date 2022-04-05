/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

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
    
    public Obat(int id_obat, int penyakit, String nama_obat, String satuan, int jumlah) {
        this.id_obat = id_obat;
        this.penyakit = penyakit;
        this.nama_obat = nama_obat;
        this.satuan = satuan;
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
