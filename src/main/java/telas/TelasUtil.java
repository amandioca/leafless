package telas;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

/**
 *
 * @author amandioca
 */
public class TelasUtil {

    // HEX das cores
    public static final String BG_AZUL_ESCURO = "#000850";
    public static final String BG_AZUL_CLARO = "#2969E6";
    private static JFrame telaAnterior;
    private static JFrame telaAtualVoltar;

    public static String formatarData(LocalDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return data.format(formatter);
    }

    public static void init(JFrame tela) {
        tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tela.getContentPane().setBackground(Color.decode(BG_AZUL_ESCURO));
    }

    public static void voltar() {
        telaAtualVoltar.setVisible(false);
        telaAnterior.setVisible(true);
        telaAtualVoltar.dispose();
    }

    public static void trocarTela(JFrame telaAtual, JFrame novaTela) {
        telaAtual.setVisible(false);
        novaTela.setVisible(true);
        telaAtual.dispose();
        //Armazenando tela anterior para utilizacao noo botao método "voltar"
        telaAnterior = telaAtual;
        telaAtualVoltar = novaTela;
    }

//        public static void trocarTela(JFrame telaAtual, JFrame novaTela) {
//        int fadeDuration = 1000; // Duração do efeito de fade em milissegundos
//        int fadeIncrement = 10; // Incremento de opacidade a cada intervalo do temporizador
//
//        telaAtual.setOpacity(1.0f); // Definir a opacidade inicial da tela atual como 1.0
//
//        javax.swing.Timer timer = new javax.swing.Timer(fadeIncrement, new ActionListener() {
//            float opacity = 1.0f;
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                opacity -= fadeIncrement / (float) fadeDuration;
//                telaAtual.setOpacity(Math.max(opacity, 0.0f));
//
//                if (opacity <= 0.0f) {
//                    ((Timer) e.getSource()).stop(); // Parar o temporizador quando a opacidade atingir 0.0
//
//                    novaTela.setOpacity(0.0f); // Definir a opacidade inicial da nova tela como zero
//
//                    Timer fadeInTimer = new Timer(fadeIncrement, new ActionListener() {
//                        float opacity = 0.0f;
//
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            opacity += fadeIncrement / (float) fadeDuration;
//                            novaTela.setOpacity(Math.min(opacity, 1.0f));
//
//                            if (opacity >= 1.0f) {
//                                ((Timer) e.getSource()).stop(); // Parar o temporizador quando a opacidade atingir 1.0
//                                novaTela.setVisible(true); // Tornar a nova tela visível após a transição
//                                telaAtual.dispose(); // Liberar os recursos da tela atual
//                            }
//                        }
//                    });
//
//                    fadeInTimer.start(); // Iniciar o temporizador para o efeito de fade-in da nova tela
//                }
//            }
//        });
//
//        timer.start(); // Iniciar o temporizador para o efeito de fade-out da tela atual
//    }
//    public static void trocarTela(JFrame novaTela, JFrame telaAtual) {
//        int fadeDuration = 1000;
//        int fadeIncrement = 10;
//
//        telaAtual.setOpacity(1.0f);
//
//        Timer timer = new Timer(fadeIncrement, new ActionListener() {
//            float opacity = 1.0f;
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                opacity += fadeIncrement / (float) fadeDuration;
//                telaAtual.setOpacity(Math.min(opacity, 0.0f));
//
//                if (opacity <= 0.0f) {
//                    ((Timer) e.getSource()).stop();
//                    novaTela.setOpacity(0.0f);
//
//                    Timer fadeInTimer = new Timer(fadeIncrement, new ActionListener() {
//                        float opacity = 0.0f;
//
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            opacity += fadeIncrement / (float) fadeDuration;
//                            novaTela.setOpacity(Math.min(opacity, 1.0f));
//                            if (opacity >= 1.0f) {
//                                ((Timer) e.getSource()).stop();
//                                novaTela.setVisible(true);
//                                telaAtual.dispose();
//
//                            }
//
//                        }
//                    });
//
//                    fadeInTimer.start();
//                }
//            }
//        });
//
//        timer.start();
//    }
}
