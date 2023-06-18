package newTelas2.grupo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import leafless.Grupo;
import leafless.Usuario;
import newTelas2.TelasUtil;
import newTelas2.usuario.HomeAdmin;
import newTelas2.usuario.Perfil;

public class ExcluirGrupo extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public ExcluirGrupo() {
        initComponents();
        TelasUtil.init(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        fotoPerfil = new javax.swing.JLabel();
        saudacaoUsuario = new javax.swing.JLabel();
        linhaSeparadora = new javax.swing.JSeparator();
        itens = new javax.swing.JLayeredPane();
        itemPerfil = new javax.swing.JLabel();
        itemConsultarDocs = new javax.swing.JLabel();
        itemGruposUsuarios = new javax.swing.JLabel();
        itemGruposUsuarios1 = new javax.swing.JLabel();
        conteudo = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tituloPagina = new javax.swing.JLabel();
        grupoTopico = new javax.swing.JLayeredPane();
        labelCriarGrupo = new javax.swing.JLabel();
        labelNomeGrupo = new javax.swing.JLabel();
        nomeGrupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 8, 80));

        menu.setBackground(new java.awt.Color(41, 105, 230));

        fotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\do-utilizador.png")); // NOI18N

        saudacaoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudacaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        saudacaoUsuario.setText(String.format("Olá, %s!", usuario.getNomeApresentacao())
        );

        itemPerfil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemPerfil.setForeground(new java.awt.Color(255, 255, 255));
        itemPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\perfil.png")); // NOI18N
        itemPerfil.setText("  Perfil");
        itemPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemPerfilMouseClicked(evt);
            }
        });

        itemConsultarDocs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemConsultarDocs.setForeground(new java.awt.Color(255, 255, 255));
        itemConsultarDocs.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\documento.png")); // NOI18N
        itemConsultarDocs.setText("  Consultar Documentos");
        itemConsultarDocs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConsultarDocsMouseClicked(evt);
            }
        });

        itemGruposUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGruposUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        itemGruposUsuarios.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\grupo.png")); // NOI18N
        itemGruposUsuarios.setText("  Grupos e Usuários");
        itemGruposUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGruposUsuariosMouseClicked(evt);
            }
        });

        itemGruposUsuarios1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGruposUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        itemGruposUsuarios1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\inicio.png")); // NOI18N
        itemGruposUsuarios1.setText("  Início");
        itemGruposUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGruposUsuarios1MouseClicked(evt);
            }
        });

        itens.setLayer(itemPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemConsultarDocs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemGruposUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemGruposUsuarios1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout itensLayout = new javax.swing.GroupLayout(itens);
        itens.setLayout(itensLayout);
        itensLayout.setHorizontalGroup(
            itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemGruposUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemConsultarDocs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(itemGruposUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        itensLayout.setVerticalGroup(
            itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemGruposUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemConsultarDocs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemGruposUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itens)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                        .addComponent(fotoPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(saudacaoUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(linhaSeparadora, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(fotoPerfil)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saudacaoUsuario)
                        .addGap(40, 40, 40)))
                .addComponent(linhaSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(713, Short.MAX_VALUE))
        );

        conteudo.setBackground(new java.awt.Color(0, 8, 80));
        conteudo.setForeground(new java.awt.Color(21, 56, 202));

        tituloPagina.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 255, 255));
        tituloPagina.setText("Administração");

        labelCriarGrupo.setBackground(new java.awt.Color(19, 30, 53));
        labelCriarGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCriarGrupo.setForeground(new java.awt.Color(229, 229, 229));
        labelCriarGrupo.setText("Excluir Grupo");
        labelCriarGrupo.setName(""); // NOI18N

        labelNomeGrupo.setBackground(new java.awt.Color(19, 30, 53));
        labelNomeGrupo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelNomeGrupo.setForeground(new java.awt.Color(229, 229, 229));
        labelNomeGrupo.setText("Insira o nome do grupo:");
        labelNomeGrupo.setName(""); // NOI18N

        nomeGrupo.setBackground(new java.awt.Color(255, 255, 255));
        nomeGrupo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeGrupo.setForeground(new java.awt.Color(102, 102, 102));
        nomeGrupo.setText("Exemplo: ADMIN01");
        nomeGrupo.setToolTipText("");
        nomeGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeGrupoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(41, 105, 230));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Concluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        grupoTopico.setLayer(labelCriarGrupo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        grupoTopico.setLayer(labelNomeGrupo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        grupoTopico.setLayer(nomeGrupo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        grupoTopico.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout grupoTopicoLayout = new javax.swing.GroupLayout(grupoTopico);
        grupoTopico.setLayout(grupoTopicoLayout);
        grupoTopicoLayout.setHorizontalGroup(
            grupoTopicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoTopicoLayout.createSequentialGroup()
                .addGroup(grupoTopicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoTopicoLayout.createSequentialGroup()
                        .addComponent(labelNomeGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(nomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grupoTopicoLayout.createSequentialGroup()
                        .addGroup(grupoTopicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCriarGrupo)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        grupoTopicoLayout.setVerticalGroup(
            grupoTopicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoTopicoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelCriarGrupo)
                .addGap(52, 52, 52)
                .addGroup(grupoTopicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeGrupo)
                    .addComponent(nomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(0, 0, 0))
        );

        jLayeredPane1.setLayer(tituloPagina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(grupoTopico, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPagina)
                    .addComponent(grupoTopico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addGap(65, 65, 65)
                .addComponent(grupoTopico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        voltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\seta-esquerda.png")); // NOI18N
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(voltar)
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 209, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(conteudoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(voltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Verifica se o nome do grupo foi informado
            if (nomeGrupo.getText() != null || !nomeGrupo.getText().isEmpty()) {

                // Confirma exclusão
                int qntUsuarios = Grupo.contarUsuariosAssociadosAoGrupo(nomeGrupo.getText());
                Object[] options = {"Excluir", "Cancelar"};
                if (Grupo.verificaGrupo(nomeGrupo.getText())) {
                    int resposta = JOptionPane.showOptionDialog(null, String.format("O grupo \"%s\" possui %d usuario(s) associado(s). \nTem certeza que deseja excluí-lo?", nomeGrupo.getText(), qntUsuarios), "Exclusão de Grupo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    if (resposta == JOptionPane.YES_OPTION) {
                        // Exclui grupo
                        boolean resultado = Grupo.excluirGrupoPorNome(nomeGrupo.getText());
                        if (resultado) {
                            JOptionPane.showMessageDialog(null, String.format("O grupo \"%s\" foi excluído com sucesso!", nomeGrupo.getText()), "Exclusão de Grupo",
                                    JOptionPane.INFORMATION_MESSAGE, null);
                        } else {
                            JOptionPane.showMessageDialog(null, "Houve um erro ao excluir o grupo. \nTente novamente.", "Exclusão de Grupo",
                                    JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A ação foi cancelada!", "Exclusão de Grupo",
                                JOptionPane.INFORMATION_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, String.format("O grupo \"%s\" não foi encontrado em nossos registros. \nVerifique e tente novamente", nomeGrupo.getText()), "Exclusão de Grupo",
                            JOptionPane.INFORMATION_MESSAGE, null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Informe o nome do grupo para continuar.", "Exclusão de Grupo",
                        JOptionPane.WARNING_MESSAGE, null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExcluirGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemPerfilMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_itemPerfilMouseClicked
        TelasUtil.trocarTela(ExcluirGrupo.this, new Perfil());
    }// GEN-LAST:event_itemPerfilMouseClicked

    private void itemConsultarDocsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_itemConsultarDocsMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_itemConsultarDocsMouseClicked

    private void itemGruposUsuariosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_itemGruposUsuariosMouseClicked
        JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Administração",
                JOptionPane.INFORMATION_MESSAGE, null);
    }// GEN-LAST:event_itemGruposUsuariosMouseClicked

    private void itemGruposUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_itemGruposUsuarios1MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_itemGruposUsuarios1MouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_voltarMouseClicked
    }// GEN-LAST:event_voltarMouseClicked

    private void nomeGrupoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomeGrupoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nomeGrupoActionPerformed

    private void listaAddUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listaAddUsuariosActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_listaAddUsuariosActionPerformed

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_concluirActionPerformed
    }// GEN-LAST:event_concluirActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirGrupo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirGrupo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirGrupo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirGrupo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLayeredPane grupoTopico;
    private javax.swing.JLabel itemConsultarDocs;
    private javax.swing.JLabel itemGruposUsuarios;
    private javax.swing.JLabel itemGruposUsuarios1;
    private javax.swing.JLabel itemPerfil;
    private javax.swing.JLayeredPane itens;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel labelCriarGrupo;
    private javax.swing.JLabel labelNomeGrupo;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nomeGrupo;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
