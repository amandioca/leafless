package newTelas2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import leafless.Usuario;
import newTelas2.grupo.Grupos;
import newTelas2.usuario.Perfil;

/**
 *
 * @author amandioca
 */
public class Menu extends javax.swing.JPanel {

    private JFrame telaAtual;
    Usuario usuario;

    public Menu(JFrame tela) {
        initComponents();
        telaAtual = tela;
        usuario = new Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        fotoPerfil = new javax.swing.JLabel();
        saudacaoUsuario = new javax.swing.JLabel();
        linhaSeparadora = new javax.swing.JSeparator();
        itemEditarPerfil = new javax.swing.JLabel();
        itens = new javax.swing.JLayeredPane();
        itemInicio = new javax.swing.JLabel();
        itemGrupos = new javax.swing.JLabel();
        itemSair = new javax.swing.JLabel();
        itemUsuarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(41, 105, 230));

        jLayeredPane1.setBackground(new java.awt.Color(41, 105, 230));

        fotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\do-utilizador.png")); // NOI18N

        saudacaoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudacaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        saudacaoUsuario.setText(String.format("Olá, %s!", usuario.getNomeApresentacao())
        );

        linhaSeparadora.setBackground(new java.awt.Color(41, 105, 230));
        linhaSeparadora.setForeground(new java.awt.Color(104, 148, 236));

        itemEditarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        itemEditarPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\editar.png")); // NOI18N
        itemEditarPerfil.setText(" Editar perfil");
        itemEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemEditarPerfilMouseClicked(evt);
            }
        });

        itemInicio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemInicio.setForeground(new java.awt.Color(255, 255, 255));
        itemInicio.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\inicio.png")); // NOI18N
        itemInicio.setText("  Início");
        itemInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInicioMouseClicked(evt);
            }
        });

        itemGrupos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGrupos.setForeground(new java.awt.Color(255, 255, 255));
        itemGrupos.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\grupo.png")); // NOI18N
        itemGrupos.setText("  Grupos");
        itemGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGruposMouseClicked(evt);
            }
        });

        itemSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemSair.setForeground(new java.awt.Color(255, 255, 255));
        itemSair.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\sair.png")); // NOI18N
        itemSair.setText("  Sair");
        itemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSairMouseClicked(evt);
            }
        });

        itemUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        itemUsuarios.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\usuarios.png")); // NOI18N
        itemUsuarios.setText("  Usuários");
        itemUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemUsuariosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Administração");

        itens.setLayer(itemInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemGrupos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(itemUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout itensLayout = new javax.swing.GroupLayout(itens);
        itens.setLayout(itensLayout);
        itensLayout.setHorizontalGroup(
            itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itensLayout.createSequentialGroup()
                        .addGroup(itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(itemSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        itensLayout.setVerticalGroup(
            itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                .addComponent(itemSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setLayer(fotoPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(saudacaoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(linhaSeparadora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(itemEditarPerfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(itens, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(fotoPerfil)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(saudacaoUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(linhaSeparadora)
                    .addComponent(itens))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(saudacaoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemEditarPerfil))
                    .addComponent(fotoPerfil))
                .addGap(26, 26, 26)
                .addComponent(linhaSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicioMouseClicked
        if (!telaAtual.getClass().getSimpleName().equalsIgnoreCase("HomeAdmin")) {
            TelasUtil.trocarTela(telaAtual, new HomeAdmin());
        } else {
            JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Início",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_itemInicioMouseClicked

    private void itemGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGruposMouseClicked
        if (!telaAtual.getClass().getSimpleName().equalsIgnoreCase("Grupos")) {
            TelasUtil.trocarTela(telaAtual, new Grupos());
        } else {
            JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Grupos",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_itemGruposMouseClicked

    private void itemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSairMouseClicked

    private void itemUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemUsuariosMouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        if (!telaAtual.getClass().getSimpleName().equalsIgnoreCase("Perfil")) {
            TelasUtil.trocarTela(telaAtual, new Perfil());
        } else {
            JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Perfil",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_itemEditarPerfilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos;
    private javax.swing.JLabel itemInicio;
    private javax.swing.JLabel itemSair;
    private javax.swing.JLabel itemUsuarios;
    private javax.swing.JLayeredPane itens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JLabel saudacaoUsuario;
    // End of variables declaration//GEN-END:variables
}
