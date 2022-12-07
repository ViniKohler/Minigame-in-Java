/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vinik
 */
public class MiniGame1 extends javax.swing.JFrame {

    /**
     * Creates new form MiniGame1
     */
    public MiniGame1() {
        initComponents();
        
        String language = System.getProperty("user.language");
        
        if ("pt".equals(language)) {
        lblMensagem.setText("Clique no botão abaixo");
        btnAcima.setText("Acima");
        } else {
            lblMensagem.setText("Click in the button bellow");
            btnAcima.setText("Above");
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

        lblMensagem = new javax.swing.JLabel();
        btnAcima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("Clique no botão abaixo");
        lblMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMensagemMouseClicked(evt);
            }
        });

        btnAcima.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAcima.setText("Acima");
        btnAcima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(btnAcima, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(40, 40, 40)
                .addComponent(btnAcima, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int rep = 0;
    
    String language = System.getProperty("user.language");
    
    private void lblMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMensagemMouseClicked
        // TODO add your handling code here:
        if (language == "pt") {
            btnAcima.setText("Abaixo");
        } else {
            btnAcima.setText("Below");
        }
        rep = 1000;
    }//GEN-LAST:event_lblMensagemMouseClicked

    private void btnAcimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcimaActionPerformed
        // TODO add your handling code here:
        rep += 1;
        if (rep >=10 & rep < 1000) {
            if (language == "pt") {
                lblMensagem.setText("Clique no botão ABAIXO");
            } else {
                lblMensagem.setText("Click in the button BELLOW");
            }
        } else {
            if (rep >=1000) {
                if (language == "pt") {
                    lblMensagem.setText("Muito bem!");
                } else {
                    lblMensagem.setText("Congratulations!");
                }
            }
        }
    }//GEN-LAST:event_btnAcimaActionPerformed

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
            java.util.logging.Logger.getLogger(MiniGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniGame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcima;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
