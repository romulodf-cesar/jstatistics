import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Random;

public class App {
    private static int pontuacao = 0;

    public static void main(String[] args) {
        // Boas-vindas
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStatistics", 
                "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            // Menu principal
            String opcaoStr = JOptionPane.showInputDialog(null, 
                    "Vamos começar o Jogo? \n Escolha a estratégia: \n 1- Populacional \n 2- Amostral \n 3- Sair");
            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Usa switch para processar a escolha
            switch (opcao) {
                case 1:
                    jogar("Populacional");
                    break;
                case 2:
                    jogar("Amostral");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar! Pontuação final: " + pontuacao, 
                            "Sair", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha 1, 2 ou 3.", 
                            "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private static void jogar(String estrategia) {
        // Escolha do tipo de variável
        String[] tipos = {"1- Quantitativa", "2- Qualitativa"};
        String opcaoVariavel = (String) JOptionPane.showInputDialog(null, 
                "Que tipo de variável deseja cadastrar:\n" + tipos[0] + "\n" + tipos[1], 
                "JStatistics - " + estrategia, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
        int opVariavel = Integer.parseInt(opcaoVariavel.split("-")[0].trim());

        // Usa if-else encadeado para processar o tipo de variável
        if (opVariavel == 1) {
            perguntarQuantitativa(estrategia);
        } else if (opVariavel == 2) {
            perguntarQualitativa(estrategia);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de variável inválido!", 
                    "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void perguntarQuantitativa(String estrategia) {
        Random random = new Random();
        // Gera 5 números aleatórios
        int[] dados = new int[5];
        for (int i = 0; i < 5; i++) {
            dados[i] = random.nextInt(50) + 1;
        }
        double mediaCorreta = Arrays.stream(dados).average().orElse(0.0);

        // Pergunta sobre média
        String respostaStr = JOptionPane.showInputDialog(null, 
                "Conjunto " + estrategia + ": Qual é a média de " + Arrays.toString(dados) + "?",
                "Pergunta - Quantitativa", JOptionPane.QUESTION_MESSAGE);
        double resposta;
        try {
            resposta = Double.parseDouble(respostaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!", 
                    "JStatistics", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Usa if-else para verificar a resposta
        if (resposta == mediaCorreta) {
            pontuacao += 10;
            JOptionPane.showMessageDialog(null, 
                    "Correto! +10 pontos! A média é " + mediaCorreta + "\n" +
                    "Explicação: A média é a soma dos valores dividida pelo número de elementos.", 
                    "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pontuacao -= 5;
            JOptionPane.showMessageDialog(null, 
                    "Errado! -5 pontos! A média correta é " + mediaCorreta + "\n" +
                    "Explicação: A média é a soma dos valores dividida pelo número de elementos.", 
                    "Tente novamente!", JOptionPane.WARNING_MESSAGE);
        }

        // Usa operador ternário para mensagem final
        String mensagem = pontuacao >= 0 ? "Continue assim! Pontuação: " + pontuacao : 
                                        "Cuidado! Pontuação: " + pontuacao;
        JOptionPane.showMessageDialog(null, mensagem, "Progresso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void perguntarQualitativa(String estrategia) {
        // Pergunta sobre moda (exemplo de variável qualitativa)
        String[] opcoes = {"Azul", "Vermelho", "Azul", "Verde"};
        String respostaCorreta = "Azul";
        String resposta = (String) JOptionPane.showInputDialog(null, 
                "Conjunto " + estrategia + ": Qual é a cor mais frequente em " + Arrays.toString(opcoes) + "?",
                "Pergunta - Qualitativa", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        // Usa if para verificar a resposta
        if (resposta.equals(respostaCorreta)) {
            pontuacao += 10;
            JOptionPane.showMessageDialog(null, 
                    "Correto! +10 pontos! A moda é " + respostaCorreta + "\n" +
                    "Explicação: A moda é o valor que aparece mais vezes.", 
                    "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pontuacao -= 5;
            JOptionPane.showMessageDialog(null, 
                    "Errado! -5 pontos! A moda correta é " + respostaCorreta + "\n" +
                    "Explicação: A moda é o valor que aparece mais vezes.", 
                    "Tente novamente!", JOptionPane.WARNING_MESSAGE);
        }

        // Usa operador ternário para mensagem final
        String mensagem = pontuacao >= 0 ? "Continue assim! Pontuação: " + pontuacao : 
                                        "Cuidado! Pontuação: " + pontuacao;
        JOptionPane.showMessageDialog(null, mensagem, "Progresso", JOptionPane.INFORMATION_MESSAGE);
    }
}