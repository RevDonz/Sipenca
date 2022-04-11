package TubesPBO;

import java.util.Date;

public class Pengelola extends Base {
    private int id_pengelola;
    private int id_pengungsian;
    private int pengelola;
    private boolean adalah_pemilik;

    public Pengelola(int id_pengelola, int id_pengungsian, int pengelola, boolean adalah_pemilik) {
        this.id_pengelola = id_pengelola;
        this.id_pengungsian = id_pengungsian;
        this.pengelola = pengelola;
        this.adalah_pemilik = adalah_pemilik;
    }

    public int getId_pengelola() {
        return id_pengelola;
    }

    public void setId_pengelola(int id_pengelola) {
        this.id_pengelola = id_pengelola;
    }

    public int getId_pengungsian() {
        return id_pengungsian;
    }

    public void setId_pengungsian(int id_pengungsian) {
        this.id_pengungsian = id_pengungsian;
    }

    public int getPengelola() {
        return pengelola;
    }

    public void setPengelola(int pengelola) {
        this.pengelola = pengelola;
    }

    public boolean isAdalah_pemilik() {
        return adalah_pemilik;
    }

    public void setAdalah_pemilik(boolean adalah_pemilik) {
        this.adalah_pemilik = adalah_pemilik;
    }

    @Override
    void addData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }
}
