/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerProfil;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ViewProfile extends javax.swing.JFrame {
    private int id_user;
    ControllerProfil cf;
    
    /**
     * Creates new form Profile
     */
    public ViewProfile(int id) {
        this.id_user = id;
        initComponents();
        cf = new ControllerProfil(this, id);
        
        cf.isiForm();
        cf.isiFormAlamat();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneProfile = new javax.swing.JTabbedPane();
        panelProfile = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        labelProv = new javax.swing.JLabel();
        labelTgl = new javax.swing.JLabel();
        inputNamaProfil = new javax.swing.JTextField();
        inputTtlProfil = new javax.swing.JTextField();
        inputProvinsi = new javax.swing.JTextField();
        labelKota = new javax.swing.JLabel();
        inputKota = new javax.swing.JTextField();
        labelKabKot = new javax.swing.JLabel();
        inputKabKot = new javax.swing.JTextField();
        labelKecamatan = new javax.swing.JLabel();
        inputKecamatan = new javax.swing.JTextField();
        labelKelurahan = new javax.swing.JLabel();
        inputKelurahan = new javax.swing.JTextField();
        labelAlamat4 = new javax.swing.JLabel();
        inputRT = new javax.swing.JTextField();
        labelAlamat5 = new javax.swing.JLabel();
        inputRW = new javax.swing.JTextField();
        labelAlamat6 = new javax.swing.JLabel();
        inputNoRumah = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        panelTambahAnggota = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputNamaAnggotaKeluarga = new javax.swing.JTextField();
        inputAlamatAnggotKeluarga = new javax.swing.JTextField();
        inputTglLahirAnggotaKeluarga = new javax.swing.JTextField();
        inputKotaLahirAnggotaKeluarga = new javax.swing.JTextField();
        panelAnggotaKeluarga = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPaneProfile.setName(""); // NOI18N

        labelNama.setText("Nama :");

        labelProv.setText("Provinsi :");

        labelTgl.setText("Tanggal Lahir :");

        labelKota.setText("Kota Lahir :");

        labelKabKot.setText("Kab/Kota :");

        labelKecamatan.setText("Kecamatan :");

        labelKelurahan.setText("Kelurahan :");

        labelAlamat4.setText("RT :");

        labelAlamat5.setText("RW :");

        labelAlamat6.setText("Nomor Rumah :");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProfileLayout = new javax.swing.GroupLayout(panelProfile);
        panelProfile.setLayout(panelProfileLayout);
        panelProfileLayout.setHorizontalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat6)
                    .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfileLayout.createSequentialGroup()
                            .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNama)
                                .addComponent(labelTgl)
                                .addComponent(labelProv)
                                .addComponent(labelKota)
                                .addComponent(labelKecamatan))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProfileLayout.createSequentialGroup()
                            .addComponent(labelAlamat4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputKota, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTtlProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNamaProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelProfileLayout.createSequentialGroup()
                                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputRT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProfileLayout.createSequentialGroup()
                                        .addComponent(labelAlamat5)
                                        .addGap(58, 58, 58)
                                        .addComponent(inputRW, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelKelurahan)
                                        .addGroup(panelProfileLayout.createSequentialGroup()
                                            .addComponent(labelKabKot)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(inputKabKot, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfileLayout.createSequentialGroup()
                            .addComponent(inputKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111)
                            .addComponent(inputKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProfileLayout.createSequentialGroup()
                        .addComponent(inputNoRumah, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelProfileLayout.setVerticalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(inputNamaProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKota)
                    .addComponent(inputKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTgl)
                    .addComponent(inputTtlProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProv)
                    .addComponent(inputProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKabKot)
                    .addComponent(inputKabKot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKecamatan)
                    .addComponent(inputKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKelurahan))
                .addGap(24, 24, 24)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat4)
                    .addComponent(inputRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat5))
                .addGap(18, 18, 18)
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAlamat6)
                        .addComponent(inputNoRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnBack)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tabbedPaneProfile.addTab("Profile", panelProfile);

        jLabel10.setText("Nama:");

        jLabel11.setText("Alamat:");

        jLabel12.setText("Tanggal Lahir:");

        jLabel13.setText("Kota Lahir:");

        inputNamaAnggotaKeluarga.setText("jTextField1");

        inputAlamatAnggotKeluarga.setText("jTextField2");

        inputTglLahirAnggotaKeluarga.setText("jTextField3");

        inputKotaLahirAnggotaKeluarga.setText("jTextField4");

        javax.swing.GroupLayout panelTambahAnggotaLayout = new javax.swing.GroupLayout(panelTambahAnggota);
        panelTambahAnggota.setLayout(panelTambahAnggotaLayout);
        panelTambahAnggotaLayout.setHorizontalGroup(
            panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahAnggotaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputNamaAnggotaKeluarga, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(inputAlamatAnggotKeluarga)
                    .addComponent(inputTglLahirAnggotaKeluarga)
                    .addComponent(inputKotaLahirAnggotaKeluarga))
                .addGap(87, 87, 87))
        );
        panelTambahAnggotaLayout.setVerticalGroup(
            panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahAnggotaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inputNamaAnggotaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(inputAlamatAnggotKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inputTglLahirAnggotaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTambahAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(inputKotaLahirAnggotaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        tabbedPaneProfile.addTab("Tambah Anggota", panelTambahAnggota);

        jLabel2.setText("id Keluarga:");

        jScrollPane1.setViewportView(jList1);

        jLabel3.setText("Anggota keluarga:");

        jLabel4.setText(".....");

        javax.swing.GroupLayout panelAnggotaKeluargaLayout = new javax.swing.GroupLayout(panelAnggotaKeluarga);
        panelAnggotaKeluarga.setLayout(panelAnggotaKeluargaLayout);
        panelAnggotaKeluargaLayout.setHorizontalGroup(
            panelAnggotaKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnggotaKeluargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAnggotaKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAnggotaKeluargaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        panelAnggotaKeluargaLayout.setVerticalGroup(
            panelAnggotaKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnggotaKeluargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAnggotaKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tabbedPaneProfile.addTab("Anggota Keluarga", panelAnggotaKeluarga);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneProfile)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabbedPaneProfile.getAccessibleContext().setAccessibleName("Show");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewDashboard(id_user).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewProfile().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputAlamatAnggotKeluarga;
    private javax.swing.JTextField inputKabKot;
    private javax.swing.JTextField inputKecamatan;
    private javax.swing.JTextField inputKelurahan;
    private javax.swing.JTextField inputKota;
    private javax.swing.JTextField inputKotaLahirAnggotaKeluarga;
    private javax.swing.JTextField inputNamaAnggotaKeluarga;
    private javax.swing.JTextField inputNamaProfil;
    private javax.swing.JTextField inputNoRumah;
    private javax.swing.JTextField inputProvinsi;
    private javax.swing.JTextField inputRT;
    private javax.swing.JTextField inputRW;
    private javax.swing.JTextField inputTglLahirAnggotaKeluarga;
    private javax.swing.JTextField inputTtlProfil;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat4;
    private javax.swing.JLabel labelAlamat5;
    private javax.swing.JLabel labelAlamat6;
    private javax.swing.JLabel labelKabKot;
    private javax.swing.JLabel labelKecamatan;
    private javax.swing.JLabel labelKelurahan;
    private javax.swing.JLabel labelKota;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelProv;
    private javax.swing.JLabel labelTgl;
    private javax.swing.JPanel panelAnggotaKeluarga;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelTambahAnggota;
    private javax.swing.JTabbedPane tabbedPaneProfile;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getInputNamaProfil() {
        return inputNamaProfil;
    }
    
    public void setInputNamaProfil(JTextField inputNamaProfil) {
        this.inputNamaProfil = inputNamaProfil;
    }
    
    public JTextField getInputKota() {
        return inputKota;
    }
    
    public void setInputKota(JTextField inputKota) {
        this.inputKota = inputKota;
    }
    
    public JTextField getInputTtlProfil() {
        return inputTtlProfil;
    }
    
    public void setInputTtlProfil(JTextField inputTtlProfil) {
        this.inputTtlProfil = inputTtlProfil;
    }
    
    public JTextField getInputProvinsi() {
        return inputProvinsi;
    }
    
    public void setInputProvinsi(JTextField inputProvinsi) {
        this.inputProvinsi = inputProvinsi;
    }
    
    public JTextField getInputKabKot() {
        return inputKabKot;
    }
    
    public void setInputKabKot(JTextField inputKabKot) {
        this.inputKabKot = inputKabKot;
    }
    
    public JTextField getInputRT() {
        return inputRT;
    }
    
    public void setInputRT(JTextField inputRT) {
        this.inputRT = inputRT;
    }
    
    public JTextField getInputRW() {
        return inputRW;
    }
    
    public void setInputRW(JTextField inputRW) {
        this.inputRW = inputRW;
    }
    
    public JTextField getInputKelurahan() {
        return inputKelurahan;
    }
    
    public void setInputKelurahan(JTextField inputKelurahan) {
        this.inputKelurahan = inputKelurahan;
    }
    
    public JTextField getInputKecamatan() {
        return inputKecamatan;
    }
    
    public void setInputKecamatan(JTextField inputKecamatan) {
        this.inputKecamatan = inputKecamatan;
    }
    
    public JTextField getInputNoRumah() {
        return inputNoRumah;
    }
    
    public void setInputNoRumah(JTextField inputNoRumah) {
        this.inputNoRumah = inputNoRumah;
    }
    
}
