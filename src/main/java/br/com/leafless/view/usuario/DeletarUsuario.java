package br.com.leafless.view.usuario;

import br.com.leafless.view.HomeAdmin;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.leafless.model.Acesso;
import br.com.leafless.model.Usuario;
import br.com.leafless.util.TelasUtil;
import br.com.leafless.view.grupo.CriarGrupo;
import br.com.leafless.view.grupo.Grupos;

public class DeletarUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public DeletarUsuario() {
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
        conteudo = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tituloPagina = new javax.swing.JLabel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        credenciais = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        senhaAdmin = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        dadosPessoais2 = new javax.swing.JLayeredPane();
        usernameExcluir = new javax.swing.JTextField();
        cpfExcluir = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        concluirCadastro = new javax.swing.JButton();
        cancelarAcao = new javax.swing.JButton();
        voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 8, 80));

        menu.setBackground(new java.awt.Color(41, 105, 230));

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/do-utilizador.png"))); // NOI18N

        saudacaoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudacaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        saudacaoUsuario.setText(String.format("Olá, %s!", usuario.getNomeApresentacao())
        );

        linhaSeparadora.setBackground(new java.awt.Color(41, 105, 230));
        linhaSeparadora.setForeground(new java.awt.Color(104, 148, 236));

        itemInicio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemInicio1.setForeground(new java.awt.Color(255, 255, 255));
        itemInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/inicio.png"))); // NOI18N
        itemInicio1.setText("  Início");
        itemInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInicio1MouseClicked(evt);
            }
        });

        itemGrupos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGrupos1.setForeground(new java.awt.Color(255, 255, 255));
        itemGrupos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/grupo.png"))); // NOI18N
        itemGrupos1.setText("  Grupos");
        itemGrupos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemGrupos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGrupos1MouseClicked(evt);
            }
        });

        itemSair1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemSair1.setForeground(new java.awt.Color(255, 255, 255));
        itemSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sair.png"))); // NOI18N
        itemSair1.setText("  Sair");
        itemSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSair1MouseClicked(evt);
            }
        });

        itemUsuarios1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        itemUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/usuarios.png"))); // NOI18N
        itemUsuarios1.setText("  Usuários");
        itemUsuarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        itemEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar.png"))); // NOI18N
        itemEditarPerfil.setText(" Editar perfil");
        itemEditarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        conteudo.setBackground(new java.awt.Color(0, 8, 80));
        conteudo.setForeground(new java.awt.Color(21, 56, 202));

        tituloPagina.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 255, 255));
        tituloPagina.setText("Deletar Usuário");

        jLayeredPane1.setLayer(tituloPagina, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addGap(229, 229, 229))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(229, 229, 229));
        jLabel16.setText("*Senha admin:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dados do Administrador");

        senhaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        senhaAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaAdmin.setForeground(new java.awt.Color(102, 102, 102));
        senhaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaAdminActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(41, 105, 230));
        jSeparator1.setForeground(new java.awt.Color(41, 105, 230));

        credenciais.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(senhaAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout credenciaisLayout = new javax.swing.GroupLayout(credenciais);
        credenciais.setLayout(credenciaisLayout);
        credenciaisLayout.setHorizontalGroup(
            credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credenciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credenciaisLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(senhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(credenciaisLayout.createSequentialGroup()
                        .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        credenciaisLayout.setVerticalGroup(
            credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credenciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        usernameExcluir.setBackground(new java.awt.Color(255, 255, 255));
        usernameExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameExcluir.setForeground(new java.awt.Color(102, 102, 102));
        usernameExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameExcluirActionPerformed(evt);
            }
        });

        cpfExcluir.setBackground(new java.awt.Color(255, 255, 255));
        cpfExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfExcluir.setForeground(new java.awt.Color(102, 102, 102));
        cpfExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfExcluirActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(229, 229, 229));
        jLabel21.setText("*CPF:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(229, 229, 229));
        jLabel22.setText("*Usuário/Matrícula:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Dados do Usuário");

        jSeparator4.setBackground(new java.awt.Color(41, 105, 230));
        jSeparator4.setForeground(new java.awt.Color(41, 105, 230));

        dadosPessoais2.setLayer(usernameExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(cpfExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dadosPessoais2Layout = new javax.swing.GroupLayout(dadosPessoais2);
        dadosPessoais2.setLayout(dadosPessoais2Layout);
        dadosPessoais2Layout.setHorizontalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoais2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoais2Layout.createSequentialGroup()
                        .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfExcluir)
                            .addComponent(usernameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosPessoais2Layout.createSequentialGroup()
                        .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosPessoais2Layout.setVerticalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoais2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        concluirCadastro.setBackground(new java.awt.Color(41, 105, 230));
        concluirCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        concluirCadastro.setForeground(new java.awt.Color(229, 229, 229));
        concluirCadastro.setText("Concluir");
        concluirCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        concluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirCadastroActionPerformed(evt);
            }
        });

        cancelarAcao.setBackground(new java.awt.Color(185, 8, 0));
        cancelarAcao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancelarAcao.setForeground(new java.awt.Color(229, 229, 229));
        cancelarAcao.setText("Cancelar");
        cancelarAcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAcaoActionPerformed(evt);
            }
        });

        jLayeredPane6.setLayer(credenciais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(dadosPessoais2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(concluirCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(cancelarAcao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosPessoais2)
                    .addComponent(credenciais)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(concluirCadastro)
                        .addGap(40, 40, 40)
                        .addComponent(cancelarAcao)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(dadosPessoais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(credenciais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAcao)
                    .addComponent(concluirCadastro))
                .addContainerGap())
        );

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(jLayeredPane6))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        voltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seta-esquerda.png"))); // NOI18N
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(526, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
                .addComponent(conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        TelasUtil.voltar();
    }//GEN-LAST:event_voltarMouseClicked

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        TelasUtil.trocarTela(DeletarUsuario.this, new HomeAdmin());
    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(DeletarUsuario.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Object[] options = {"Sair", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.logout(DeletarUsuario.this);
        }
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(DeletarUsuario.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        TelasUtil.trocarTela(DeletarUsuario.this, new Perfil());
    }//GEN-LAST:event_itemEditarPerfilMouseClicked

    private void usernameExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameExcluirActionPerformed

    private void cpfExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfExcluirActionPerformed

    private void senhaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaAdminActionPerformed

    private void concluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirCadastroActionPerformed
        try {
            // Verifica campos obrigatórios
            if (!usernameExcluir.getText().isEmpty() && !cpfExcluir.getText().isEmpty() && !String.valueOf(senhaAdmin.getPassword()).isEmpty()) {

                // Verifica usuário admin
                if (Usuario.login(usuario.getUsername(), String.valueOf(senhaAdmin.getPassword()))) {

                    // Executa delete do usuário caso o username e cpf informados coincidam
                    if (Usuario.confirmarUsuario(usernameExcluir.getText(), cpfExcluir.getText())) {
                        boolean result = Usuario.deletarUsuario(usernameExcluir.getText(), cpfExcluir.getText());

                        // Verifica se o usuario foi criado ou nao
                        if (result) {
                            JOptionPane
                                    .showMessageDialog(null,
                                            String.format("O usuário \"%s\" foi deletado com sucesso!",
                                                    usernameExcluir.getText()),
                                            "Deletar Usuário", JOptionPane.INFORMATION_MESSAGE, null);
                            TelasUtil.voltar();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    String.format("Erro ao criar usuário \"%s\". Tente novamente!", usuario.getUsername()), "Deletar Usuário",
                                    JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, String.format("O Usuário e CPF informados não coincidem. \nVerifique e tente novamente"),
                                "Deletar Usuário", JOptionPane.WARNING_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Sua senha está incorreta. \nVerifique e tente novamente!", "Deletar Usuário",
                            JOptionPane.WARNING_MESSAGE, null);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Um ou mais campos obrigatórios não foram preenchidos. \nVerifique e tente novamente!",
                        "Deletar Usuário", JOptionPane.WARNING_MESSAGE, null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_concluirCadastroActionPerformed

    private void cancelarAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAcaoActionPerformed
        Object[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja cancelar a ação?", "Cancelar Exclusão Usuário", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            TelasUtil.voltar();
        }
    }//GEN-LAST:event_cancelarAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(DeletarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarAcao;
    private javax.swing.JButton concluirCadastro;
    private javax.swing.JPanel conteudo;
    private javax.swing.JTextField cpfExcluir;
    private javax.swing.JLayeredPane credenciais;
    private javax.swing.JLayeredPane dadosPessoais2;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JPasswordField senhaAdmin;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JTextField usernameExcluir;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
