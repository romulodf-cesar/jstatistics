import javax.swing.JOptionPane;
import java.util.Arrays;

public class Gabarito {
    private static int pontuacao = 0;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao JStatistics!");
        while (true) {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "JStatistics\n1-Populacional\n2-Amostral\n3-Sair"));
                switch (opcao) {
                    case 1:
                        jogar("Populacional");
                        break;
                    case 2:
                        jogar("Amostral");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Fim! Pontuação final: " + pontuacao);
                        return;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Média: Soma ÷ número de elementos");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
                String mensagem = pontuacao >= 0 ? "Continue assim! Pontos: " + pontuacao : "Cuidado! Pontos: " + pontuacao;
                JOptionPane.showMessageDialog(null, mensagem);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }

    private static void jogar(String estrategia) {
        try {
            int opVariavel = Integer.parseInt(JOptionPane.showInputDialog(
                "Variável:\n1-Quantitativa\n2-Qualitativa"));
            if (opVariavel == 1) {
                perguntarQuantitativa(estrategia);
            } else if (opVariavel == 2) {
                perguntarQualitativa(estrategia);
            } else {
                JOptionPane.showMessageDialog(null, "Tipo inválido!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    }

    private static void perguntarQuantitativa(String estrategia) {
        int[] dados = {10, 20, 30, 40, 50};
        double mediaCorreta = 30.0;
        try {
            double resposta = Double.parseDouble(JOptionPane.showInputDialog(
                "Média de " + Arrays.toString(dados) + "?"));
            if (Math.abs(resposta - mediaCorreta) < 5) {
                pontuacao += 5;
                JOptionPane.showMessageDialog(null, "Quase! +5 pontos!");
            } else if (resposta == mediaCorreta) {
                pontuacao += 10;
                JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
            } else {
                pontuacao -= 5;
                JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
            pontuacao -= 5;
        }
    }

    private static void perguntarQualitativa(String estrategia) {
        String[] cores = {"Azul", "Vermelho", "Azul"};
        String resposta = JOptionPane.showInputDialog("Moda de " + Arrays.toString(cores) + "?");
        if (resposta != null && resposta.equalsIgnoreCase("Azul")) {
            pontuacao += 10;
            JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
        } else {
            pontuacao -= 5;
            JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
        }
    }

    private static void perguntarMediana() {
        int[] dados = {5, 10, 15, 20, 25};
        Arrays.sort(dados);
        double mediana = dados[2]; // 15.0
        try {
            double resposta = Double.parseDouble(JOptionPane.showInputDialog(
                "Mediana de " + Arrays.toString(dados) + "?"));
            if (resposta == mediana) {
                pontuacao += 10;
                JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
            } else {
                pontuacao -= 5;
                JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
            pontuacao -= 5;
        }
    }
}