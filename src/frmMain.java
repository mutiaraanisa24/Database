
import com.sun.istack.internal.logging.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erma
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_siswa = new javax.swing.JPanel();
        nis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kelas = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("Form Pendaftaran Siswa SMK Telkom Malang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 100);

        t_siswa.setBackground(new java.awt.Color(204, 204, 204));

        nis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nisActionPerformed(evt);
            }
        });

        jLabel2.setText("NIS");

        jLabel3.setText("Nama");

        jk.setText("Jenis Kelamin");

        jLabel5.setText("Kelas");

        jLabel6.setText("Email");

        jLabel7.setText("Alamat");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        buttonGroup1.add(laki);
        laki.setText("Laki-laki");

        buttonGroup1.add(perempuan);
        perempuan.setText("Perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout t_siswaLayout = new javax.swing.GroupLayout(t_siswa);
        t_siswa.setLayout(t_siswaLayout);
        t_siswaLayout.setHorizontalGroup(
            t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_siswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(t_siswaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(laki)
                        .addGap(18, 18, 18)
                        .addComponent(perempuan)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(t_siswaLayout.createSequentialGroup()
                        .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(t_siswaLayout.createSequentialGroup()
                                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(t_siswaLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addGroup(t_siswaLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nis)
                                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                            .addGroup(t_siswaLayout.createSequentialGroup()
                                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(51, 51, 51)
                                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(kelas)))
                            .addGroup(t_siswaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(t_siswaLayout.createSequentialGroup()
                                .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        t_siswaLayout.setVerticalGroup(
            t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_siswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addGap(29, 29, 29)
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(t_siswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addGroup(t_siswaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(t_siswa);
        t_siswa.setBounds(10, 110, 210, 360);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 110, 430, 70);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(260, 190, 430, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ("".equals(nis.getText()) || "".equals(alamat.getText())|| "".equals(email.getText())){
        JOptionPane.showMessageDialog(this, "Harap Lengakpi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String jk = "";
            if (laki.isSelected()){
                jk =  "L";
            } else {
                jk = "P";
            }
            String SQL = "INSERT INTO t_siswa (NIS, Nama, JenisKelamin, Kelas, Email, Alamat)" + "VALUES('"+nis.getText()+"', '"+nama.getText()+"','"+jk+"', '"+kelas.getText()+"', '"+email.getText()+"', '"+alamat.getText()+"')";
      int status = KoneksiDB.execute(SQL);
      if (status == 1) {
          JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE); selectData();
      }else {
          JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
      }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE nis='"+nis+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else {
               
               JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }} else {
                    JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
                    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        nis.setText("");
        kelas.setText("");
        buttonGroup1.clearSelection();
        email.setText("");
        alamat.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_jButton4ActionPerformed
public void selectData() {
    String kolom[] = {"NIS", "Nama", "JenisKelamin", "Kelas", "Email", "Alamat"}
    DefaultTableModel dtm = new DefaultTableModel(null, kolom);
    String SQL = "SELECT * FROM t_siswa";
    ResultSet rs = KoneksiDB.executeQuery(SQL);
    try{
        while(rs.next()) {
            String nis = rs.getString(1);
            String nama = rs.getString(2);
            String jk = "";
            if ("L".equals (rs.getString(3))) {
                jk = "Laki-laki";
            } else {
                jk = "Perempuan";
            }
            String kelas = rs.getString(4);
            String email = rs.getString(5);
            String alamat = rs.getString(6);
            String data[] = {NIS, Nama, JenisKelamin, Kelas, Email, Alamat}
            dtm.addRow(data);
        }
   } catch (SQLException ex) {
       Logger.getLogger(frmMain.class.getname()).log(Level.SEVERE, null, ex);
   }
    tblData.setModel(dtm);
}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if ("".equals(nis.getText()) || "".equals(alamat.getText())|| "".equals(email.getText())){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String jk = "";
            if (laki.isSelected()){
                jk = "L";
         } else {jk = "P";
        }
            String SQL = "UPDATE t_siswa SET"
                    + "WHERE Nama='"+nama.getText()+"',"+"WHERE JenisKelamin='"+jk+"'"
                    + "WHERE Kelas='"+kelas.getText()+"',"+"WHERE email='"+email.getText()+"'"
                    + "WHERE Alamat='"+alamat.getText()+"'"
                    + "WHERE NIS='"+nis.getText()+"'";
            int status = koneksiDB.execute(SQL);
            if(status == 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            nis.setText(tblData.getValueAt(baris, 0).toString());
            nama.setText(tblData.getValueAt(baris, 1).toString());
            if ("Laki-laki".equals(tblData.getValueAt(baris, 2).toString())){
                laki.setSelected(true);
            }else{
                perempuan.setSelected(true);
            }
            kelas.setText(tblData.getValueAt(baris, 3).toString());
            email.setText(tblData.getValueAt(baris, 4).toString());
            alamat.setText(tblData.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jk;
    private javax.swing.JTextField kelas;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JPanel t_siswa;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
