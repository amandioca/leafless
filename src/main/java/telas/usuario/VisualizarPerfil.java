/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.usuario;

import leafless.Grupo;
import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class VisualizarPerfil extends javax.swing.JFrame {

	Usuario usuario;

	/**
	 * Creates new form VisualizarEditarPerfil
	 */
	public VisualizarPerfil() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		listaGrupos = new javax.swing.JList<>();
		labelPerfil = new java.awt.Label();
		imagem = new javax.swing.JLabel();
		nomeCompleto = new javax.swing.JLabel();
		cargo = new javax.swing.JLabel();
		username = new javax.swing.JLabel();
		telefone = new javax.swing.JLabel();
		documentos = new javax.swing.JLabel();
		labelUsername = new javax.swing.JLabel();
		labelTelefone = new javax.swing.JLabel();
		labelDocumentos = new javax.swing.JLabel();
		labelGrupos = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		buttonAlterarSenha = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(25, 25, 25));
		jPanel1.setForeground(new java.awt.Color(201, 201, 201));

		listaGrupos.setForeground(new java.awt.Color(204, 204, 204));
		listaGrupos.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = getGrupos();

			public int getSize() {
				return strings.length;
			}

			private String[] getGrupos() {
				String[] nomesGrupos;
				if (usuario.getGrupos().isEmpty() || usuario.getGrupos() == null || usuario.getGrupos().size() > 0) {
					nomesGrupos = new String[usuario.getGrupos().size()];

					for (int i = 0; i < usuario.getGrupos().size(); i++) {
						Grupo grupo = usuario.getGrupos().get(i);
						nomesGrupos[i] = grupo.getNomeGrupo();
					}
				} else {
					nomesGrupos = new String[] { "Nenhum" };
				}
				return nomesGrupos;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(listaGrupos);

		labelPerfil.setAlignment(java.awt.Label.CENTER);
		labelPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelPerfil.setForeground(new java.awt.Color(255, 255, 255));
		labelPerfil.setText("Perfil");

		imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/do-utilizador.png"))); // NOI18N
		nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
		nomeCompleto.setForeground(new java.awt.Color(229, 229, 229));
		nomeCompleto.setText(usuario.getNomeApresentacao());
		nomeCompleto.setToolTipText("");

		cargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		cargo.setForeground(new java.awt.Color(229, 229, 229));
		cargo.setText(usuario.getCargo());
		cargo.setToolTipText("");

		username.setBackground(new java.awt.Color(204, 204, 204));
		username.setForeground(new java.awt.Color(204, 204, 204));
		username.setText(usuario.getUsername());

		telefone.setBackground(new java.awt.Color(204, 204, 204));
		telefone.setForeground(new java.awt.Color(204, 204, 204));
		telefone.setText(usuario.getTelComercial());

		documentos.setBackground(new java.awt.Color(204, 204, 204));
		documentos.setForeground(new java.awt.Color(204, 204, 204));
		documentos.setText(usuario.getDocCriadas().size() + " armazenados");

		labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		labelUsername.setForeground(new java.awt.Color(229, 229, 229));
		labelUsername.setText("Usuário/Matrícula:");

		labelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		labelTelefone.setForeground(new java.awt.Color(229, 229, 229));
		labelTelefone.setText("Tel. Comercial:");

		labelDocumentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		labelDocumentos.setForeground(new java.awt.Color(229, 229, 229));
		labelDocumentos.setText("Total de Documentos:");

		labelGrupos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		labelGrupos.setForeground(new java.awt.Color(229, 229, 229));
		labelGrupos.setText("Grupos:");

		buttonAlterarSenha.setBackground(new java.awt.Color(0, 102, 255));
		buttonAlterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		buttonAlterarSenha.setForeground(new java.awt.Color(255, 255, 255));
		buttonAlterarSenha.setLabel("Alterar Senha");
		buttonAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonAlterarSenhaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(203, Short.MAX_VALUE)
								.addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(192, 192, 192))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jSeparator2)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(imagem).addGap(18, 18, 18)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 223,
														javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(96, 96, 96)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelDocumentos, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelGrupos, javax.swing.GroupLayout.Alignment.TRAILING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(username).addComponent(telefone)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(documentos)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(167, 167, 167)
								.addComponent(buttonAlterarSenha)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42)
								.addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(29, 29, 29)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(imagem)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8)
												.addComponent(nomeCompleto)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(cargo)))
								.addGap(18, 18, 18)
								.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(29, 29, 29)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(labelUsername).addComponent(username))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(labelTelefone).addComponent(telefone))
								.addGap(39, 39, 39)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(labelDocumentos).addComponent(documentos))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelGrupos)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91,
										Short.MAX_VALUE)
								.addComponent(buttonAlterarSenha).addGap(58, 58, 58)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void buttonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAlterarSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonAlterarSenhaActionPerformed

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
			java.util.logging.Logger.getLogger(VisualizarPerfil.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VisualizarPerfil.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VisualizarPerfil.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VisualizarPerfil.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VisualizarPerfil().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonAlterarSenha;
	private javax.swing.JLabel cargo;
	private javax.swing.JLabel documentos;
	private javax.swing.JLabel imagem;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel labelDocumentos;
	private javax.swing.JLabel labelGrupos;
	private java.awt.Label labelPerfil;
	private javax.swing.JLabel labelTelefone;
	private javax.swing.JLabel labelUsername;
	private javax.swing.JList<String> listaGrupos;
	private javax.swing.JLabel nomeCompleto;
	private javax.swing.JLabel telefone;
	private javax.swing.JLabel username;
	// End of variables declaration//GEN-END:variables
}
