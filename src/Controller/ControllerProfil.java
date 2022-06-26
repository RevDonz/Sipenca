/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlamatDAO;
import DAO.ProfilDAO;
import Model.Alamat;
import Model.Profile;
import View.ViewProfile;

/**
 *
 * @author ASUS
 */
public class ControllerProfil {
    ViewProfile frame;
    ProfilDAO pd;
    AlamatDAO ad;
    Profile profil;
    int id_user;
    
    public ControllerProfil(ViewProfile frame, int id) {
        this.frame = frame;
        this.id_user = id;
        pd = new ProfilDAO(id);
        profil = pd.getProfil(id);
        ad = new AlamatDAO(profil.getAlamat_user());
    }
    
    public void isiForm() {
        profil = pd.getProfil(id_user);
        
        frame.getInputNamaProfil().setText(profil.getNama_lengkap());
        frame.getInputKota().setText(profil.getKota_lahir());
        frame.getInputTtlProfil().setText(profil.getTanggal_lahir().toString());
    }
    
    public void isiFormAlamat() {
        Alamat alamat = ad.getAlamatById(profil.getAlamat_user());
        
        frame.getInputProvinsi().setText(alamat.getProvinsi());
        frame.getInputKabKot().setText(alamat.getKab_kot());
        frame.getInputNoRumah().setText(String.valueOf(alamat.getNomorRumah()));
        frame.getInputKecamatan().setText(alamat.getKecamatan());
        frame.getInputKelurahan().setText(alamat.getKelurahan());
        frame.getInputRT().setText(String.valueOf(alamat.getRt()));
        frame.getInputRW().setText(String.valueOf(alamat.getRw()));
    }
    
    
}
