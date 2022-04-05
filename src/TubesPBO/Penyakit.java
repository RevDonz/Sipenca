/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

/**
 *
 * @author ASUS
 */
public class Penyakit extends Base {

    private int id_penyakit;
    private String nama_penyakit;
    private int penyandang;
    
    public Penyakit(int id_penyakit, String nama_penyakit, int penyandang) {
        this.id_penyakit = id_penyakit;
        this.nama_penyakit = nama_penyakit;
        this.penyandang = penyandang;
    }

    @Override
    void addData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
