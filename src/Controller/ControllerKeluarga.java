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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
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
    int id_user;
    ArrayList<Anggota> arrAnggota;
    
    public ControllerKeluarga(ViewProfile frame, int id) {
        this.frame = frame;
        this.id_user = id;
        kd = new KeluargaDAO();
        gd = new AnggotaDAO();
        pd = new ProfilDAO(id);
    }
    
    public void isiKeluarga() {
        keluarga = kd.getKeluargaById(id_user);
        frame.getLabelIdKeluarga().setText(String.valueOf(keluarga.getId_keluarga()));
    }
    
    public void isiAnggota() {
        keluarga = kd.getKeluargaById(id_user);
        arrAnggota = gd.getAnggotaByIdKeluarga(keluarga.getId_keluarga());
        
        DefaultListModel<String> model = new DefaultListModel<String>();
        
        for (int i = 0; i < arrAnggota.size(); i++) {
            profil = pd.getProfil(arrAnggota.get(i).getProfil());
            String nama = profil.getNama_lengkap();
            model.addElement(nama);
        }
        frame.getListAnggota().setModel(model);
    }
}
