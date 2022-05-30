/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class lihatGaji extends javax.swing.JFrame {

    /**
     * Creates new form lihatGaji
     */
    public lihatGaji() {
        initComponents();
    }

    public lihatGaji(String nama) {
        initComponents();
        labelNama.setText(nama);
        pindahData();
    }
    
    
    public void pindahData(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String nama = labelNama.getText().toString().trim();
            String sql = "SELECT * FROM karyawan WHERE nama = '"+nama+"' ";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                labelUsia.setText(r.getString("Usia"));
                labelGaji.setText(r.getString("Gaji"));
            }else{
                System.out.println("Error!");
            }
            s.close();
            r.close();
        }catch(Exception e){
            System.out.println("Check error");
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelLembur = new javax.swing.JTextField();
        totalGaji = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        edit2 = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        labelUsia = new javax.swing.JLabel();
        labelGaji = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nama    :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usia       :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gaji       :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lembur :");

        labelLembur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLembur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelLemburActionPerformed(evt);
            }
        });

        totalGaji.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalGaji.setText("TOTAL GAJI");
        totalGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalGajiActionPerformed(evt);
            }
        });

        kembali.setBackground(new java.awt.Color(90, 108, 229));
        kembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        edit2.setBackground(new java.awt.Color(65, 214, 65));
        edit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit2.setText("Edit");
        edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit2ActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(228, 77, 77));
        hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelUsia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelGaji.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelUsia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelGaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(labelUsia, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelGaji, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(totalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelLemburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelLemburActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelLemburActionPerformed

    private void totalGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalGajiActionPerformed
        // TODO add your handling code here:
        String nama = labelNama.getText();
        String usia = labelUsia.getText();
        String gaji = labelGaji.getText();
        String lembur = labelLembur.getText();

        lembur a = new lembur();
        a.labelNama.setText(nama);
        a.labelUsia.setText(usia);
        a.labelGaji.setText(gaji);
        double gaji2 = Double.parseDouble(labelGaji.getText());
        double lembur2 = Double.parseDouble(labelLembur.getText());

        double TotalGaji = gaji2 + lembur2 * 25000;
        String total = String.valueOf(TotalGaji);
        a.labelLembur.setText(total);

        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_totalGajiActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        lihatKaryawan a = new lihatKaryawan();
        a.setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit2ActionPerformed
        // TODO add your handling code here:
        String Nama = labelNama.getText();
        new menuEdit(Nama).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_edit2ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        String nama = labelNama.getText();
        String usia = labelUsia.getText();
        String gaji = labelGaji.getText();
        String id = null;
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql2 = "SELECT id FROM karyawan WHERE nama = '"+nama+"'";
            ResultSet r = s.executeQuery(sql2);
            if (r.next()) {
               id = r.getString("id");
            }else{
                System.out.println("Error!");
            }
            r.close();
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            try{
                String sql = "DELETE FROM karyawan WHERE Id = '"+id+"'";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate(sql);
                p.close();
                JOptionPane.showMessageDialog(null, "Sukses menghapus data karyawan!");
            }catch(SQLException e){
                System.out.println("Error");
            }
            s.close();
        }catch(Exception e){
            System.out.println("Check error");
        }
    }//GEN-LAST:event_hapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lihatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lihatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lihatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lihatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lihatGaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit2;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel labelGaji;
    private javax.swing.JTextField labelLembur;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelUsia;
    private javax.swing.JButton totalGaji;
    // End of variables declaration//GEN-END:variables
}
