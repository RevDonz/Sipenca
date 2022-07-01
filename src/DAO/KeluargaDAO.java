/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import java.sql.Connection;
import Model.Keluarga;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class KeluargaDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_keluarga WHERE kepala_keluarga=?";
    
    public KeluargaDAO() {
        conn = Database.connect();
//        getKeluargaById(id);
    }
    
    public Keluarga getKeluargaById(int id) {
        Keluarga keluarga = null;
        try {
            PreparedStatement s = conn.prepareStatement(select);
            s.setInt(1, id);
            ResultSet resultset = s.executeQuery();
            while (resultset.next()){
                int id_keluarga = resultset.getInt("id_keluarga");
                int kepala_keluarga = resultset.getInt("kepala_keluarga");
                keluarga = new Keluarga(id_keluarga, kepala_keluarga);
            }
        } catch(SQLException se) {
            System.out.println(se);
        }
        return keluarga;
    }
}
