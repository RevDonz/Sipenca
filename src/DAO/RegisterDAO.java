package DAO;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterDAO {
    Connection conn;
    final String cari = "SELECT * FROM tb_user WHERE username = ? AND email = ?";
    final String simpan = "INSERT INTO tb_user(profil_user, role, username, email, password) VALUES(?, ?, ?, ?, ?)";
    final String alamat = "INSERT INTO tb_alamat(provinsi, kab_kota, kecamatan, kelurahan, rt, rw, nomorRumah) VALUES(?, ?, ?, ?, ?, ?, ?)";
    final String profil = "INSERT INTO tb_profil(alamat_user, nama_lengkap, kota_lahir, tanggal_lahir) VALUES(?, ?, ?, ?)";
    final String max_alamat = "SELECT MAX(id_alamat) AS max_alamat FROM tb_alamat";
    final String max_profil = "SELECT MAX(id_profil) AS max_profil FROM tb_profil";

    public RegisterDAO() {
        conn = Database.connect();
    }

    public boolean register(String username, String password, String email, int role) throws ParseException{
        PreparedStatement s = null;
        Statement prep_state;
        Statement prep_state2;
        PreparedStatement prepare = null;
        boolean success = false;
        try {
            s = conn.prepareStatement(cari);
            s.setString(1, username);
            s.setString(2, email);
            ResultSet res = s.executeQuery();
            

            if (!res.next()) {
                try {
                    int max_id_alamat = -1;
                    int max_id_profil = -1;
                    prep_state = conn.createStatement();
                    prep_state2 = conn.createStatement();
                    
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    Date myDate = formatter.parse("1970-01-01");
                    java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
                    
                    
                    ResultSet prep_data_alamat = prep_state.executeQuery(max_alamat);
                    ResultSet prep_data_profil = prep_state2.executeQuery(max_profil);
                    
                    while (prep_data_alamat.next()) {
                        max_id_alamat = prep_data_alamat.getInt("max_alamat");
                    }
                    
                    while (prep_data_profil.next()) {
                        max_id_profil = prep_data_profil.getInt("max_profil");
                    }
                    
                    prepare = conn.prepareStatement(alamat);
                    prepare.setString(1, "");
                    prepare.setString(2, "");
                    prepare.setString(3, "");
                    prepare.setString(4, "");
                    prepare.setInt(5, 0);
                    prepare.setInt(6, 0);
                    prepare.setInt(7, 0);
                    prepare.executeUpdate();

                    prepare = conn.prepareStatement(profil);
                    prepare.setInt(1, max_id_alamat+1);
                    prepare.setString(2, "");
                    prepare.setString(3, "");
                    prepare.setDate(4, sqlDate);
                    prepare.executeUpdate();
                    
                    s = conn.prepareStatement(simpan);
                    s.setInt(1, max_id_profil+1);
                    s.setInt(2, role);
                    s.setString(3, username);
                    s.setString(4, email);
                    s.setString(5, password);
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
