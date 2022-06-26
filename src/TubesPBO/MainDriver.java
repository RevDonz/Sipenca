/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import Database.Database;
import View.ViewLogin;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, SQLException {
        if (!Database.isConnect()){
            JOptionPane.showMessageDialog(null, "Error : " + "Tidak terhubung ke Database!", "Communication Error", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        } else {
            new ViewLogin().setVisible(true);
        }
        
    }
    
}
