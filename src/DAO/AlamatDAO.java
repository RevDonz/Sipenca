/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Alamat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class AlamatDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_alamat WHERE id_alamat=?";
    final String update = "UPDATE tb_alamat SET provinsi = ?, kab_kota = ?, kecamatan = ?, kelurahan = ?, rt = ?, rw = ?, nomorRumah = ? WHERE id_alamat = ?";
    int idAlamat;
    
    public AlamatDAO(int id) {
        conn = Database.connect();
        getAlamatById(id);
    }
    
    public Alamat getAlamatById(int idAlamat) {
        Alamat alamat = null;
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, idAlamat);
            ResultSet resultset = s.executeQuery();
            while (resultset.next()){
                int id_alamat = resultset.getInt("id_alamat");
                String provinsi = resultset.getString("provinsi");
                String kab_kot = resultset.getString("kab_kota");
                String kecamatan = resultset.getString("kecamatan");
                String kelurahan = resultset.getString("kelurahan");
                int rt = resultset.getInt("rt");
                int rw = resultset.getInt("rw");
                int nomorRumah = resultset.getInt("nomorRumah");
                alamat = new Alamat(id_alamat, provinsi, kab_kot, kecamatan, kelurahan, rt, rw, nomorRumah);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return alamat;
    }
    
    public boolean updateAlamat(Alamat data) {
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(update);
            s.setString(1, data.getProvinsi());
            s.setString(2, data.getKab_kot());
            s.setString(3, data.getKecamatan());
            s.setString(4, data.getKelurahan());
            s.setInt(5, data.getRt());
            s.setInt(6, data.getRw());
            s.setInt(7, data.getNomorRumah());
            s.setInt(8, data.getId_alamat());
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
}
