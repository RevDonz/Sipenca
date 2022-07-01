/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import Model.Pengungsian;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PengungsianDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_pengungsian";
    
    public PengungsianDAO() {
        conn = Database.connect();
        getAllPengungsian();
    }
    
    public ArrayList<Pengungsian> getAllPengungsian() {
        
        try{
            ArrayList<Pengungsian> arrPengungsian = new ArrayList();
            Statement s = conn.createStatement();
            ResultSet rs=s.executeQuery(select);
            Pengungsian b;
            
            while(rs.next()) {
                int id = rs.getInt(1);
                String alamat = rs.getString(2);
                String namaTempat = rs.getString(3);
                int kapasitas = rs.getInt(4);
                int tersisa = rs.getInt(5);
                b = new Pengungsian(id, alamat, namaTempat, kapasitas, tersisa);
                arrPengungsian.add(b);
            }
            
            return arrPengungsian;
        } catch(SQLException se) {
            return null;
        }
    }
}
