package testeTelas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame implements ActionListener {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;

    public TelaLogin() {
        setTitle("Tela de Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));

        JLabel labelUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField(10);

        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(10);

        botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(this);

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(new JLabel());
        painel.add(botaoLogin);

        add(painel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoLogin) {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());


            // Exemplo: if (usuario.equals("admin") && senha.equals("senha123"))


            // Exemplo: new TelaPrincipal().setVisible(true);

            // Por enquanto, vamos apenas exibir uma mensagem de login com sucesso
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        });
    }
}

