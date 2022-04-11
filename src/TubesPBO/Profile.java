/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ricky Rohaendi
 */
public class Profile extends Base {
    private int id_profil;
    private int alamat_user;
    private String nama_lengkap;
    private String kota_lahir;
    private Date tanggal_lahir;

    public Profile(int id_profil, int alamat_user, String nama_lengkap, String kota_lahir, String tanggal_lahir) throws ParseException {
        this.id_profil = id_profil;
        this.alamat_user = alamat_user;
        this.nama_lengkap = nama_lengkap;
        this.kota_lahir = kota_lahir;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(tanggal_lahir);
        this.tanggal_lahir = date;
    }

    public int getId_profil() {
        return id_profil;
    }

    public void setId_profil(int id_profil) {
        this.id_profil = id_profil;
    }

    public int getAlamat_user() {
        return alamat_user;
    }

    public void setAlamat_user(int alamat_user) {
        this.alamat_user = alamat_user;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getKota_lahir() {
        return kota_lahir;
    }

    public void setKota_lahir(String kota_lahir) {
        this.kota_lahir = kota_lahir;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(tanggal_lahir);
        this.tanggal_lahir = date;
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
