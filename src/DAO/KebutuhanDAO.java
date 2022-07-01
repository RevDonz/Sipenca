/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Kebutuhan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
    final String delete = "DELETE FROM tb_kebutuhan WHERE id_kebutuhan = ?";
    final String insert = "INSERT INTO tb_kebutuhan(id_kebutuhan, keluarga, nama_barang, satuan, jumlah, adalah_pokok) VALUES(null, ?, ?, ?, ?, ?)";
    final String update = "UPDATE tb_kebutuhan SET keluarga = ?, nama_barang = ?, satuan = ?, jumlah = ?, adalah_pokok = ? WHERE id_kebutuhan = ?";
    
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
                boolean isPokok = rs.getBoolean(6);
                b = new Kebutuhan(id, keluarga, namaBarang, satuanBarang, jumlah, isPokok);
                arrKebutuhan.add(b);
            }
            
            return arrKebutuhan;
        } catch(SQLException se) {
            return null;
        }
    }
    
    public boolean addKebutuhan(Kebutuhan data) {
        boolean status = false;
        int isPokok = data.isPokok() ? 1 : 0;
        
        try {
            PreparedStatement s = conn.prepareStatement(insert);
            s.setInt(1, data.getKeluarga());
            s.setString(2, data.getNama_barang());
            s.setString(3, data.getSatuan());
            s.setInt(4, data.getJumlah());
            s.setInt(5, isPokok);
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public boolean updateKebutuhan(Kebutuhan data) {
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(update);
            s.setInt(1, data.getKeluarga());
            s.setString(2, data.getNama_barang());
            s.setString(3, data.getSatuan());
            s.setInt(4, data.getJumlah());
            s.setBoolean(5, data.isPokok());
            s.setInt(6, data.getId_kebutuhan());
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public boolean deleteKebutuhan(int id) {
        boolean status = false;
        try {
            PreparedStatement s = conn.prepareStatement(delete);
            s.setInt(1, id);
            s.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
}
