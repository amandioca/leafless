package newTelas;

import javax.swing.JPanel;

import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class VisualizarPerfil extends javax.swing.JPanel {

	Usuario usuario = new Usuario();

	public VisualizarPerfil() {
		initComponents();
	}

	private void buttonAlterarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAlterarSenha1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonAlterarSenha1ActionPerformed

	public JPanel getPanelConteudo() {
		return conteudo;
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
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
        conteudo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGrupos = new javax.swing.JList<>();
        labelPerfil1 = new java.awt.Label();
        nomeCompleto2 = new javax.swing.JLabel();
        cargo1 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JLabel();
        documentos1 = new javax.swing.JLabel();
        labelUsername1 = new javax.swing.JLabel();
        labelTelefone1 = new javax.swing.JLabel();
        labelDocumentos1 = new javax.swing.JLabel();
        labelGrupos1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        buttonAlterarSenha1 = new javax.swing.JButton();

        labelPerfil.setAlignment(java.awt.Label.CENTER);
        labelPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        labelPerfil.setText("Perfil");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/do-utilizador.png"))); // NOI18N

        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(229, 229, 229));
        nomeCompleto.setText("Wellerson Resende Monteiro");
        nomeCompleto.setToolTipText("");

        cargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cargo.setForeground(new java.awt.Color(229, 229, 229));
        cargo.setText("Analista de Sistemas");
        cargo.setToolTipText("");

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("monteiro");

        telefone.setBackground(new java.awt.Color(204, 204, 204));
        telefone.setForeground(new java.awt.Color(204, 204, 204));
        telefone.setText("(11) 9 9999-9999");

        documentos.setBackground(new java.awt.Color(204, 204, 204));
        documentos.setForeground(new java.awt.Color(204, 204, 204));
        documentos.setText("12 armazenados");

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

        jLayeredPane1.setLayer(labelPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(imagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(documentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelDocumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelGrupos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonAlterarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(imagem)
                            .addGap(18, 18, 18)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDocumentos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelGrupos, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(telefone)
                            .addComponent(documentos)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(buttonAlterarSenha)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(nomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(telefone))
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumentos)
                    .addComponent(documentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrupos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(buttonAlterarSenha)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(19, 30, 53));

        conteudo.setBackground(new java.awt.Color(19, 30, 53));

        listaGrupos.setForeground(new java.awt.Color(204, 204, 204));
        listaGrupos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nenhum" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaGrupos);

        labelPerfil1.setAlignment(java.awt.Label.CENTER);
        labelPerfil1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        labelPerfil1.setText("Perfil");

        nomeCompleto2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nomeCompleto2.setForeground(new java.awt.Color(229, 229, 229));
        nomeCompleto2.setText("Wellerson Resende Monteiro");
        nomeCompleto2.setToolTipText("");

        cargo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cargo1.setForeground(new java.awt.Color(229, 229, 229));
        cargo1.setText("Analista de Sistemas");
        cargo1.setToolTipText("");

        username1.setBackground(new java.awt.Color(204, 204, 204));
        username1.setForeground(new java.awt.Color(204, 204, 204));
        username1.setText("monteiro");

        telefone1.setBackground(new java.awt.Color(204, 204, 204));
        telefone1.setForeground(new java.awt.Color(204, 204, 204));
        telefone1.setText("(11) 9 9999-9999");

        documentos1.setBackground(new java.awt.Color(204, 204, 204));
        documentos1.setForeground(new java.awt.Color(204, 204, 204));
        documentos1.setText("12 armazenados");

        labelUsername1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelUsername1.setForeground(new java.awt.Color(229, 229, 229));
        labelUsername1.setText("Usuário/Matrícula:");

        labelTelefone1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTelefone1.setForeground(new java.awt.Color(229, 229, 229));
        labelTelefone1.setText("Tel. Comercial:");

        labelDocumentos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDocumentos1.setForeground(new java.awt.Color(229, 229, 229));
        labelDocumentos1.setText("Total de Documentos:");

        labelGrupos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelGrupos1.setForeground(new java.awt.Color(229, 229, 229));
        labelGrupos1.setText("Grupos:");

        buttonAlterarSenha1.setBackground(new java.awt.Color(0, 102, 255));
        buttonAlterarSenha1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAlterarSenha1.setForeground(new java.awt.Color(255, 255, 255));
        buttonAlterarSenha1.setLabel("Alterar Senha");
        buttonAlterarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarSenha1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cargo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeCompleto2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(conteudoLayout.createSequentialGroup()
                        .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername1)
                            .addComponent(labelTelefone1)
                            .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonAlterarSenha1)
                                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDocumentos1)
                                    .addComponent(labelGrupos1))))
                        .addGap(35, 35, 35)
                        .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username1)
                            .addComponent(telefone1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentos1))))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(nomeCompleto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargo1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername1)
                    .addComponent(username1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone1)
                    .addComponent(telefone1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumentos1)
                    .addComponent(documentos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrupos1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(buttonAlterarSenha1)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

	private void buttonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAlterarSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonAlterarSenhaActionPerformed

	private void buttonPerfilActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonPerfilActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonPerfilActionPerformed

	private void buttonGruposActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonGruposActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonGruposActionPerformed

	private void buttonEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar2ActionPerformed

	private void buttonDocumentosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonDocumentosActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonDocumentosActionPerformed

	private void buttonEntrar4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonEntrar4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonEntrar4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarSenha;
    private javax.swing.JButton buttonAlterarSenha1;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel cargo1;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel documentos;
    private javax.swing.JLabel documentos1;
    private javax.swing.JLabel imagem;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelDocumentos;
    private javax.swing.JLabel labelDocumentos1;
    private javax.swing.JLabel labelGrupos;
    private javax.swing.JLabel labelGrupos1;
    private java.awt.Label labelPerfil;
    private java.awt.Label labelPerfil1;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JList<String> listaGrupos;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JLabel nomeCompleto2;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel telefone1;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
