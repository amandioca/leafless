package newTelas;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import leafless.Acesso;
import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class AlterarSenha extends javax.swing.JFrame {

        Usuario usuario = new Usuario();
	
        public AlterarSenha() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPerfil = new java.awt.Label();
        password = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        cancelar = new javax.swing.JButton();
        concluirAlteracao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        imagem = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 30, 53));
        jPanel1.setPreferredSize(new java.awt.Dimension(445, 551));

        labelPerfil.setAlignment(java.awt.Label.CENTER);
        labelPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPerfil.setForeground(new java.awt.Color(229, 229, 229));
        labelPerfil.setText("Alteração de Senha");

        password.setBackground(new java.awt.Color(35, 35, 35));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        newPassword.setBackground(new java.awt.Color(35, 35, 35));
        newPassword.setForeground(new java.awt.Color(255, 255, 255));
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });

        confirmPass.setBackground(new java.awt.Color(35, 35, 35));
        confirmPass.setForeground(new java.awt.Color(255, 255, 255));
        confirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(167, 36, 36));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(229, 229, 229));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        concluirAlteracao.setBackground(new java.awt.Color(58, 93, 174));
        concluirAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        concluirAlteracao.setForeground(new java.awt.Color(229, 229, 229));
        concluirAlteracao.setText("Concluir");
        concluirAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					concluirAlteracaoActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 229, 229));
        jLabel5.setText("*Confirme a Senha:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 229, 229));
        jLabel4.setText("*Senha Atual:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 229, 229));
        jLabel6.setText("*Nova Senha:");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/do-utilizador.png"))); // NOI18N

        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(229, 229, 229));
        nomeCompleto.setText("Amanda Kassia de Amorim Pereira");

        cargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cargo.setForeground(new java.awt.Color(229, 229, 229));
        cargo.setText("Analista de Sistemas");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLayeredPane1.setLayer(imagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(imagem)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCompleto)
                            .addComponent(cargo)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(concluirAlteracao)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newPassword)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(concluirAlteracao))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void concluirAlteracaoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_concluirAlteracaoActionPerformed
		try {
			if (!String.valueOf(confirmPass.getPassword()).isEmpty()
					&& !String.valueOf(password.getPassword()).isEmpty()
					&& !String.valueOf(newPassword.getPassword()).isEmpty()) {
				// Verifica o usuário no banco de dados
				if (Acesso.login(usuario.getUsername(), String.valueOf(password.getPassword()))) {

					// Verifica se as senhas estão iguais
					if (String.valueOf(newPassword.getPassword()).equals(String.valueOf(confirmPass.getPassword()))) {

						// Verifica se a senha possui no mínimo 8 dígitos
						if (password.getPassword().length >= 8) {
							boolean result = Acesso.alterarSenha(usuario.getUsername(),
									String.valueOf(confirmPass.getPassword()));
							if (result) {
								JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Alteração de Senha",
										JOptionPane.INFORMATION_MESSAGE, null);
							} else {
								JOptionPane.showMessageDialog(null, "Erro ao alterar senha!", "Alteração de Senha",
										JOptionPane.ERROR_MESSAGE, null);
							}
						} else {
							JOptionPane.showMessageDialog(null,
									String.format("A senha deve possuir no mínimo 8 dígitos"), "Alteração de Senha",
									JOptionPane.WARNING_MESSAGE, null);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"As senhas informadas não correspondem. Verifique e tente novamente!",
								"Alteração de Senha", JOptionPane.WARNING_MESSAGE, null);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Usuário e/ou senha atual estão incorretos!",
							"Alteração de Senha", JOptionPane.ERROR_MESSAGE, null);
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"Um ou mais campos obrigatórios não foram preenchidos. Verifique e tente novamente!",
						"Alteração de Senha", JOptionPane.WARNING_MESSAGE, null);
			}
		} catch (SQLException e) {
			e.getMessage();
		}
	}// GEN-LAST:event_concluirAlteracaoActionPerformed

	private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelarActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cancelarActionPerformed

	private void passwordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passwordActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_passwordActionPerformed

	private void confirmPassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmPassActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_confirmPassActionPerformed

	private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newPasswordActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_newPasswordActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AlterarSenha().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cargo;
    private javax.swing.JButton concluirAlteracao;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label labelPerfil;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
