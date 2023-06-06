package newTelas;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import leafless.Acesso;
import leafless.Usuario;


/**
 *
 * @author amandioca
 */
public class Login extends javax.swing.JPanel {

	private static final String ADMIN = "ADMIN";
	Usuario usuario;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonEntrar;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JLayeredPane jLayeredPane2;
	private java.awt.Label labelLogin;
	private java.awt.Label labelSenha;
	private java.awt.Label labelUsuario;
	private javax.swing.JPasswordField password;
	private javax.swing.JTextField username;
	// End of variables declaration//GEN-END:variables

	public Login() {
		initComponents();
	}

	private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrarActionPerformed
		try {
			boolean result = Acesso.login(username.getText(), String.valueOf(password.getPassword()));
			if (result) {
				usuario = new Usuario();
				boolean isAdmin = usuario.getGrupos().stream().anyMatch(p -> p.getNomeGrupo().contains(ADMIN));
				JOptionPane.showMessageDialog(null,
						String.format("Login efetuado com sucesso! Bem-vindo(a) %s!", usuario.getNomeApresentacao()),
						"Login", JOptionPane.INFORMATION_MESSAGE, null);
				
				if (isAdmin) {
					// Se o usuario for ADMIN
					TelaInicialAdmin telaNova = new TelaInicialAdmin();
					TelaPrincipal.trocarTela(telaNova, Login.this);
				} else {
					// Se não for ADMIN
					// ...
				}
			} else {
				JOptionPane.showMessageDialog(null, "Usuário ou senha são inválidos! Verifique e tente novamente.",
						"Login", JOptionPane.ERROR_MESSAGE, null);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// GEN-LAST:event_buttonEntrarActionPerformed

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLayeredPane2 = new javax.swing.JLayeredPane();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		username = new javax.swing.JTextField();
		labelSenha = new java.awt.Label();
		password = new javax.swing.JPasswordField();
		labelUsuario = new java.awt.Label();
		labelLogin = new java.awt.Label();
		buttonEntrar = new javax.swing.JButton();

		setBackground(new java.awt.Color(19, 30, 53));
		setLayout(new javax.swing.OverlayLayout(this));

		jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));

		username.setBackground(new java.awt.Color(51, 51, 51));
		username.setForeground(new java.awt.Color(204, 204, 204));
		username.setText("amorim");
		username.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				usernameActionPerformed(evt);
			}
		});

		labelSenha.setBackground(new java.awt.Color(19, 30, 53));
		labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		labelSenha.setForeground(new java.awt.Color(229, 229, 229));
		labelSenha.setText("Senha:");

		password.setBackground(new java.awt.Color(51, 51, 51));
		password.setForeground(new java.awt.Color(204, 204, 204));
		password.setText("12345673");

		labelUsuario.setBackground(new java.awt.Color(19, 30, 53));
		labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		labelUsuario.setForeground(new java.awt.Color(229, 229, 229));
		labelUsuario.setText("Usuário:");
		labelUsuario.setName(""); // NOI18N

		jLayeredPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane1.setLayer(labelSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane1.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane1.setLayer(labelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
		jLayeredPane1.setLayout(jLayeredPane1Layout);
		jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(labelSenha, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGap(18, 18, 18)
						.addGroup(jLayeredPane1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(username).addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
										116, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jLayeredPane1Layout.setVerticalGroup(jLayeredPane1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelUsuario))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelSenha))
						.addContainerGap()));

		labelLogin.setAlignment(java.awt.Label.CENTER);
		labelLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelLogin.setForeground(new java.awt.Color(229, 229, 229));
		labelLogin.setText("Login");

		buttonEntrar.setBackground(new java.awt.Color(58, 93, 174));
		buttonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		buttonEntrar.setForeground(new java.awt.Color(229, 229, 229));
		buttonEntrar.setText("Entrar");
		buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonEntrarActionPerformed(evt);
			}
		});

		jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(labelLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(buttonEntrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
		jLayeredPane2.setLayout(jLayeredPane2Layout);
		jLayeredPane2Layout.setHorizontalGroup(jLayeredPane2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonEntrar).addComponent(jLayeredPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jLayeredPane2Layout
				.setVerticalGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jLayeredPane2Layout.createSequentialGroup().addContainerGap()
								.addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46)
								.addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46).addComponent(buttonEntrar).addContainerGap()));

		add(jLayeredPane2);
	}// </editor-fold>//GEN-END:initComponents

	private void usernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_usernameActionPerformed
}
