/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.KebutuhanDAO;
import Model.Kebutuhan;
import View.ViewDashboard;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ControllerKebutuhan {
    ViewDashboard frame;
    KebutuhanDAO kd;
    ArrayList<Kebutuhan> arrKebutuhan;
    
    public ControllerKebutuhan(ViewDashboard frame) {
        this.frame = frame;
        kd = new KebutuhanDAO();
    }
    
    public void isiTabel() {
        arrKebutuhan = kd.getAllKebutuhan();
        DefaultTableModel model = (DefaultTableModel) frame.getTableKebutuhan().getModel();
        Object rowData[] = new Object[6];
        for(int i = 0; i < arrKebutuhan.size(); i++) {
            rowData[0] = arrKebutuhan.get(i).getId_kebutuhan();
            rowData[1] = arrKebutuhan.get(i).getKeluarga();
            rowData[2] = arrKebutuhan.get(i).getNama_barang();
            rowData[3] = arrKebutuhan.get(i).getSatuan();
            rowData[4] = arrKebutuhan.get(i).getJumlah();
            rowData[5] = arrKebutuhan.get(i).isPokok();
            model.addRow(rowData);
        }
    }
    
    public void isiTextField(int row) {
        frame.getInputNamaBarang().setText(arrKebutuhan.get(row).getNama_barang());
        frame.getInputKeluarga().setText(String.valueOf(arrKebutuhan.get(row).getKeluarga()));
        frame.getInputSatuanKebutuhan().setText(String.valueOf(arrKebutuhan.get(row).getSatuan()));
        frame.getInputJumlahKebutuhan().setText(String.valueOf(arrKebutuhan.get(row).getJumlah()));
        frame.getcheckKebutuhanPokok().setText(String.valueOf(arrKebutuhan.get(row).isPokok()));
    }
}
