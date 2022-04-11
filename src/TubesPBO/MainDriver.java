/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Role
        Role admin = new Role(1, "Admin", new Date(), new Date(), null);
        Role warga = new Role(2, "Warga", new Date(), new Date(), null);
        Role pengelola = new Role(3, "Pengelola", new Date(), new Date(), null);
        
        // User
        User admin1 = new User(0, 0, 1, "admin1", "admin1@gmail.com", "passwordadmin1", new Date(), new Date(), null);
        User warga1 = new User(1, 1, 2, "warga1", "warga1@gmail.com", "passwordwarga1", new Date(), new Date(), null);
        User pengelola1 = new User(2, 1, 2, "warga1", "warga1@gmail.com", "passwordwarga1", new Date(), new Date(), null);
        
        // Profile
        Profile profilAdmin1 = new Profile(0, 0, "Asep", "Bandung", new Date(), new Date(), new Date(), null);
        Profile profilWarga1 = new Profile(1, 1, "Agus", "Bandung", new Date(), new Date(), new Date(), null);
        Profile profilPengelola1 = new Profile(2, 2, "Nama Lengkap Admin 1", "Kota Admin 1", new Date(), new Date(), new Date(), null);
        
        // Alamat
        Alamat alamatAdmin1 = new Alamat(0, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1, new Date(), new Date(), null);
        Alamat alamatWarga1 = new Alamat(1, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1, new Date(), new Date(), null);
        Alamat alamatPengelola1 = new Alamat(2, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1, new Date(), new Date(), null);
        Alamat alamatPoskoA = new Alamat(3, "Jawa barat", "Bandung", "DayeuhKolot", "DayeuhKolot", 9, 10, 20, new Date(), new Date(), null);
        
        // Pengungsian
        Pengungsian PoskoA = new Pengungsian(0, 1, "Posko A", 300, new Date(), new Date(), null);
        
        // Pengelola
    }
    
}
