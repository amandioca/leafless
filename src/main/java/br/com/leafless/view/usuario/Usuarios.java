package br.com.leafless.view.usuario;

import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import br.com.leafless.model.Usuario;
import br.com.leafless.util.TelasUtil;
import br.com.leafless.view.HomeAdmin;
import br.com.leafless.view.grupo.Grupos;
import br.com.leafless.view.usuario.Perfil;
import br.com.leafless.view.usuario.Usuarios;

/**
 *
 * @author amandioca
 */
public class Usuarios extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    private DefaultTableModel modeloTabela;
    private DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    private Usuario usuarioSelecionado = new Usuario();

    public Usuarios() {
        modeloTabela = montarModel(getTodosUsuarios());
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
        dadosPessoais2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoAdicionar = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JLabel();
        busca = new javax.swing.JTextField();
        buscarUsuario = new javax.swing.JButton();
        lupa = new javax.swing.JLabel();
        botaoRecarregar = new javax.swing.JLabel();

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
        tituloPagina.setText("Administrar Usuários");

        jLayeredPane1.setLayer(tituloPagina, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 8, 80));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(modeloTabela);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(41, 105, 230));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setFont(new Font("Segoe UI", Font.BOLD, 18));
        for(int i = 0; i < jTable1.getColumnCount(); i++){
            jTable1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botaoAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar.png"))); // NOI18N
        botaoAdicionar.setToolTipText("Cadastrar Usuário");
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excluir.png"))); // NOI18N
        botaoExcluir.setToolTipText("Excluir documento");
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });

        dadosPessoais2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(botaoAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(botaoExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dadosPessoais2Layout = new javax.swing.GroupLayout(dadosPessoais2);
        dadosPessoais2.setLayout(dadosPessoais2Layout);
        dadosPessoais2Layout.setHorizontalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoais2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoAdicionar)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(773, Short.MAX_VALUE))
        );
        dadosPessoais2Layout.setVerticalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoais2Layout.createSequentialGroup()
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addGroup(dadosPessoais2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluir)
                        .addGap(27, 27, 27)
                        .addComponent(botaoAdicionar)))
                .addGap(85, 85, 85))
        );

        jLayeredPane6.setLayer(dadosPessoais2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosPessoais2))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadosPessoais2)
        );

        busca.setBackground(new java.awt.Color(255, 255, 255));
        busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        busca.setForeground(new java.awt.Color(102, 102, 102));
        busca.setText("Buscar por nome, username ou email");

        buscarUsuario.setBackground(new java.awt.Color(41, 105, 230));
        buscarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscarUsuario.setForeground(new java.awt.Color(229, 229, 229));
        buscarUsuario.setText("Buscar");
        buscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });

        lupa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lupa.setForeground(new java.awt.Color(255, 255, 255));
        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaMouseClicked(evt);
            }
        });

        botaoRecarregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoRecarregar.setForeground(new java.awt.Color(255, 255, 255));
        botaoRecarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/recarregar.png"))); // NOI18N
        botaoRecarregar.setToolTipText("Recarregar tabela");
        botaoRecarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRecarregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRecarregarMouseClicked(evt);
            }
        });

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(busca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(buscarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lupa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(botaoRecarregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botaoRecarregar)
                        .addGap(533, 533, 533)
                        .addComponent(lupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarUsuario)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarUsuario))
                            .addComponent(lupa)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botaoRecarregar)))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel montarModel(List<Usuario> listaUsuarios) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Cargo");
        model.addColumn("E-mail");
        model.addColumn("Username");

        for (Usuario user : listaUsuarios) {
            model.addRow(new Object[]{user.getNomeApresentacao(), user.getCargo(),
                user.getEmail(), user.getUsername()});
        }
        return model;
    }

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        TelasUtil.trocarTela(Usuarios.this, new HomeAdmin());
    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(Usuarios.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Object[] options = {"Sair", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.logout(Usuarios.this);
        }
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(Usuarios.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        TelasUtil.trocarTela(Usuarios.this, new Perfil());
    }//GEN-LAST:event_itemEditarPerfilMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable table = (JTable) evt.getSource();
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String username = (String) model.getValueAt(selectedRow, 3);
            try {
                // Obtém usuario através do username selecionado na tabela
                usuarioSelecionado = Usuario.obterUsuarioPorUsername(username);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void lupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMouseClicked

    }//GEN-LAST:event_lupaMouseClicked

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
        try {
            List<Usuario> listaUsuarios = Usuario.buscarUsuarios(busca.getText());
            DefaultTableModel novoModelo = montarModel(listaUsuarios);
            jTable1.setModel(novoModelo);

            if (listaUsuarios.get(0) == null || listaUsuarios.get(0).getUsername().isEmpty() || listaUsuarios.get(0).getUsername() == null) {
                JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado.", "Busca de Usuários",
                        JOptionPane.INFORMATION_MESSAGE, null);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked
        TelasUtil.trocarTela(Usuarios.this, new Cadastrar());
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked
        TelasUtil.trocarTela(Usuarios.this, new DeletarUsuario());
    }//GEN-LAST:event_botaoExcluirMouseClicked

    private void botaoRecarregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRecarregarMouseClicked
        reloadTable();
    }//GEN-LAST:event_botaoRecarregarMouseClicked

    private void reloadTable() {
        DefaultTableModel novoModelo = montarModel(getTodosUsuarios());
        jTable1.setModel(novoModelo);
    }

    private List<Usuario> getTodosUsuarios() {
        try {
            List<Usuario> listaUsuarios = Usuario.getTodosUsuarios();
            return listaUsuarios;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoAdicionar;
    private javax.swing.JLabel botaoExcluir;
    private javax.swing.JLabel botaoRecarregar;
    private javax.swing.JTextField busca;
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLayeredPane dadosPessoais2;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JLabel tituloPagina;
    // End of variables declaration//GEN-END:variables

}
