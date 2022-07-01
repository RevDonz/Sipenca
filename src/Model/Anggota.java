/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Anggota {
    private int id_anggota;
    private int keluarga;
    private int profil;

    public Anggota(int id_anggota, int kepala, int profil) {
        this.id_anggota = id_anggota;
        this.keluarga = keluarga;
        this.profil = profil;
    }

    public int getProfil() {
        return profil;
    }

    public void setProfil(int profil) {
        this.profil = profil;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public int getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(int kepala) {
        this.keluarga = keluarga;
    }
}
