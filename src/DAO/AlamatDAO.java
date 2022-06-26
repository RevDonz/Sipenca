/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Alamat;
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
public class AlamatDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_alamat WHERE id_alamat=?";
    
    public AlamatDAO() {
        conn = Database.connect();
        getAlamatById();
    }
    
    public Alamat getAlamatById() {
        Alamat alamat = null;
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, 2);
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
}
