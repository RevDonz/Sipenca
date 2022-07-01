/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlamatDAO;
import DAO.AnggotaDAO;
import DAO.KeluargaDAO;
import DAO.ProfilDAO;
import Model.Keluarga;
import Model.Profile;
import Model.Anggota;
import View.ViewProfile;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ControllerKeluarga {
    ViewProfile frame;
    ProfilDAO pd;
    AlamatDAO ad;
    KeluargaDAO kd;
    AnggotaDAO gd;
    Keluarga keluarga;
    Profile profil;
    Anggota anggota;
    int id_user;
    ArrayList<Anggota> arrAnggota;
    
    public ControllerKeluarga(ViewProfile frame, int id) {
        this.frame = frame;
        this.id_user = id;
        kd = new KeluargaDAO();
        gd = new AnggotaDAO();
        pd = new ProfilDAO(id);
        keluarga = kd.getKeluargaById(id_user);
    }
    
    public void isiKeluarga() {
        frame.getLabelIdKeluarga().setText(String.valueOf(keluarga.getId_keluarga()));
    }
    
    public void isiAnggota() {
        arrAnggota = gd.getAnggotaByIdKeluarga(keluarga.getId_keluarga());
        
        DefaultListModel<String> model = new DefaultListModel<String>();
        
        for (int i = 0; i < arrAnggota.size(); i++) {
            profil = pd.getProfil(arrAnggota.get(i).getProfil());
            String nama = profil.getNama_lengkap();
            model.addElement(nama);
        }
        frame.getListAnggota().setModel(model);
    }
    
    public void addAnggota() throws SQLException {
        profil = pd.getProfil(id_user);
        
        String nama = frame.getInputNamaAnggota().getText();
        String kota = frame.getInputKotaAnggota().getText();
        String tanggal = frame.getInputTglAnggota().getText();
        LocalDate date = LocalDate.parse(tanggal);
        Profile addProfil = new Profile(id_user, profil.getAlamat_user(), nama, kota, date);
        
        System.out.println(keluarga.getId_keluarga());
        Anggota newAnggota = new Anggota(0, keluarga.getId_keluarga(), 0);
        
        if (pd.addProfil(addProfil)) {
            if (gd.addAnggotaKeluarga(newAnggota)) {
                JOptionPane.showMessageDialog(null, "Ubah Profil berhasil");
            }
                JOptionPane.showMessageDialog(null, "Ubah Profil berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Ubah Profil gagal");
        }
    }
}
