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
    AlamatDAO ad;
    
    public ControllerAlamat(ViewProfile frame) {
        this.frame = frame;
        
    }
    
}
