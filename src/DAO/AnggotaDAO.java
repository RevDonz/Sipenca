/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import java.sql.Connection;
import Model.Anggota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AnggotaDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_anggota WHERE keluarga = ?";
    final String insert = "INSERT INTO tb_anggota(keluarga, profil) VALUES(?, ?)";
    final String max_profil = "SELECT MAX(id_profil) AS max_profil FROM tb_profil";
    
    public AnggotaDAO() {
        conn = Database.connect();
    }
    
    public ArrayList<Anggota> getAnggotaByIdKeluarga(int id) {
        ArrayList<Anggota> arrAnggota = new ArrayList();
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, id);
            ResultSet resultset = s.executeQuery();
            Anggota anggota;
            
            while (resultset.next()){
                int id_anggota = resultset.getInt("id_anggota");
                int keluarga = resultset.getInt("keluarga");
                int profil = resultset.getInt("profil");
                anggota = new Anggota(id_anggota, keluarga, profil);
                arrAnggota.add(anggota);
            }
        } catch(SQLException se) {
            System.out.println(se);
            return null;
        }
        return arrAnggota;
    }
    
    public boolean addAnggotaKeluarga(Anggota data) throws SQLException {
        Statement x = conn.createStatement();
        ResultSet resultset = x.executeQuery(max_profil);
        int profile_max = -1;
        
        while(resultset.next()) {
            profile_max = resultset.getInt("max_profil");
        }
        
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(insert);
            s.setInt(1, data.getKeluarga());
            s.setInt(2, profile_max);
            s.executeUpdate();
            status = true;
        } catch(SQLException se) {
            System.out.println(se);
        }
        return status;
    }
}
