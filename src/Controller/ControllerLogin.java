/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoginDAO;
import View.ViewDashboard;
import View.ViewLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerLogin {
    ViewLogin frame;
    LoginDAO ld;

    public ControllerLogin(ViewLogin frame) {
        this.frame = frame;
        ld = new LoginDAO();
    }
    
    public void UserLogin() {
        String username = frame.getInputUsername().getText();
        String password = frame.getInputPassword().getText();
        
        int uindex = ld.usernames.indexOf(username);
        int role = ld.login(username, password);
        int id_user = ld.id_users.get(uindex);
        
        if(role != 0) {
            frame.dispose();
            new ViewDashboard(id_user).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Password salah");
        }
    }
}
