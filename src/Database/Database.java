/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */

public class Database {
    static Connection conn;
    public static Connection connect(){
        if(conn == null){
            MysqlDataSource data = new MysqlConnectionPoolDataSource();
            data.setPort(3306);
            data.setDatabaseName("db_sipenca");
            data.setUser("root");
            data.setPassword("");
            try {
                conn = data.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    
    public static boolean isConnect(){
        try {
            if (connect()==null){
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}

