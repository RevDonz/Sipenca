package Controller;

import DAO.RegisterDAO;
import View.RegisterView;
import View.ViewLogin;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ControllerRegister {
    RegisterView frame;
    RegisterDAO rd;

    public ControllerRegister(RegisterView frame) {
        this.frame = frame;
        rd = new RegisterDAO();
    }

    public void UserRegister() throws ParseException {
        int role = 0;
        
        String username = frame.getInputUsername().getText();
        String email = frame.getInputEmail().getText();
        String password = frame.getInputPassword().getText();
        if (frame.getInputWarga().isSelected()) {
            role = 2;
        } else if ((frame.getInputSukarelawan().isSelected()) || (frame.getInputPetugas().isSelected())) {
            role = 3;
        }
        if (rd.register(username, password, email, role)) {
            JOptionPane.showMessageDialog(null, "Berhasil Register!", "Data Recorded", JOptionPane.INFORMATION_MESSAGE);
            this.frame.setVisible(false);
            new ViewLogin().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error Saat Menyimpan data", "SQL Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
