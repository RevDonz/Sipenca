/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author Sabre
 */
public class Pengungsian extends Base{
    private int id_pengungsian;
    private int alamat;
    private String nama_tempat;
    private int kapasitas_tempat;

    public Pengungsian(int id_pengungsian, int alamat, String nama_tempat, int kapasitas_tempat) {
        this.id_pengungsian = id_pengungsian;
        this.alamat = alamat;
        this.nama_tempat = nama_tempat;
        this.kapasitas_tempat = kapasitas_tempat;
    }

    public int getId_pengungsian() {
        return id_pengungsian;
    }

    public void setId_pengungsian(int id_pengungsian) {
        this.id_pengungsian = id_pengungsian;
    }

    public int getAlamat() {
        return alamat;
    }

    public void setAlamat(int alamat) {
        this.alamat = alamat;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public int getKapasitas_tempat() {
        return kapasitas_tempat;
    }

    public void setKapasitas_tempat(int kapasitas_tempat) {
        this.kapasitas_tempat = kapasitas_tempat;
    }
    
    @Override
    void addData() {

    }

    @Override
    void updateData() {

    }

    @Override
    void deleteData() {

    }
    
    
}
