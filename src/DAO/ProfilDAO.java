/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Profile;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class ProfilDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_profil WHERE id_profil=?";
    final String insert = "INSERT INTO tb_profil(alamat_user, nama_lengkap, kota_lahir, tanggal_lahir) VALUES(?, ?, ?, ?)";
    final String update = "UPDATE tb_profil SET nama_lengkap = ?, kota_lahir = ?, tanggal_lahir = ? WHERE id_profil = ?";
    
    public ProfilDAO(int id) {
        conn = Database.connect();
        getProfil(id);
    }
    
    public Profile getProfil(int id_user) {
        Profile profil = null;
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, id_user);
            ResultSet resultset = s.executeQuery();
            while (resultset.next()){
                int id = resultset.getInt("id_profil");
                int alamatUser = resultset.getInt("alamat_user");
                String namaLengkap = resultset.getString("nama_lengkap");
                String kotaLahir = resultset.getString("kota_lahir");
                LocalDate tanggalLahir = resultset.getDate("tanggal_lahir").toLocalDate();
                profil = new Profile(id, alamatUser, namaLengkap, kotaLahir, tanggalLahir);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return profil;
    }
    
    public boolean updateProfil(Profile data) {
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(update);
            s.setString(1, data.getNama_lengkap());
            s.setString(2, data.getKota_lahir());
            s.setDate(3, Date.valueOf(data.getTanggal_lahir()));
            s.setInt(4, data.getId_profil());
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public boolean addProfil(Profile data) {
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(insert);
            s.setInt(1, data.getAlamat_user());
            s.setString(2, data.getNama_lengkap());
            s.setString(3, data.getKota_lahir());
            s.setDate(4, Date.valueOf(data.getTanggal_lahir()));
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
}
