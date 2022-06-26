package DAO;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDAO {
    Connection conn;
    final String cari = "SELECT * FROM tb_user WHERE username = ? AND email = ?";
    final String simpan = "INSERT INTO tb_user(profil_user, role, username, email, password) VALUES(null, ?, ?, ?, ?)";

    public RegisterDAO() {
        conn = Database.connect();
    }

    public boolean register(String username, String password, String email, int role){
        PreparedStatement s = null;
        boolean success = false;
        try {
            s = conn.prepareStatement(cari);
            s.setString(1, username);
            s.setString(2, email);
            ResultSet res = s.executeQuery();

            if (!res.next()) {
                try {
                    s = conn.prepareStatement(simpan);
                    s.setInt(1, role);
                    s.setString(2, username);
                    s.setString(3, email);
                    s.setString(4, password);
                    s.executeUpdate();
                    success = true;
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    s.close();
                }
            } else {
                success = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return success;
    }
}
