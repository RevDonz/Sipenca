/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LoginDAO {
    Connection conn;
    final String select = "SELECT * FROM tb_user";
    public List<String> usernames = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    public List<Integer> roles = new ArrayList<>();
    public List<Integer> id_users = new ArrayList<>();
    
    public LoginDAO() {
        conn = Database.connect();
        getAll();
    }
    
    public void getAll() {
        try {
            Statement s = conn.createStatement();
            ResultSet resultset = s.executeQuery(select);
            while (resultset.next()){
                usernames.add(resultset.getString("username"));
                passwords.add(resultset.getString("password"));
                roles.add(resultset.getInt("role"));
                id_users.add(resultset.getInt("id_user"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public int login(String username, String password) {
        int uindex = usernames.indexOf(username);
        if (passwords.get(uindex).equals(password)) {
            if (roles.get(uindex) == 1) {
                /*
                    Frame admin login buka di sini
                */
                return 1;
            }
            else if (roles.get(uindex) == 2) {
                /*
                    Frame warga login buka di sini
                */
                return 2;
            } else {
                /*
                    Frame pengelola login buka di sini
                */
                return 3;
            }
        } else {
            return 0;
        }
        
    }
    
}
