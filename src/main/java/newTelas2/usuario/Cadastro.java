package newTelas2.usuario;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import leafless.Acesso;
import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.decode("#000850"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        labelCadastro = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        concluirCadastro = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        nomeCompleto = new javax.swing.JTextField();
        nomeApresentacao = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 8, 80));

        jPanel1.setBackground(new java.awt.Color(0, 8, 80));

        labelCadastro.setAlignment(java.awt.Label.CENTER);
        labelCadastro.setBackground(new java.awt.Color(0, 8, 80));
        labelCadastro.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(229, 229, 229));
        labelCadastro.setText("Cadastro de Usuário");

        jButton1.setBackground(new java.awt.Color(185, 8, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        concluirCadastro.setBackground(new java.awt.Color(41, 105, 230));
        concluirCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        concluirCadastro.setForeground(new java.awt.Color(229, 229, 229));
        concluirCadastro.setText("Concluir");
        concluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirCadastroActionPerformed(evt);
            }
        });

        nomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(102, 102, 102));
        nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompletoActionPerformed(evt);
            }
        });

        nomeApresentacao.setBackground(new java.awt.Color(255, 255, 255));
        nomeApresentacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeApresentacao.setForeground(new java.awt.Color(102, 102, 102));
        nomeApresentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeApresentacaoActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));

        cpf.setBackground(new java.awt.Color(255, 255, 255));
        cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpf.setForeground(new java.awt.Color(102, 102, 102));

        cargo.setBackground(new java.awt.Color(255, 255, 255));
        cargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cargo.setForeground(new java.awt.Color(102, 102, 102));

        telefone.setBackground(new java.awt.Color(255, 255, 255));
        telefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefone.setForeground(new java.awt.Color(102, 102, 102));
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        confirmPass.setBackground(new java.awt.Color(255, 255, 255));
        confirmPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPass.setForeground(new java.awt.Color(102, 102, 102));
        confirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("*Nome Completo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 229, 229));
        jLabel2.setText("Nome Preferencial:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 229, 229));
        jLabel3.setText("*E-mail:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 229, 229));
        jLabel4.setText("*Senha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 229, 229));
        jLabel5.setText("*Confirme a Senha:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 229, 229));
        jLabel6.setText("*CPF:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 229, 229));
        jLabel7.setText("*Cargo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(229, 229, 229));
        jLabel8.setText("*Usuário/Matrícula:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 229, 229));
        jLabel9.setText("*Tel. Comercial:");

        jLayeredPane1.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeApresentacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(confirmPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefone)
                            .addComponent(cargo)
                            .addComponent(cpf)
                            .addComponent(email)
                            .addComponent(nomeApresentacao)
                            .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(confirmPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jLayeredPane2.setLayer(labelCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(concluirCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(concluirCadastro)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(concluirCadastro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(140, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void concluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirCadastroActionPerformed
        try {
            // Verifica campos obrigatórios
            if (!nomeCompleto.getText().isEmpty() && !email.getText().isEmpty() && !cargo.getText().isEmpty()
                && !telefone.getText().isEmpty() && !username.getText().isEmpty()
                && !String.valueOf(confirmPass.getPassword()).isEmpty()
                && !String.valueOf(password.getPassword()).isEmpty() && cpf.getText().isEmpty()) {

                // Verifica se senhas estão iguais
                if (String.valueOf(password.getPassword()).equals(String.valueOf(confirmPass.getPassword()))) {

                    // Verifica se a senha possui no mínimo 8 dígitos
                    if (password.getPassword().length >= 8) {
                        Usuario usuario = new Usuario(nomeCompleto.getText(), nomeApresentacao.getText(), cpf.getText(),
                            email.getText(), cargo.getText(), telefone.getText(), username.getText(),
                            String.valueOf(password.getPassword()));
                        boolean result;
                        result = Usuario.cadastrarUsuario(usuario);

                        // Verifica se o usuario foi criado ou nao
                        if (result) {
                            JOptionPane
                            .showMessageDialog(null,
                                String.format("O usuário \"%s\" foi cadastrado com sucesso!",
                                    usuario.getUsername()),
                                "Cadastro", JOptionPane.INFORMATION_MESSAGE, null);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                String.format("Erro ao criar usuário \"%s\"", usuario.getUsername()), "Cadastro",
                                JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, String.format("A senha deve possuir no mínimo 8 dígitos"),
                            "Cadastro", JOptionPane.WARNING_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                        "As senhas informadas não correspondem. \nVerifique e tente novamente!", "Cadastro",
                        JOptionPane.WARNING_MESSAGE, null);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Um ou mais campos obrigatórios não foram preenchidos. \nVerifique e tente novamente!",
                    "Cadastro", JOptionPane.WARNING_MESSAGE, null);
            }
        } catch (SQLException e) {
            if (e.getMessage().contains("username_UNIQUE")) {
                JOptionPane.showMessageDialog(null,
                    String.format("Já existe um usuário para \"%s\"", username.getText()), "Cadastro",
                    JOptionPane.WARNING_MESSAGE, null);
            } else if (e.getMessage().contains("cpf_UNIQUE")) {
                JOptionPane.showMessageDialog(null,
                    String.format("Já existe um usuário com o CPF \"%s\"", cpf.getText()), "Cadastro",
                    JOptionPane.WARNING_MESSAGE, null);
            }

        }
    }//GEN-LAST:event_concluirCadastroActionPerformed

    private void nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompletoActionPerformed

    private void nomeApresentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeApresentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeApresentacaoActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void confirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargo;
    private javax.swing.JButton concluirCadastro;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label labelCadastro;
    private javax.swing.JTextField nomeApresentacao;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
