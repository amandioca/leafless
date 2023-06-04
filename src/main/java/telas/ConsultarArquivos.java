package telas;

import db.Conexao;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarArquivos extends javax.swing.JFrame {

	private JTable tabelaDocumentos;

	/**
	 * Creates new form ConsultaArquivos
	 */
	public ConsultarArquivos() {
		initComponents();
		criarTabela();
		exibirDocumentos();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Seus arquivos atuais:");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "Título", "Data de Inclusão", "Autor", "Caminho", "Extensão", "Versão", "Temporalidade",
				"Permissões" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap().addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(15, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void criarTabela() {
		tabelaDocumentos = jTable1;
	}

	private void exibirDocumentos() {
		try {

			Connection con = Conexao.fazConexao();
			String sql = "SELECT * FROM tb_documentos where nome_autor=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, TelaLoggin.naofazer);
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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		System.out.println("agora");
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ConsultarArquivos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ConsultarArquivos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ConsultarArquivos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ConsultarArquivos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ConsultarArquivos().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration
}
