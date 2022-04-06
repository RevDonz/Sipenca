/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Keluarga extends Base {
    private int id_keluarga;
    private int kepala_keluarga;

    public Keluarga(int id_keluarga, int kepala_keluarga, Date created_at, Date updated_at, Date deleted_at) {
        super(created_at, updated_at, deleted_at);
        this.id_keluarga = id_keluarga;
        this.kepala_keluarga = kepala_keluarga;
    }

    public int getId_keluarga() {
        return id_keluarga;
    }

    public void setId_keluarga(int id_keluarga) {
        this.id_keluarga = id_keluarga;
    }

    public int getKepala_keluarga() {
        return kepala_keluarga;
    }

    public void setKepala_keluarga(int kepala_keluarga) {
        this.kepala_keluarga = kepala_keluarga;
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
