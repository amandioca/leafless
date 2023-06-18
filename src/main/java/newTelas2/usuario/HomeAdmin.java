package newTelas2.usuario;

import javax.swing.JOptionPane;
import leafless.Usuario;
import newTelas2.Menu;
import newTelas2.TelasUtil;
import newTelas2.grupo.Grupos;

/**
 *
 * @author amandioca
 */
public class HomeAdmin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public HomeAdmin() {
        initComponents();
        TelasUtil.init(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        fotoPerfil = new javax.swing.JLabel();
        saudacaoUsuario = new javax.swing.JLabel();
        linhaSeparadora = new javax.swing.JSeparator();
        itens1 = new javax.swing.JLayeredPane();
        itemInicio1 = new javax.swing.JLabel();
        itemGrupos1 = new javax.swing.JLabel();
        itemSair1 = new javax.swing.JLabel();
        itemUsuarios1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemEditarPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 8, 80));

        menu.setBackground(new java.awt.Color(41, 105, 230));

        fotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\do-utilizador.png")); // NOI18N

        saudacaoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudacaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        saudacaoUsuario.setText(String.format("Olá, %s!", usuario.getNomeApresentacao())
        );

        linhaSeparadora.setBackground(new java.awt.Color(41, 105, 230));
        linhaSeparadora.setForeground(new java.awt.Color(104, 148, 236));

        itemInicio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemInicio1.setForeground(new java.awt.Color(255, 255, 255));
        itemInicio1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\inicio.png")); // NOI18N
        itemInicio1.setText("  Início");
        itemInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInicio1MouseClicked(evt);
            }
        });

        itemGrupos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGrupos1.setForeground(new java.awt.Color(255, 255, 255));
        itemGrupos1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\grupo.png")); // NOI18N
        itemGrupos1.setText("  Grupos");
        itemGrupos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGrupos1MouseClicked(evt);
            }
        });

        itemSair1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemSair1.setForeground(new java.awt.Color(255, 255, 255));
        itemSair1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\sair.png")); // NOI18N
        itemSair1.setText("  Sair");
        itemSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSair1MouseClicked(evt);
            }
        });

        itemUsuarios1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        itemUsuarios1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\usuarios.png")); // NOI18N
        itemUsuarios1.setText("  Usuários");
        itemUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemUsuarios1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administração");

        itens1.setLayer(itemInicio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens1.setLayer(itemGrupos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens1.setLayer(itemSair1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens1.setLayer(itemUsuarios1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        itens1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout itens1Layout = new javax.swing.GroupLayout(itens1);
        itens1.setLayout(itens1Layout);
        itens1Layout.setHorizontalGroup(
            itens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itens1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itens1Layout.createSequentialGroup()
                        .addGroup(itens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemGrupos1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(itemSair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        itens1Layout.setVerticalGroup(
            itens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itens1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemGrupos1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                .addComponent(itemSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        itemEditarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        itemEditarPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\editar.png")); // NOI18N
        itemEditarPerfil.setText(" Editar perfil");
        itemEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemEditarPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(fotoPerfil)
                        .addGap(18, 18, 18)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(saudacaoUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(linhaSeparadora)
                    .addComponent(itens1))
                .addGap(51, 51, 51))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(saudacaoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemEditarPerfil))
                    .addComponent(fotoPerfil))
                .addGap(26, 26, 26)
                .addComponent(linhaSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itens1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Início",
                JOptionPane.INFORMATION_MESSAGE, null);

    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Usuario.logout(HomeAdmin.this);
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Perfil());
    }//GEN-LAST:event_itemEditarPerfilMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel saudacaoUsuario;
    // End of variables declaration//GEN-END:variables
}
