package newTelas;

import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class TelaInicialAdmin extends javax.swing.JPanel {

	Usuario usuario = new Usuario();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDocumentos;
    private javax.swing.JButton buttonEntrar2;
    private javax.swing.JButton buttonEntrar4;
    private javax.swing.JButton buttonGrupos;
    private javax.swing.JButton buttonPerfil;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel imagem;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nomeCompleto;
    // End of variables declaration//GEN-END:variables

	public TelaInicialAdmin() {
		initComponents();
	}

	private void buttonPerfilActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrarActionPerformed
		VisualizarPerfil conteudoNovo = new VisualizarPerfil();
		TelaPrincipal.trocarTela(conteudoNovo.getPanelConteudo(), conteudo);
	}// GEN-LAST:event_buttonEntrarActionPerformed

	private void buttonGruposActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar1ActionPerformed

	private void buttonDocumentosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar2ActionPerformed

	private void buttonEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar3ActionPerformed

	private void buttonEntrar4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar4ActionPerformed

	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        nomeCompleto = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonPerfil = new javax.swing.JButton();
        buttonGrupos = new javax.swing.JButton();
        buttonDocumentos = new javax.swing.JButton();
        buttonEntrar2 = new javax.swing.JButton();
        buttonEntrar4 = new javax.swing.JButton();
        conteudo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(19, 30, 53));

        menu.setBackground(new java.awt.Color(58, 93, 174));

        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(229, 229, 229));
        nomeCompleto.setText(String.format("Olá, %s!", usuario.getNomeApresentacao()));
        nomeCompleto.setToolTipText("");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/do-utilizador.png"))); // NOI18N

        buttonPerfil.setBackground(new java.awt.Color(58, 93, 174));
        buttonPerfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonPerfil.setForeground(new java.awt.Color(229, 229, 229));
        buttonPerfil.setText("• Perfil");
        buttonPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerfilActionPerformed(evt);
            }
        });

        buttonGrupos.setBackground(new java.awt.Color(58, 93, 174));
        buttonGrupos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonGrupos.setForeground(new java.awt.Color(229, 229, 229));
        buttonGrupos.setText("• Ver Grupos");
        buttonGrupos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGruposActionPerformed(evt);
            }
        });

        buttonDocumentos.setBackground(new java.awt.Color(58, 93, 174));
        buttonDocumentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonDocumentos.setForeground(new java.awt.Color(229, 229, 229));
        buttonDocumentos.setText("• Consultar Documentos");
        buttonDocumentos.setToolTipText("");
        buttonDocumentos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDocumentosActionPerformed(evt);
            }
        });

        buttonEntrar2.setBackground(new java.awt.Color(58, 93, 174));
        buttonEntrar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonEntrar2.setForeground(new java.awt.Color(229, 229, 229));
        buttonEntrar2.setText("• Excluir Documento");
        buttonEntrar2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonEntrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrar2ActionPerformed(evt);
            }
        });

        buttonEntrar4.setBackground(new java.awt.Color(58, 93, 174));
        buttonEntrar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonEntrar4.setForeground(new java.awt.Color(229, 229, 229));
        buttonEntrar4.setText("• Novo Documento");
        buttonEntrar4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonEntrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrar4ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(buttonPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonGrupos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonDocumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonEntrar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonEntrar4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEntrar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDocumentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEntrar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEntrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEntrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(imagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(imagem)
                                .addGap(18, 18, 18)
                                .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(nomeCompleto))
                    .addComponent(imagem))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        conteudo.setBackground(new java.awt.Color(19, 30, 53));

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
}
