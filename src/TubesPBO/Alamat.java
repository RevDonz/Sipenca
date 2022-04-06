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
public class Alamat extends Base {
    private int id_alamat;
    private String provinsi;
    private String kab_kot;
    private String kecamatan;
    private String kelurahan;
    private int rt;
    private int rw;
    private int nomorRumah;

    public Alamat(int id_alamat, String provinsi, String kab_kot, String kecamatan, String kelurahan, int rt, int rw, int nomorRumah, Date created_at, Date updated_at, Date deleted_at) {
        super(created_at, updated_at, deleted_at);
        this.id_alamat = id_alamat;
        this.provinsi = provinsi;
        this.kab_kot = kab_kot;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.rt = rt;
        this.rw = rw;
        this.nomorRumah = nomorRumah;
    }

    public int getId_alamat() {
        return id_alamat;
    }

    public void setId_alamat(int id_alamat) {
        this.id_alamat = id_alamat;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKab_kot() {
        return kab_kot;
    }

    public void setKab_kot(String kab_kot) {
        this.kab_kot = kab_kot;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public int getNomorRumah() {
        return nomorRumah;
    }

    public void setNomorRumah(int nomorRumah) {
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
