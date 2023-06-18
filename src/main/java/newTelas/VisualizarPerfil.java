package newTelas;

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

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane3 = new javax.swing.JLayeredPane();
        labelCadastro = new java.awt.Label();
        buttonAlterarSenha = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        imagem = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        username1 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JLabel();
        documentos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaGrupos1 = new javax.swing.JList<>();
        labelUsername1 = new javax.swing.JLabel();
        labelTelefone1 = new javax.swing.JLabel();
        labelDocumentos1 = new javax.swing.JLabel();
        labelGrupos1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(19, 30, 53));

        labelCadastro.setAlignment(java.awt.Label.CENTER);
        labelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(229, 229, 229));
        labelCadastro.setText("Perfil");

        buttonAlterarSenha.setBackground(new java.awt.Color(58, 93, 174));
        buttonAlterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAlterarSenha.setForeground(new java.awt.Color(255, 255, 255));
        buttonAlterarSenha.setLabel("Alterar Senha");
        buttonAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarSenhaActionPerformed(evt);
            }
        });

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

        username1.setBackground(new java.awt.Color(204, 204, 204));
        username1.setForeground(new java.awt.Color(204, 204, 204));
        username1.setText("monteiro");

        telefone1.setBackground(new java.awt.Color(204, 204, 204));
        telefone1.setForeground(new java.awt.Color(204, 204, 204));
        telefone1.setText("(11) 9 9999-9999");

        documentos1.setBackground(new java.awt.Color(204, 204, 204));
        documentos1.setForeground(new java.awt.Color(204, 204, 204));
        documentos1.setText("12 armazenados");

        listaGrupos1.setForeground(new java.awt.Color(204, 204, 204));
        listaGrupos1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nenhum" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaGrupos1);

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

        jLayeredPane2.setLayer(username1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(telefone1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(documentos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelUsername1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelTelefone1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelDocumentos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelGrupos1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(labelDocumentos1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(documentos1))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(labelUsername1)
                                    .addGap(56, 56, 56))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(labelTelefone1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(username1)
                                .addComponent(telefone1))))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(labelGrupos1)
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername1)
                    .addComponent(username1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone1)
                    .addComponent(labelTelefone1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumentos1)
                    .addComponent(documentos1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrupos1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jLayeredPane3.setLayer(labelCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(buttonAlterarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlterarSenha)))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(buttonAlterarSenha))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane3)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void buttonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAlterarSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonAlterarSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarSenha;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel documentos1;
    private javax.swing.JLabel imagem;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label labelCadastro;
    private javax.swing.JLabel labelDocumentos1;
    private javax.swing.JLabel labelGrupos1;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JList<String> listaGrupos1;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JLabel telefone1;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
