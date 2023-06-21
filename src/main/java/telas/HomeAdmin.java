package telas;

import java.awt.Font;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import leafless.Documento;
import leafless.Usuario;
import telas.Menu;
import telas.TelasUtil;
import telas.documento.AdicionarDocumento;
import telas.grupo.CriarGrupo;
import telas.grupo.Grupos;
import telas.usuario.Perfil;
import telas.usuario.Usuarios;

/**
 *
 * @author amandioca
 */
public class HomeAdmin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    private DefaultTableModel modeloTabela;
    private DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    private Documento documentoSelecionado = new Documento();

    public HomeAdmin() {
        modeloTabela = montarModel(getTodosDocumentosUsuario());
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
        jLabel1 = new javax.swing.JLabel();
        filtroTodosDocumentos = new javax.swing.JToggleButton();
        filtroMeusDocumentos = new javax.swing.JToggleButton();
        botaoRecarregar = new javax.swing.JLabel();
        botaoVisualizar = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JLabel();
        busca = new javax.swing.JTextField();
        procurarArquivo = new javax.swing.JButton();
        lupa = new javax.swing.JLabel();

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
        itemInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInicio1MouseClicked(evt);
            }
        });

        itemGrupos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemGrupos1.setForeground(new java.awt.Color(255, 255, 255));
        itemGrupos1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\grupo.png")); // NOI18N
        itemGrupos1.setText("  Grupos");
        itemGrupos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemGrupos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGrupos1MouseClicked(evt);
            }
        });

        itemSair1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemSair1.setForeground(new java.awt.Color(255, 255, 255));
        itemSair1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\sair.png")); // NOI18N
        itemSair1.setText("  Sair");
        itemSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSair1MouseClicked(evt);
            }
        });

        itemUsuarios1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        itemUsuarios1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\usuarios.png")); // NOI18N
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
        itemEditarPerfil.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\itens-menu\\editar.png")); // NOI18N
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
        tituloPagina.setText("Documentos");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\filtro.png")); // NOI18N
        jLabel1.setText("  Exibir:");

        filtroTodosDocumentos.setBackground(new java.awt.Color(41, 105, 230));
        filtroTodosDocumentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filtroTodosDocumentos.setForeground(new java.awt.Color(255, 255, 255));
        filtroTodosDocumentos.setText("Todos");
        filtroTodosDocumentos.setToolTipText("Exibir todos os documentos");
        filtroTodosDocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtroTodosDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroTodosDocumentosActionPerformed(evt);
            }
        });

        filtroMeusDocumentos.setBackground(new java.awt.Color(41, 105, 230));
        filtroMeusDocumentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filtroMeusDocumentos.setForeground(new java.awt.Color(255, 255, 255));
        filtroMeusDocumentos.setText("Meus");
        filtroMeusDocumentos.setToolTipText("Exibir todos os documentos que você é o autor");
        filtroMeusDocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtroMeusDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroMeusDocumentosActionPerformed(evt);
            }
        });

        botaoRecarregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoRecarregar.setForeground(new java.awt.Color(255, 255, 255));
        botaoRecarregar.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\recarregar.png")); // NOI18N
        botaoRecarregar.setToolTipText("Recarregar tabela");
        botaoRecarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRecarregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRecarregarMouseClicked(evt);
            }
        });

        botaoVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVisualizar.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\visualizar.png")); // NOI18N
        botaoVisualizar.setToolTipText("Visualizar documento");
        botaoVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVisualizarMouseClicked(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\excluir.png")); // NOI18N
        botaoExcluir.setToolTipText("Excluir documento");
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });

        dadosPessoais2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(filtroTodosDocumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(filtroMeusDocumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(botaoRecarregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(botaoVisualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais2.setLayer(botaoExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dadosPessoais2Layout = new javax.swing.GroupLayout(dadosPessoais2);
        dadosPessoais2.setLayout(dadosPessoais2Layout);
        dadosPessoais2Layout.setHorizontalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoais2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                    .addGroup(dadosPessoais2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(filtroTodosDocumentos)
                        .addGap(18, 18, 18)
                        .addComponent(filtroMeusDocumentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoRecarregar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir)))
                .addContainerGap())
        );
        dadosPessoais2Layout.setVerticalGroup(
            dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoais2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoRecarregar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoVisualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(dadosPessoais2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(filtroTodosDocumentos)
                        .addComponent(filtroMeusDocumentos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

        botaoAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionar.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\adicionar (2).png")); // NOI18N
        botaoAdicionar.setText("  Adicionar");
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });

        busca.setBackground(new java.awt.Color(255, 255, 255));
        busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        busca.setForeground(new java.awt.Color(102, 102, 102));
        busca.setText("Buscar por título");

        procurarArquivo.setBackground(new java.awt.Color(41, 105, 230));
        procurarArquivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        procurarArquivo.setForeground(new java.awt.Color(229, 229, 229));
        procurarArquivo.setText("Pesquisar");
        procurarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarArquivoActionPerformed(evt);
            }
        });

        lupa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lupa.setForeground(new java.awt.Color(255, 255, 255));
        lupa.setIcon(new javax.swing.ImageIcon("C:\\leafless\\shared\\resources\\documento\\lupa.png")); // NOI18N
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaMouseClicked(evt);
            }
        });

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(botaoAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(busca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(procurarArquivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lupa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAdicionar)
                        .addContainerGap(380, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(procurarArquivo)
                        .addGap(302, 302, 302))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(procurarArquivo))
                    .addComponent(lupa))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAdicionar)
                        .addGap(154, 154, 154))))
        );

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(879, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel montarModel(List<Documento> listaDocumentos) {
        if (listaDocumentos.isEmpty() || listaDocumentos == null) {
            montarModelVazia();
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Título");
        model.addColumn("Data de Inclusão");
        model.addColumn("Data de Vencimento");
        model.addColumn("Versão");
        model.addColumn("Autor");
        model.addColumn("ID");

        for (Documento documento : listaDocumentos) {
            model.addRow(new Object[]{documento.getTitulo(), TelasUtil.formatarData(documento.getDataInclusao()),
                TelasUtil.formatarData(documento.getDataVencimento()), documento.getVersao(), documento.getAutor(), documento.getId()});
        }
        return model;
    }

    private void montarModelVazia() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(" ");
        model.addRow(new Object[]{"Não há documentos para apresentar"});
    }

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        JOptionPane.showMessageDialog(null, "Você já está nessa opção do menu!", "Início",
                JOptionPane.INFORMATION_MESSAGE, null);
    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Object[] options = {"Sair", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.logout(HomeAdmin.this);
        }
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new Perfil());
    }//GEN-LAST:event_itemEditarPerfilMouseClicked

    private void filtroMeusDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroMeusDocumentosActionPerformed
        try {
            List<Documento> listaNovosDocumentos = Documento.obterListaDocumentosAutor(usuario.getId());
            DefaultTableModel novoModelo = montarModel(listaNovosDocumentos);
            jTable1.setModel(novoModelo);
        } catch (SQLException ex) {
            Logger.getLogger(HomeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_filtroMeusDocumentosActionPerformed

    private void filtroTodosDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroTodosDocumentosActionPerformed
        reloadTable();
    }//GEN-LAST:event_filtroTodosDocumentosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable table = (JTable) evt.getSource();
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int idDocumento = (int) model.getValueAt(selectedRow, 5);
            try {
                // Obtém documento através do id selecionado na tabela
                documentoSelecionado = Documento.obterDocumentoPorId(idDocumento);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void lupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMouseClicked

    }//GEN-LAST:event_lupaMouseClicked

    private void botaoVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVisualizarMouseClicked
        if (documentoSelecionado.getId() != 0) {
            try {
                Documento.abrirDocumento(documentoSelecionado.getCaminho());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um documento na tabela para visualizá-lo.", "Visualização de Documento",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_botaoVisualizarMouseClicked

    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked
        if (documentoSelecionado.getId() != 0) {
            try {
                Object[] options = {"Excluir", "Cancelar"};
                int resposta = JOptionPane.showOptionDialog(null, String.format("Tem certeza que deseja excluir o documento \"%s\"?",
                        documentoSelecionado.getTitulo()), "Exclusão de Documento", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                // Confirma a exclusão
                if (resposta == JOptionPane.YES_OPTION) {
                    // Executa query de exclusão
                    boolean resultado = Documento.excluirDocumentoPorId(documentoSelecionado.getId());
                    // Verifica o resultado
                    if (resultado) {
                        JOptionPane
                                .showMessageDialog(null,
                                        String.format("O documento \"%s\" foi excluído com sucesso!",
                                                documentoSelecionado.getTitulo()),
                                        "Exclusão de Documento", JOptionPane.INFORMATION_MESSAGE, null);
                        reloadTable();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                String.format("Erro ao excluir documento \"%s\". Tente novamente!", documentoSelecionado.getTitulo()), "Exclusão de Documento",
                                JOptionPane.ERROR_MESSAGE, null);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um documento na tabela para excluí-lo.", "Exclusão de Documento",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_botaoExcluirMouseClicked

    private void botaoRecarregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRecarregarMouseClicked
        reloadTable();
    }//GEN-LAST:event_botaoRecarregarMouseClicked

    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked
        TelasUtil.trocarTela(HomeAdmin.this, new AdicionarDocumento());
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void procurarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarArquivoActionPerformed
        try {
            List<Documento> listaNovosDocumentos = Documento.pesquisarDocumentoPorTitulo(busca.getText());
            DefaultTableModel novoModelo = montarModel(listaNovosDocumentos);
            jTable1.setModel(novoModelo);
        } catch (SQLException ex) {
            Logger.getLogger(HomeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_procurarArquivoActionPerformed

    private void reloadTable() {
        DefaultTableModel novoModelo = montarModel(getTodosDocumentosUsuario());
        jTable1.setModel(novoModelo);
    }

    private List<Documento> getTodosDocumentosUsuario() {
        try {
            List<Documento> listaDocumentos = Documento.obterListaDocumentos(usuario.getId());
            return listaDocumentos;
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
    private javax.swing.JLabel botaoAdicionar;
    private javax.swing.JLabel botaoExcluir;
    private javax.swing.JLabel botaoRecarregar;
    private javax.swing.JLabel botaoVisualizar;
    private javax.swing.JTextField busca;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLayeredPane dadosPessoais2;
    private javax.swing.JToggleButton filtroMeusDocumentos;
    private javax.swing.JToggleButton filtroTodosDocumentos;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JLabel lupa;
    private javax.swing.JPanel menu;
    private javax.swing.JButton procurarArquivo;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JLabel tituloPagina;
    // End of variables declaration//GEN-END:variables

}
