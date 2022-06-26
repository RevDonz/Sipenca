/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Kebutuhan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KebutuhanDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_kebutuhan";
    
    public KebutuhanDAO() {
        conn = Database.connect();
        getAllKebutuhan();
    }
    
    public ArrayList<Kebutuhan> getAllKebutuhan() {
        
        try{
            ArrayList<Kebutuhan> arrKebutuhan = new ArrayList();
            Statement s = conn.createStatement();
            ResultSet rs=s.executeQuery(select);
            Kebutuhan b;
            
            while(rs.next()) {
                int id = rs.getInt(1);
                int keluarga = rs.getInt(2);
                String namaBarang = rs.getString(3);
                String satuanBarang = rs.getString(4);
                int jumlah = rs.getInt(5);
                boolean isPokok = rs.getBoolean(5);
                b = new Kebutuhan(id, keluarga, namaBarang, satuanBarang, jumlah, isPokok);
                arrKebutuhan.add(b);
            }
            
            return arrKebutuhan;
        } catch(SQLException se) {
            return null;
        }
    }
}
