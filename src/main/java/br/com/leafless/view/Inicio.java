package br.com.leafless.view;

import br.com.leafless.util.TelasUtil;
import br.com.leafless.view.usuario.Login;

/**
 *
 * @author amandioca
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        TelasUtil.init(Inicio.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        buttonFazerLogin = new javax.swing.JButton();
        logotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(0, 8, 80));
        painel.setForeground(new java.awt.Color(229, 229, 229));
        painel.setLayout(new javax.swing.OverlayLayout(painel));

        buttonFazerLogin.setBackground(new java.awt.Color(41, 105, 230));
        buttonFazerLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonFazerLogin.setForeground(new java.awt.Color(229, 229, 229));
        buttonFazerLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFazerLogin.setLabel("Fazer Login");
        buttonFazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFazerLoginActionPerformed(evt);
            }
        });

        logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logotipo-leafless.png"))); // NOI18N

        jLayeredPane2.setLayer(buttonFazerLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(logotipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonFazerLogin)
                    .addComponent(logotipo))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logotipo)
                .addGap(40, 40, 40)
                .addComponent(buttonFazerLogin)
                .addGap(50, 50, 50))
        );

        painel.add(jLayeredPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFazerLoginActionPerformed
        TelasUtil.trocarTela(Inicio.this, new Login());
    }//GEN-LAST:event_buttonFazerLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFazerLogin;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
