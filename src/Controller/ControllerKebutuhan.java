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
import javax.swing.JOptionPane;
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
        model.setRowCount(0);
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
        frame.getLabelKebutuhanId().setText(String.valueOf(arrKebutuhan.get(row).getId_kebutuhan()));
        frame.getInputNamaBarang().setText(arrKebutuhan.get(row).getNama_barang());
        frame.getInputKeluarga().setText(String.valueOf(arrKebutuhan.get(row).getKeluarga()));
        frame.getInputSatuanKebutuhan().setText(String.valueOf(arrKebutuhan.get(row).getSatuan()));
        frame.getInputJumlahKebutuhan().setText(String.valueOf(arrKebutuhan.get(row).getJumlah()));
        frame.getcheckKebutuhanPokok().setSelected(arrKebutuhan.get(row).isPokok());
    }
    
    public void resetField() {
        frame.getLabelKebutuhanId().setText("");
        frame.getInputNamaBarang().setText("");
        frame.getInputKeluarga().setText("");
        frame.getInputSatuanKebutuhan().setText("");
        frame.getInputJumlahKebutuhan().setText("");
        frame.getcheckKebutuhanPokok().setSelected(false);
    }
    
    public void insertKebutuhan() {
        String id_keluarga = frame.getInputKeluarga().getText();
        String nama_barang = frame.getInputNamaBarang().getText();
        String satuan = frame.getInputSatuanKebutuhan().getText();
        String jumlah = frame.getInputJumlahKebutuhan().getText();
        boolean isPokok = frame.getcheckKebutuhanPokok().isSelected();
        
        Kebutuhan newKebutuhan = new Kebutuhan(0, Integer.parseInt(id_keluarga), nama_barang, satuan, Integer.parseInt(jumlah), isPokok);
        
        if(kd.addKebutuhan(newKebutuhan)) {
            JOptionPane.showMessageDialog(null, "Tambah Data Kebutuhan berhasil!");
            isiTabel();
            resetField();
        } else {
            JOptionPane.showMessageDialog(null, "Tambah Data Kebutuhan gagal!");
        }
    }
    
    public void updateKebutuhan() {
        String id_kebutuhan = frame.getLabelKebutuhanId().getText();
        String id_keluarga = frame.getInputKeluarga().getText();
        String nama_barang = frame.getInputNamaBarang().getText();
        String satuan = frame.getInputSatuanKebutuhan().getText();
        String jumlah = frame.getInputJumlahKebutuhan().getText();
        boolean isPokok = frame.getcheckKebutuhanPokok().isSelected();
        
        Kebutuhan updateKebutuhan = new Kebutuhan(Integer.parseInt(id_kebutuhan), Integer.parseInt(id_keluarga), nama_barang, satuan, Integer.parseInt(jumlah), isPokok);
        
        if(kd.updateKebutuhan(updateKebutuhan)) {
            JOptionPane.showMessageDialog(null, "Update Data Kebutuhan berhasil!");
            isiTabel();
            resetField();
        } else {
            JOptionPane.showMessageDialog(null, "Update Data Kebutuhan gagal!");
        }
    }
    
    public void deleteKebutuhan() {
        int id = Integer.parseInt(frame.getLabelKebutuhanId().getText());
        
        if(kd.deleteKebutuhan(id)) {
            JOptionPane.showMessageDialog(null, "Hapus Data Kebutuhan berhasil!");
            isiTabel();
            resetField();
        } else {
            JOptionPane.showMessageDialog(null, "Hapus Data Kebutuhan gagal!");
        }
    }
}
