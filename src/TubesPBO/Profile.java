/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author Ricky Rohaendi
 */
public class Profile extends Base {
    private int id_profil;
    private String alamat_user;
    private String nama_lengkap;
    private String kota_lahir;
    private Date tanggal_lahir;
    
    public Profile(int id_profil, String alamat_user, String nama_lengkap, String kota_lahir, Date tanggal_lahir) {
        this.id_profil = id_profil;
        this.alamat_user = alamat_user;
        this.nama_lengkap = nama_lengkap;
        this.kota_lahir = kota_lahir;
        this.tanggal_lahir = tanggal_lahir;

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
