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
public class Alamat extends Base {
    private int id_alamat;
    private String provinsi;
    private String kab_kot;
    private String kecamatan;
    private String kelurahan;
    private int rt;
    private int rw;
    private int nomorRumah;
    
    public Alamat(int id_alamat, String provinsi, String kab_kot, String kecamatan, String kelurahan, int rt, int rw, int nomorRumah) {
        this.id_alamat = id_alamat;
        this.provinsi = provinsi;
        this.kab_kot = kab_kot;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.rt = rt;
        this.rw = rw;
        this.nomorRumah = nomorRumah;
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
