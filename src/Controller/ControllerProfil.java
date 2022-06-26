/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProfilDAO;
import Model.Profile;
import View.ViewProfile;

/**
 *
 * @author ASUS
 */
public class ControllerProfil {
    ViewProfile frame;
    ProfilDAO pd;
    
    public ControllerProfil(ViewProfile frame) {
        this.frame = frame;
        pd = new ProfilDAO();
    }
    
    public void isiForm() {
        Profile profil = pd.getProfil();
        
        frame.getInputNamaProfil().setText(profil.getNama_lengkap());
        frame.getInputKota().setText(profil.getKota_lahir());
        frame.getInputTtlProfil().setText(profil.getTanggal_lahir().toString());
    }
}
