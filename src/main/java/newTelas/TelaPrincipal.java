package newTelas;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author amandioca
 */
public class TelaPrincipal extends javax.swing.JFrame {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonFazerLogin;
	private javax.swing.JLayeredPane jLayeredPane2;
	private javax.swing.JLabel logotipo;
	private static javax.swing.JPanel painel;
	// End of variables declaration//GEN-END:variables

	public TelaPrincipal() {
		initComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public javax.swing.JPanel getPainel() {
		return painel;
	}

	public static void trocarTela(JPanel novoConteudo, JPanel painel) {
		painel.removeAll(); // Remover todos os componentes do painel principal
		painel.add(novoConteudo); // Adicionar o novo conteúdo ao painel principal
		painel.revalidate(); // Revalidar o painel principal para atualizar a exibição
		painel.repaint(); // Repintar o painel principal para atualizar a exibição
	}

	private void buttonFazerLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonFazerLoginActionPerformed
		trocarTela(new Login(), painel);
	}// GEN-LAST:event_buttonFazerLoginActionPerformed

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		painel = new javax.swing.JPanel();
		jLayeredPane2 = new javax.swing.JLayeredPane();
		logotipo = new javax.swing.JLabel();
		buttonFazerLogin = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(229, 229, 229));

		painel.setBackground(new java.awt.Color(19, 30, 53));
		painel.setForeground(new java.awt.Color(229, 229, 229));
		painel.setLayout(new javax.swing.OverlayLayout(painel));

		logotipo.setBackground(new java.awt.Color(19, 30, 53));
		logotipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		logotipo.setForeground(new java.awt.Color(229, 229, 229));
		logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo-leafless.png"))); // NOI18N

		buttonFazerLogin.setBackground(new java.awt.Color(58, 93, 174));
		buttonFazerLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		buttonFazerLogin.setForeground(new java.awt.Color(229, 229, 229));
		buttonFazerLogin.setLabel("Fazer Login");
		buttonFazerLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonFazerLoginActionPerformed(evt);
			}
		});

		jLayeredPane2.setLayer(logotipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(buttonFazerLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
		jLayeredPane2.setLayout(jLayeredPane2Layout);
		jLayeredPane2Layout.setHorizontalGroup(jLayeredPane2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane2Layout.createSequentialGroup().addContainerGap().addGroup(jLayeredPane2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(logotipo, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jLayeredPane2Layout.createSequentialGroup().addGap(201, 201, 201)
								.addComponent(buttonFazerLogin)))
						.addContainerGap()));
		jLayeredPane2Layout
				.setVerticalGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jLayeredPane2Layout.createSequentialGroup().addContainerGap()
								.addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 319,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(68, 68, 68).addComponent(buttonFazerLogin).addContainerGap()));

		painel.add(jLayeredPane2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}
}
