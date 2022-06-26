/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoginDAO;
import DAO.PengungsianDAO;
import Model.Pengungsian;
import View.ViewDashboard;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ControllerPengungsian {
    ViewDashboard frame;
    PengungsianDAO pd;
    ArrayList<Pengungsian> arrPengungsian;

    public ControllerPengungsian(ViewDashboard frame) {
        this.frame = frame;
        pd = new PengungsianDAO();
    }
    
    public void isiTabel() {
        arrPengungsian = pd.getAllPengungsian();
        DefaultTableModel model = (DefaultTableModel) frame.getTablePengungsian().getModel();
        Object rowData[] = new Object[4];
        for(int i = 0; i < arrPengungsian.size(); i++) {
            rowData[0] = arrPengungsian.get(i).getId_pengungsian();
            rowData[1] = arrPengungsian.get(i).getNama_tempat();
            rowData[2] = arrPengungsian.get(i).getAlamat();
            rowData[3] = arrPengungsian.get(i).getKapasitas_tempat();
            model.addRow(rowData);
        }
    }
}
