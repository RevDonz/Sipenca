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
public class ControllerAlamat {
    ViewProfile frame;
    ProfilDAO pd;
    AlamatDAO ad;
    
    public ControllerAlamat(ViewProfile frame) {
        this.frame = frame;
        pd = new ProfilDAO();
        ad = new AlamatDAO();
    }
    
    public void isiForm() {
        Alamat alamat = ad.getAlamatById();
        
        frame.getInputProvinsi().setText(alamat.getProvinsi());
        frame.getInputKabKot().setText(alamat.getKab_kot());
        frame.getInputNoRumah().setText(String.valueOf(alamat.getNomorRumah()));
        frame.getInputKecamatan().setText(alamat.getKecamatan());
        frame.getInputKelurahan().setText(alamat.getKelurahan());
        frame.getInputRT().setText(String.valueOf(alamat.getRt()));
        frame.getInputRW().setText(String.valueOf(alamat.getRw()));
    }
}
