/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // Role
        Role admin = new Role(1, "Admin");
        Role warga = new Role(2, "Warga");
        Role pengelola = new Role(3, "Pengelola");
        
        // User
        User admin1 = new User(0, 0, 1, "admin1", "admin1@gmail.com", "passwordadmin1");
        User warga1 = new User(1, 1, 2, "warga1", "warga1@gmail.com", "passwordwarga1");
        User pengelola1 = new User(2, 2, 2, "pengelola1", "pengelola1@gmail.com", "passwordpengelola1");
        User pengelola2 = new User(3, 5, 2, "pengelola2", "pengelola2@gmail.com", "passwordpengelola2");
        
        // Profile
        Profile profilAdmin1 = new Profile(0, 0, "Asep", "Bandung", "20/03/1999");
        Profile profilWarga1 = new Profile(1, 1, "Agus", "Bandung", "12/05/2000");
        Profile profilPengelola1 = new Profile(2, 2, "Suhendar", "Bandung", "7/02/1998");
        Profile profilWarga2 = new Profile(3, 1, "Iman", "Bandung", "15/06/2003");
        Profile profilWarga3 = new Profile(4, 1, "Ucup", "Bandung", "18/08/2002");
        Profile profilPengelola2 = new Profile(5, 2, "Mamat", "Bandung", "7/05/1998");
        
        // Alamat
        Alamat alamatAdmin1 = new Alamat(0, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1);
        Alamat alamatWarga1 = new Alamat(1, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1);
        Alamat alamatPengelola1 = new Alamat(2, "Jawa barat", "Bandung", "Baleendah", "Baleendah", 2, 18, 1);
        Alamat alamatPoskoA = new Alamat(3, "Jawa barat", "Bandung", "DayeuhKolot", "DayeuhKolot", 9, 10, 20);
        
        // Pengungsian
        Pengungsian PoskoA = new Pengungsian(0, 3, "Posko A", 300);
        
        // Pengelola
        Pengelola petugas = new Pengelola(0, 0, 2, false);
        Pengelola pemilik = new Pengelola(1, 0, 3, true);
        
        // Keluarga 
        Keluarga keluarga1 = new Keluarga(0, 1);
        
        // Anggota Keluarga
        Anggota anggota1Warga1 = new Anggota(0, 1, 3);
        Anggota anggota2Warga1 = new Anggota(1, 1, 4);
        
        // Penyakit
        Penyakit demam = new Penyakit(0, "Demam", 1);
        
        // Obat
        Obat panadol = new Obat(0, 0, "Panadol", "pcs", 4);
        
        // Kebutuhan
        Kebutuhan kebutuhan1 = new Kebutuhan(0, 0, "Beras", "kg", 10, true);
        
        System.out.println("Nama Admin 1 : " + profilAdmin1.getNama_lengkap());
        System.out.println();
        System.out.println("Nama Warga 1 : " + profilWarga1.getNama_lengkap());
        System.out.println("Alamat Warga 1 : " + alamatWarga1.getAlamatLengkap());
        System.out.println();
        System.out.println("Detail Pengungsian : ");
        System.out.println("Nama tempat : " + PoskoA.getNama_tempat());
        System.out.println("Kapasitas : " + PoskoA.getKapasitas_tempat());
    }
    
}
