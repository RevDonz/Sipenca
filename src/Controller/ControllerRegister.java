package Controller;

import DAO.RegisterDAO;
import View.RegisterView;
import View.ViewLogin;
import javax.swing.JOptionPane;

public class ControllerRegister {
    RegisterView frame;
    RegisterDAO rd;

    public ControllerRegister() {
        this.frame = frame;
        rd = new RegisterDAO();
    }

    public void UserRegister() {
        int role = 0;
        
        String username = frame.getInputPassword().getText();
        String email = frame.getInputEmail().getText();
        String password = frame.getInputPassword().getText();
        String s_role = frame.getInputRole().getSelection().getActionCommand();
        if (s_role == "Warga") {
            role = 2;
        } else if ((s_role == "Sukarelawan") || (s_role == "Petugas")) {
            role = 3;
        }
        if (rd.register(username, password, email, role)) {
            JOptionPane.showMessageDialog(null, "Berhasil Register!", "Data Recorded", JOptionPane.INFORMATION_MESSAGE);
            new ViewLogin().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error Saat Menyimpan data", "SQL Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
