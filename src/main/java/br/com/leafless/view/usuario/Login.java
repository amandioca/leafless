package br.com.leafless.view.usuario;

import br.com.leafless.view.HomeAdmin;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.leafless.model.Acesso;
import br.com.leafless.model.Usuario;
import br.com.leafless.view.Inicio;
import br.com.leafless.util.TelasUtil;

/**
 *
 * @author amandioca
 */
public class Login extends javax.swing.JFrame {

    private static final String ADMIN = "ADMIN";
    Usuario usuario;

    public Login() {
        initComponents();
        TelasUtil.init(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        caixaTexto = new javax.swing.JLayeredPane();
        fomulario = new javax.swing.JLayeredPane();
        username = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        labelUsuario = new javax.swing.JLabel();
        labelLogin = new java.awt.Label();
        buttonEntrar = new javax.swing.JButton();
        voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 30, 53));

        jPanel1.setBackground(new java.awt.Color(0, 8, 80));

        jPanel.setBackground(new java.awt.Color(0, 8, 80));
        jPanel.setForeground(new java.awt.Color(19, 30, 53));
        jPanel.setLayout(new javax.swing.OverlayLayout(jPanel));

        caixaTexto.setBackground(new java.awt.Color(0, 8, 80));

        fomulario.setForeground(new java.awt.Color(19, 30, 53));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        labelSenha.setBackground(new java.awt.Color(19, 30, 53));
        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(229, 229, 229));
        labelSenha.setText("Senha:");

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));

        labelUsuario.setBackground(new java.awt.Color(19, 30, 53));
        labelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(229, 229, 229));
        labelUsuario.setText("Usuário:");
        labelUsuario.setName(""); // NOI18N

        fomulario.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fomulario.setLayer(labelSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fomulario.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fomulario.setLayer(labelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fomularioLayout = new javax.swing.GroupLayout(fomulario);
        fomulario.setLayout(fomularioLayout);
        fomularioLayout.setHorizontalGroup(
            fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fomularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(labelSenha))
                .addGap(35, 35, 35)
                .addGroup(fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addGroup(fomularioLayout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        fomularioLayout.setVerticalGroup(
            fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fomularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fomularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha))
                .addContainerGap())
        );

        labelLogin.setAlignment(java.awt.Label.CENTER);
        labelLogin.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(229, 229, 229));
        labelLogin.setText("Login");

        buttonEntrar.setBackground(new java.awt.Color(41, 105, 230));
        buttonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonEntrar.setForeground(new java.awt.Color(229, 229, 229));
        buttonEntrar.setText("Entrar");
        buttonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        caixaTexto.setLayer(fomulario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        caixaTexto.setLayer(labelLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        caixaTexto.setLayer(buttonEntrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout caixaTextoLayout = new javax.swing.GroupLayout(caixaTexto);
        caixaTexto.setLayout(caixaTextoLayout);
        caixaTextoLayout.setHorizontalGroup(
            caixaTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caixaTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(caixaTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fomulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEntrar))
                .addContainerGap())
        );
        caixaTextoLayout.setVerticalGroup(
            caixaTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caixaTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(fomulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(buttonEntrar)
                .addContainerGap())
        );

        jPanel.add(caixaTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        voltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seta-esquerda.png"))); // NOI18N
        voltar.setText("   Voltar");
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(voltar)
                .addContainerGap(437, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 79, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 78, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(voltar)
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 75, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        try {
            boolean result = Usuario.login(username.getText(), String.valueOf(password.getPassword()));
            if (result) {
                usuario = new Usuario();
                JOptionPane.showMessageDialog(null,
                        String.format("Login efetuado com sucesso! \nBem-vindo(a) %s!", usuario.getNomeApresentacao()),
                        "Login", JOptionPane.INFORMATION_MESSAGE, null);

                boolean isAdmin = usuario.getGrupos().stream().anyMatch(p -> p.getNomeGrupo().contains(ADMIN));
                if (true) {
                    // Se o usuario for ADMIN
                    TelasUtil.trocarTela(Login.this, new HomeAdmin());
                } else {
                    // Se não for ADMIN
                    // ...
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha são inválidos! \nVerifique e tente novamente.",
                        "Login", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        TelasUtil.voltar();
    }//GEN-LAST:event_voltarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JLayeredPane caixaTexto;
    private javax.swing.JLayeredPane fomulario;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
