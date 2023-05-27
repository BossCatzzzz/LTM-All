
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MagicDra
 */
public class fMain extends javax.swing.JFrame {

    /**
     * Creates new form fMain
     */
    public fMain() {
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

        jLabel1 = new javax.swing.JLabel();
        tbFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tbChuoi = new javax.swing.JTextField();
        tbNoiDung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btDocNhiPhan = new javax.swing.JButton();
        btDocText = new javax.swing.JButton();
        btGhiText = new javax.swing.JButton();
        btGhiNhiPhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhap ten file:");

        tbFile.setText("D:\\@Magic\\testltm.txt");

        jLabel2.setText("Nhap chuoi:");

        tbNoiDung.setEditable(false);
        tbNoiDung.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setText("Noi dung file:");

        btDocNhiPhan.setText("Doc file nhi phan");
        btDocNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDocNhiPhanActionPerformed(evt);
            }
        });

        btDocText.setText("Doc file van ban");
        btDocText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDocTextActionPerformed(evt);
            }
        });

        btGhiText.setText("Ghi file van ban");
        btGhiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiTextActionPerformed(evt);
            }
        });

        btGhiNhiPhan.setText("Ghi file nhi phan");
        btGhiNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiNhiPhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbFile, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33)
                            .addComponent(tbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btDocNhiPhan, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btDocText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGhiText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGhiNhiPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGhiNhiPhan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btDocNhiPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGhiText, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btDocText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGhiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiTextActionPerformed
        try {
            FileWriter out = new FileWriter(new File(tbFile.getText()));
            out.write(tbChuoi.getText());
            out.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Loi khi chon file" + ex.getMessage(), "Loi chon file", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btGhiTextActionPerformed

    private void btGhiNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiNhiPhanActionPerformed
        byte[] a = new byte[20];
        char s[] = tbChuoi.getText().toCharArray();
        for (int i = 0; i < s.length; i++) {
            a[i] = (byte) s[i];
        }
        
        try {
            FileOutputStream out = new FileOutputStream(new File(tbFile.getText()));
            out.write(a);
            out.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Loi khi chon file" + ex.getMessage(), "Loi chon file", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex1) {
            JOptionPane.showMessageDialog(this, "Loi khi ghi file" + ex1.getMessage(), "Loi ghi file", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btGhiNhiPhanActionPerformed

    private void btDocNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDocNhiPhanActionPerformed
        byte[] a;
        File file;
        
        try {
            file = new File(tbFile.getText());
            FileInputStream in = new FileInputStream(file);
            a = new byte[in.available()];
            in.read(a);
            in.close();
            tbNoiDung.setText(new String(a));
//            tbNoiDung.setText(a[0]+"");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Loi khi chon file" + ex.getMessage(), "Loi chon file", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Loi khi doc file" + ex.getMessage(), "Loi doc file", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDocNhiPhanActionPerformed

    private void btDocTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDocTextActionPerformed
        try {
            FileReader in = new FileReader(new File(tbFile.getText()));
            StringBuffer buf = new StringBuffer();
            char a[] = new char[5];
            while (in.ready()) {
                int len = in.read(a);
                buf.append(a, 0, len);
            }
            in.close();
            tbNoiDung.setText(buf.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Loi:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDocTextActionPerformed

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
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDocNhiPhan;
    private javax.swing.JButton btDocText;
    private javax.swing.JButton btGhiNhiPhan;
    private javax.swing.JButton btGhiText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tbChuoi;
    private javax.swing.JTextField tbFile;
    private javax.swing.JTextField tbNoiDung;
    // End of variables declaration//GEN-END:variables
}
