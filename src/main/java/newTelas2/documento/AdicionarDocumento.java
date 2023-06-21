package newTelas2.documento;

import newTelas2.usuario.*;
import newTelas2.HomeAdmin;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import leafless.Acesso;
import leafless.Usuario;
import newTelas2.TelasUtil;
import newTelas2.grupo.Grupos;

public class AdicionarDocumento extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public AdicionarDocumento() {
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
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        tituloPagina = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        cancelarAcao = new javax.swing.JButton();
        concluirCadastro = new javax.swing.JButton();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        credenciais = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        dadosPessoais = new javax.swing.JLayeredPane();
        cpf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JTextField();
        nomeApresentacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        voltar = new javax.swing.JLabel();

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

        conteudo.setBackground(new java.awt.Color(0, 8, 80));
        conteudo.setForeground(new java.awt.Color(21, 56, 202));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        tituloPagina.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 255, 255));
        tituloPagina.setText("Cadastrar Usuário");

        cancelarAcao.setBackground(new java.awt.Color(185, 8, 0));
        cancelarAcao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancelarAcao.setForeground(new java.awt.Color(229, 229, 229));
        cancelarAcao.setText("Cancelar");
        cancelarAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAcaoActionPerformed(evt);
            }
        });

        concluirCadastro.setBackground(new java.awt.Color(41, 105, 230));
        concluirCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        concluirCadastro.setForeground(new java.awt.Color(229, 229, 229));
        concluirCadastro.setText("Concluir");
        concluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirCadastroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 229, 229));
        jLabel6.setText("*Confirme a Senha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 229, 229));
        jLabel5.setText("*Senha:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 229, 229));
        jLabel9.setText("*Usuário/Matrícula:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Credenciais");

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        confirmPass.setBackground(new java.awt.Color(255, 255, 255));
        confirmPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPass.setForeground(new java.awt.Color(102, 102, 102));
        confirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(41, 105, 230));
        jSeparator1.setForeground(new java.awt.Color(41, 105, 230));

        credenciais.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(confirmPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        credenciais.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout credenciaisLayout = new javax.swing.GroupLayout(credenciais);
        credenciais.setLayout(credenciaisLayout);
        credenciaisLayout.setHorizontalGroup(
            credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credenciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credenciaisLayout.createSequentialGroup()
                        .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(confirmPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(credenciaisLayout.createSequentialGroup()
                        .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        credenciaisLayout.setVerticalGroup(
            credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credenciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(credenciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        cpf.setBackground(new java.awt.Color(255, 255, 255));
        cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpf.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 229, 229));
        jLabel10.setText("*Tel. Comercial:");

        nomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        nomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(102, 102, 102));
        nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompletoActionPerformed(evt);
            }
        });

        nomeApresentacao.setBackground(new java.awt.Color(255, 255, 255));
        nomeApresentacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeApresentacao.setForeground(new java.awt.Color(102, 102, 102));
        nomeApresentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeApresentacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 229, 229));
        jLabel3.setText("Nome Preferencial:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("*Nome Completo:");

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));

        cargo.setBackground(new java.awt.Color(255, 255, 255));
        cargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cargo.setForeground(new java.awt.Color(102, 102, 102));

        telefone.setBackground(new java.awt.Color(255, 255, 255));
        telefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefone.setForeground(new java.awt.Color(102, 102, 102));
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 229, 229));
        jLabel7.setText("*CPF:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 229, 229));
        jLabel4.setText("*E-mail:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(229, 229, 229));
        jLabel8.setText("*Cargo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dados Pessoais");

        jSeparator2.setBackground(new java.awt.Color(41, 105, 230));
        jSeparator2.setForeground(new java.awt.Color(41, 105, 230));

        dadosPessoais.setLayer(cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(nomeCompleto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(nomeApresentacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(cargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dadosPessoais.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dadosPessoaisLayout = new javax.swing.GroupLayout(dadosPessoais);
        dadosPessoais.setLayout(dadosPessoaisLayout);
        dadosPessoaisLayout.setHorizontalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefone)
                            .addComponent(cargo)
                            .addComponent(cpf)
                            .addComponent(email)
                            .addComponent(nomeApresentacao)
                            .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosPessoaisLayout.setVerticalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jLayeredPane6.setLayer(credenciais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(dadosPessoais, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(credenciais)
                    .addComponent(dadosPessoais)))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(dadosPessoais)
                .addGap(71, 71, 71)
                .addComponent(credenciais)
                .addContainerGap())
        );

        jLayeredPane5.setLayer(cancelarAcao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(concluirCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(concluirCadastro)
                        .addGap(40, 40, 40)
                        .addComponent(cancelarAcao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAcao)
                    .addComponent(concluirCadastro))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tituloPagina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPagina)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPagina)
                .addGap(65, 65, 65)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane5)
                        .addContainerGap())))
        );

        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(634, Short.MAX_VALUE))
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
        TelasUtil.trocarTela(AdicionarDocumento.this, new Usuarios());
    }//GEN-LAST:event_voltarMouseClicked

    private void itemInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicio1MouseClicked
        TelasUtil.trocarTela(AdicionarDocumento.this, new HomeAdmin());
    }//GEN-LAST:event_itemInicio1MouseClicked

    private void itemGrupos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGrupos1MouseClicked
        TelasUtil.trocarTela(AdicionarDocumento.this, new Grupos());
    }//GEN-LAST:event_itemGrupos1MouseClicked

    private void itemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSair1MouseClicked
        Object[] options = {"Sair", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.logout(AdicionarDocumento.this);
        }
    }//GEN-LAST:event_itemSair1MouseClicked

    private void itemUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemUsuarios1MouseClicked
        TelasUtil.trocarTela(AdicionarDocumento.this, new Usuarios());
    }//GEN-LAST:event_itemUsuarios1MouseClicked

    private void itemEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEditarPerfilMouseClicked
        TelasUtil.trocarTela(AdicionarDocumento.this, new Perfil());
    }//GEN-LAST:event_itemEditarPerfilMouseClicked

    private void cancelarAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAcaoActionPerformed
        TelasUtil.trocarTela(AdicionarDocumento.this, new Usuarios());
    }//GEN-LAST:event_cancelarAcaoActionPerformed

    private void concluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirCadastroActionPerformed
        try {
            // Verifica campos obrigatórios
            if (!nomeCompleto.getText().isEmpty() && !email.getText().isEmpty() && !cargo.getText().isEmpty()
                    && !telefone.getText().isEmpty() && !username.getText().isEmpty()
                    && !String.valueOf(confirmPass.getPassword()).isEmpty()
                    && !String.valueOf(password.getPassword()).isEmpty() && !cpf.getText().isEmpty()) {

                // Verifica se senhas estão iguais
                if (String.valueOf(password.getPassword()).equals(String.valueOf(confirmPass.getPassword()))) {

                    // Verifica se a senha possui no mínimo 8 dígitos
                    if (password.getPassword().length >= 8) {
                        Usuario usuario = new Usuario(nomeCompleto.getText(), nomeApresentacao.getText(), cpf.getText(),
                                email.getText(), cargo.getText(), telefone.getText(), username.getText(),
                                String.valueOf(password.getPassword()));
                        boolean result;
                        result = Usuario.cadastrarUsuario(usuario);

                        // Verifica se o usuario foi criado ou nao
                        if (result) {
                            JOptionPane
                                    .showMessageDialog(null,
                                            String.format("O usuário \"%s\" foi cadastrado com sucesso!",
                                                    usuario.getUsername()),
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE, null);
                            TelasUtil.trocarTela(AdicionarDocumento.this, new Usuarios());
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    String.format("Erro ao criar usuário \"%s\". Tente novamente!", usuario.getUsername()), "Cadastro",
                                    JOptionPane.ERROR_MESSAGE, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, String.format("A senha deve possuir no mínimo 8 dígitos"),
                                "Cadastro", JOptionPane.WARNING_MESSAGE, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "As senhas informadas não correspondem. \nVerifique e tente novamente!", "Cadastro",
                            JOptionPane.WARNING_MESSAGE, null);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Um ou mais campos obrigatórios não foram preenchidos. \nVerifique e tente novamente!",
                        "Cadastro", JOptionPane.WARNING_MESSAGE, null);
            }
        } catch (SQLException e) {
            if (e.getMessage().contains("username_UNIQUE")) {
                JOptionPane.showMessageDialog(null,
                        String.format("Já existe um usuário para \"%s\"", username.getText()), "Cadastro",
                        JOptionPane.WARNING_MESSAGE, null);
            } else if (e.getMessage().contains("cpf_UNIQUE")) {
                JOptionPane.showMessageDialog(null,
                        String.format("Já existe um usuário com o CPF \"%s\"", cpf.getText()), "Cadastro",
                        JOptionPane.WARNING_MESSAGE, null);
            }

        }
    }//GEN-LAST:event_concluirCadastroActionPerformed

    private void nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompletoActionPerformed

    private void nomeApresentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeApresentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeApresentacaoActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void confirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdicionarDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarAcao;
    private javax.swing.JTextField cargo;
    private javax.swing.JButton concluirCadastro;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JPanel conteudo;
    private javax.swing.JTextField cpf;
    private javax.swing.JLayeredPane credenciais;
    private javax.swing.JLayeredPane dadosPessoais;
    private javax.swing.JTextField email;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel itemEditarPerfil;
    private javax.swing.JLabel itemGrupos1;
    private javax.swing.JLabel itemInicio1;
    private javax.swing.JLabel itemSair1;
    private javax.swing.JLabel itemUsuarios1;
    private javax.swing.JLayeredPane itens1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator linhaSeparadora;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nomeApresentacao;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel saudacaoUsuario;
    private javax.swing.JTextField telefone;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JTextField username;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
