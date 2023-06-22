package br.com.leafless.view.usuario;

import br.com.leafless.view.HomeAdmin;
import br.com.leafless.view.grupo.Grupos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.com.leafless.model.Grupo;
import br.com.leafless.model.Usuario;
import br.com.leafless.util.TelasUtil;

public class Perfil extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public Perfil() {
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
        jLayeredPane3 = new javax.swing.JLayeredPane();
        fotoUsuario = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        labelUsuario = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelDocumentos = new javax.swing.JLabel();
        labelGrupos = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        documents = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        grupos = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        alterarSenha = new javax.swing.JButton();

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
        tituloPagina.setText("Perfil");

        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/do-utilizador.png"))); // NOI18N

        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        nomeCompleto.setText(usuario.getNomeCompleto());

        cargo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cargo.setForeground(new java.awt.Color(255, 255, 255));
        cargo.setText(usuario.getCargo());

        jLayeredPane3.setLayer(fotoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoUsuario)
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargo)
                    .addComponent(nomeCompleto))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(nomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargo))
                    .addComponent(fotoUsuario))
                .addGap(35, 35, 35))
        );

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuário/ Matrícula:");

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone.setText("Tel. Comercial:");

        labelDocumentos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelDocumentos.setForeground(new java.awt.Color(255, 255, 255));
        labelDocumentos.setText("Total de Documentos:");

        labelGrupos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelGrupos.setForeground(new java.awt.Color(255, 255, 255));
        labelGrupos.setText("Grupos:");

        username.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText(usuario.getUsername());

        documents.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        documents.setForeground(new java.awt.Color(153, 153, 153));
        documents.setText(String.format("%d documentos", usuario.getDocCriadas().size()));

        telefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telefone.setForeground(new java.awt.Color(153, 153, 153));
        telefone.setText(usuario.getTelefoneComMascara());

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jList1.setForeground(new java.awt.Color(102, 102, 102));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getGrupos();

            public int getSize() {
                return strings.length;
            }

            private String[] getGrupos() {
                String[] nomesGrupos;
                if (usuario.getGrupos().size() > 0) {
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
        grupos.setViewportView(jList1);

        jLayeredPane4.setLayer(labelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(labelTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(labelDocumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(labelGrupos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(documents, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(grupos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(labelTelefone)
                    .addComponent(labelDocumentos)
                    .addComponent(labelGrupos))
                .addGap(127, 127, 127)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(documents)
                        .addComponent(username)
                        .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(telefone))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumentos)
                    .addComponent(documents))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrupos)
                    .addComponent(grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(41, 105, 230));
        jSeparator1.setForeground(new java.awt.Color(41, 105, 230));

        jLayeredPane1.setLayer(tituloPagina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPagina)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addGap(65, 65, 65)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        alterarSenha.setBackground(new java.awt.Color(185, 8, 0));
        alterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        alterarSenha.setForeground(new java.awt.Color(229, 229, 229));
        alterarSenha.setText("Alterar Senha");
        alterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(alterarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alterarSenha)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(alterarSenha)
                .addContainerGap())
        );

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void alterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaActionPerformed
        TelasUtil.trocarTela(Perfil.this, new AlterarSenha());
    }//GEN-LAST:event_alterarSenhaActionPerformed

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        TelasUtil.trocarTela(Perfil.this, new HomeAdmin());
    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(Perfil.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Object[] options = {"Sair", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.logout(Perfil.this);
        }
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(Perfil.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Perfil",
                JOptionPane.INFORMATION_MESSAGE, null);
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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarSenha;
    private javax.swing.JLabel cargo;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel documents;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JScrollPane grupos;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDocumentos;
    private javax.swing.JLabel labelGrupos;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

}
