
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/**
 *
 * @author MagicDra
 */
public class fIPLocal extends javax.swing.JInternalFrame {

    /**
     * Creates new form fIPLocal
     */
    public fIPLocal() {
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
        tbIPLocal = new javax.swing.JTextField();
        btTimIP = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        jLabel1.setText("IP cua may:");

        btTimIP.setText("Tim IP");
        btTimIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimIPActionPerformed(evt);
            }
        });

        btExit.setText("Thoat");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTimIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tbIPLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbIPLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTimIP)
                    .addComponent(btExit))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btTimIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimIPActionPerformed
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(this, "Loi" + ex.getMessage(), "Loi", JOptionPane.ERROR_MESSAGE);
        }
        byte[] ipaddr = addr.getAddress();
        String ipaddrstr = "";
        for (int i = 0; i < ipaddr.length; i++) {
            if (i > 0) {
                ipaddrstr += ".";
            }
            ipaddrstr += ipaddr[i] & 0xFF;
        }
        tbIPLocal.setText(ipaddrstr);
    }//GEN-LAST:event_btTimIPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btTimIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tbIPLocal;
    // End of variables declaration//GEN-END:variables
}