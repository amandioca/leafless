/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package newTelas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import db.Conexao;
import leafless.Usuario;

/**
 *
 * @author amandioca
 */
public class ConsultarArquivos extends javax.swing.JPanel {

	Usuario usuario = new Usuario();

	public ConsultarArquivos() {
		initComponents();
		exibirDocumentos();
	} 

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCadastro = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDocumentos = new javax.swing.JTable();

        setBackground(new java.awt.Color(19, 30, 53));

        labelCadastro.setAlignment(java.awt.Label.CENTER);
        labelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(229, 229, 229));
        labelCadastro.setText("Consulta de Documentos");

        tabelaDocumentos.setForeground(new java.awt.Color(229, 229, 229));
        tabelaDocumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Data de Inclusao", "Caminho", "Temporalidade", "Autor", "Versao", "Extensao"
            }
        ));
        jScrollPane2.setViewportView(tabelaDocumentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void exibirDocumentos() {
		try {
			Connection con = Conexao.fazConexao();
			String sql = "SELECT * FROM tb_documentos where nome_autor=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getUsername());
			ResultSet rs = ps.executeQuery();

			DefaultTableModel model = (DefaultTableModel) tabelaDocumentos.getModel();

			while (rs.next()) {
				int id = rs.getInt("id_autor");
				String titulo = rs.getString("titulo");
				String dataInclusao = rs.getString("data_inclusao");
				String autor = rs.getString("nome_autor");
				String caminho = rs.getString("caminho");
				String extensao = rs.getString("extensao");
				String versao = rs.getString("versao");
				String temporalidade = rs.getString("temporalidade");
				String permissoes = rs.getString("permissoes");

				Object[] row = { id, titulo, dataInclusao, autor, caminho, extensao, versao, temporalidade,
						permissoes };
				model.addRow(row);
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label labelCadastro;
    private javax.swing.JTable tabelaDocumentos;
    // End of variables declaration//GEN-END:variables
}
