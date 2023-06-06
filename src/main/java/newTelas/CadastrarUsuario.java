package newTelas;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import leafless.Acesso;
import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class CadastrarUsuario extends javax.swing.JPanel {

    public CadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setBackground(new java.awt.Color(19, 30, 53));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCadastro.setAlignment(java.awt.Label.CENTER);
        labelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(229, 229, 229));
        labelCadastro.setText("Cadastro de Usuário");
        jLayeredPane2.add(labelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(167, 36, 36));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 509, -1, -1));

        concluirCadastro.setBackground(new java.awt.Color(58, 93, 174));
        concluirCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        concluirCadastro.setForeground(new java.awt.Color(229, 229, 229));
        concluirCadastro.setText("Concluir");
        concluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirCadastroActionPerformed(evt);
            }
        });
        jLayeredPane2.add(concluirCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 509, -1, -1));

        nomeCompleto.setBackground(new java.awt.Color(35, 35, 35));
        nomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompletoActionPerformed(evt);
            }
        });

        nomeApresentacao.setBackground(new java.awt.Color(35, 35, 35));
        nomeApresentacao.setForeground(new java.awt.Color(255, 255, 255));
        nomeApresentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeApresentacaoActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(35, 35, 35));
        email.setForeground(new java.awt.Color(255, 255, 255));

        cpf.setBackground(new java.awt.Color(35, 35, 35));
        cpf.setForeground(new java.awt.Color(255, 255, 255));

        cargo.setBackground(new java.awt.Color(35, 35, 35));
        cargo.setForeground(new java.awt.Color(255, 255, 255));

        telefone.setBackground(new java.awt.Color(35, 35, 35));
        telefone.setForeground(new java.awt.Color(255, 255, 255));
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(35, 35, 35));
        username.setForeground(new java.awt.Color(255, 255, 255));

        password.setBackground(new java.awt.Color(35, 35, 35));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        confirmPass.setBackground(new java.awt.Color(35, 35, 35));
        confirmPass.setForeground(new java.awt.Color(255, 255, 255));
        confirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("*Nome Completo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 229, 229));
        jLabel2.setText("Nome Preferencial:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 229, 229));
        jLabel3.setText("*E-mail:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 229, 229));
        jLabel4.setText("*Senha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 229, 229));
        jLabel5.setText("*Confirme a Senha:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 229, 229));
        jLabel6.setText("*CPF:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 229, 229));
        jLabel7.setText("*Cargo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(229, 229, 229));
        jLabel8.setText("*Usuário/Matrícula:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username)
                    .addComponent(telefone)
                    .addComponent(cargo)
                    .addComponent(cpf)
                    .addComponent(email)
                    .addComponent(nomeApresentacao)
                    .addComponent(nomeCompleto)
                    .addComponent(password)
                    .addComponent(confirmPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(26, 26, 26)
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

        jLayeredPane2.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

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
						result = Acesso.cadastrarUsuario(usuario);

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
							"As senhas informadas não correspondem. Verifique e tente novamente!", "Cadastro",
							JOptionPane.WARNING_MESSAGE, null);
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"Um ou mais campos obrigatórios não foram preenchidos. Verifique e tente novamente!",
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
    private java.awt.Label labelCadastro;
    private javax.swing.JTextField nomeApresentacao;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
