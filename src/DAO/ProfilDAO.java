/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Profile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ProfilDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_profil WHERE id_profil=?";
    
    public ProfilDAO() {
        conn = Database.connect();
        getProfil();
    }
    
    public Profile getProfil() {
        Profile profil = null;
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, 2);
            ResultSet resultset = s.executeQuery();
            while (resultset.next()){
                int id = resultset.getInt("id_profil");
                int alamatUser = resultset.getInt("alamat_user");
                String namaLengkap = resultset.getString("nama_lengkap");
                String kotaLahir = resultset.getString("kota_lahir");
                Date tanggalLahir = resultset.getDate("tanggal_lahir");
                profil = new Profile(id, alamatUser, namaLengkap, kotaLahir, tanggalLahir);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return profil;
    }
}
